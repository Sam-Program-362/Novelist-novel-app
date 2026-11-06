package app.novelist.re;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.net.Uri;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import android.webkit.JsResult;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

import androidx.webkit.WebViewAssetLoader;

import org.json.JSONArray;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;

/**
 * Hosts the offline web app from the APK assets and provides the storage and
 * file dialogs it needs. The web build served by server.mjs uses the same
 * JavaScript; only the API transport differs.
 */
public class MainActivity extends Activity {
    private static final String TAG = "Novelist";
    private static final String ORIGIN = "https://appassets.androidplatform.net";
    private static final String START_URL = ORIGIN + "/index.html";
    private static final Pattern CODE = Pattern.compile("^[0-9a-f]{4,32}$");
    private static final int REQUEST_OPEN = 4001;
    private static final int REQUEST_SAVE = 4002;

    private WebView webView;
    private ValueCallback<Uri[]> fileCallback;
    private byte[] pendingBytes;
    private String pendingName;

    @Override
    protected void onCreate(Bundle state) {
        super.onCreate(state);

        if ((getApplicationInfo().flags & ApplicationInfo.FLAG_DEBUGGABLE) != 0) {
            // Debug builds only: allows `chrome://inspect` and adb CDP against the app.
            WebView.setWebContentsDebuggingEnabled(true);
        }

        webView = createWebView();
        setContentView(webView);

        if (state == null) {
            webView.loadUrl(START_URL);
        } else {
            webView.restoreState(state);
        }
    }

    private WebView createWebView() {
        WebView view = new WebView(this);
        WebSettings settings = view.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setDatabaseEnabled(true);
        settings.setAllowFileAccess(false);
        settings.setAllowContentAccess(true);
        settings.setSupportZoom(false);
        settings.setTextZoom(100);

        final WebViewAssetLoader loader = new WebViewAssetLoader.Builder()
                .addPathHandler("/", new WebViewAssetLoader.AssetsPathHandler(this))
                .build();

        view.setWebViewClient(new WebViewClient() {
            @Override
            public WebResourceResponse shouldInterceptRequest(WebView webview, WebResourceRequest request) {
                return loader.shouldInterceptRequest(request.getUrl());
            }

            @Override
            public boolean shouldOverrideUrlLoading(WebView webview, WebResourceRequest request) {
                Uri uri = request.getUrl();
                if ("appassets.androidplatform.net".equals(uri.getHost())) return false;
                try {
                    startActivity(new Intent(Intent.ACTION_VIEW, uri));
                } catch (Exception ignored) {
                    // No browser installed; nothing else to do.
                }
                return true;
            }

            /**
             * A renderer killed by the system (usually memory pressure) otherwise
             * aborts the whole app. Rebuild the view and reload the workspace instead;
             * projects are already persisted, so nothing is lost.
             */
            @Override
            public boolean onRenderProcessGone(WebView webview, RenderProcessGoneDetail detail) {
                Log.w(TAG, "renderer gone, crashed=" + detail.didCrash() + "; reloading");
                if (webview != webView) return true;
                ViewGroup parent = (ViewGroup) webview.getParent();
                if (parent != null) parent.removeView(webview);
                webview.destroy();
                webView = createWebView();
                setContentView(webView);
                webView.loadUrl(START_URL);
                Toast.makeText(MainActivity.this, "Workspace reloaded", Toast.LENGTH_SHORT).show();
                return true;
            }
        });

        view.setWebChromeClient(new WebChromeClient() {
            @Override
            public boolean onShowFileChooser(WebView webview, ValueCallback<Uri[]> callback, FileChooserParams params) {
                if (fileCallback != null) fileCallback.onReceiveValue(null);
                fileCallback = callback;
                Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
                intent.addCategory(Intent.CATEGORY_OPENABLE);
                intent.setType("*/*");
                try {
                    startActivityForResult(intent, REQUEST_OPEN);
                } catch (Exception error) {
                    fileCallback = null;
                    Toast.makeText(MainActivity.this, "No file picker available", Toast.LENGTH_SHORT).show();
                    return false;
                }
                return true;
            }

            @Override
            public boolean onJsConfirm(WebView webview, String url, String message, final JsResult result) {
                new AlertDialog.Builder(MainActivity.this)
                        .setMessage(message)
                        .setPositiveButton(android.R.string.ok, (dialog, which) -> result.confirm())
                        .setNegativeButton(android.R.string.cancel, (dialog, which) -> result.cancel())
                        .setOnCancelListener(dialog -> result.cancel())
                        .show();
                return true;
            }

            @Override
            public boolean onConsoleMessage(android.webkit.ConsoleMessage message) {
                Log.d(TAG, message.message() + " @" + message.lineNumber());
                return true;
            }
        });

        view.addJavascriptInterface(new Bridge(), "NovelistNative");
        return view;
    }

    @Override
    protected void onSaveInstanceState(Bundle out) {
        super.onSaveInstanceState(out);
        webView.saveState(out);
    }

    @Override
    protected void onDestroy() {
        if (webView != null) webView.destroy();
        super.onDestroy();
    }

    @Override
    public void onBackPressed() {
        if (webView != null && webView.canGoBack()) {
            webView.goBack();
            return;
        }
        super.onBackPressed();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == REQUEST_OPEN) {
            Uri[] uris = null;
            if (resultCode == RESULT_OK && data != null && data.getData() != null) {
                uris = new Uri[] { data.getData() };
            }
            if (fileCallback != null) {
                fileCallback.onReceiveValue(uris);
                fileCallback = null;
            }
            return;
        }

        if (requestCode == REQUEST_SAVE) {
            if (resultCode == RESULT_OK && data != null && data.getData() != null && pendingBytes != null) {
                Uri target = data.getData();
                try (OutputStream out = getContentResolver().openOutputStream(target, "wt")) {
                    out.write(pendingBytes);
                    out.flush();
                    Toast.makeText(this, "Saved " + pendingName, Toast.LENGTH_SHORT).show();
                } catch (Exception error) {
                    Log.e(TAG, "save failed", error);
                    Toast.makeText(this, "Could not save the file", Toast.LENGTH_LONG).show();
                }
            }
            pendingBytes = null;
            pendingName = null;
        }
    }

    private File projectsDir() {
        File dir = new File(getFilesDir(), "projects");
        if (!dir.exists() && !dir.mkdirs()) Log.w(TAG, "could not create projects dir");
        return dir;
    }

    private static boolean validCode(String code) {
        return code != null && CODE.matcher(code).matches();
    }

    private static byte[] readAll(File file) throws IOException {
        try (InputStream in = new FileInputStream(file)) {
            ByteArrayOutputStream out = new ByteArrayOutputStream((int) Math.max(16, file.length()));
            byte[] buffer = new byte[16 * 1024];
            int read;
            while ((read = in.read(buffer)) != -1) out.write(buffer, 0, read);
            return out.toByteArray();
        }
    }

    /** Exposed to JavaScript as `window.NovelistNative`. */
    private final class Bridge {
        @JavascriptInterface
        public boolean isNative() {
            return true;
        }

        @JavascriptInterface
        public String listCodes() {
            File[] files = projectsDir().listFiles();
            JSONArray codes = new JSONArray();
            if (files != null) {
                for (File file : files) {
                    String name = file.getName();
                    if (name.endsWith(".json")) codes.put(name.substring(0, name.length() - 5));
                }
            }
            return codes.toString();
        }

        @JavascriptInterface
        public String readProject(String code) {
            if (!validCode(code)) return null;
            File file = new File(projectsDir(), code + ".json");
            if (!file.exists()) return null;
            try {
                return new String(readAll(file), StandardCharsets.UTF_8);
            } catch (IOException error) {
                Log.e(TAG, "read failed", error);
                return null;
            }
        }

        @JavascriptInterface
        public boolean writeProject(String code, String json) {
            if (!validCode(code) || json == null) return false;
            File temp = new File(projectsDir(), code + ".json.tmp");
            File target = new File(projectsDir(), code + ".json");
            try (FileOutputStream out = new FileOutputStream(temp)) {
                out.write(json.getBytes(StandardCharsets.UTF_8));
                out.flush();
            } catch (IOException error) {
                Log.e(TAG, "write failed", error);
                return false;
            }
            if (target.exists() && !target.delete()) return false;
            return temp.renameTo(target);
        }

        @JavascriptInterface
        public boolean deleteProject(String code) {
            if (!validCode(code)) return false;
            File file = new File(projectsDir(), code + ".json");
            return !file.exists() || file.delete();
        }

        @JavascriptInterface
        public void saveExport(final String name, final String mime, final String base64) {
            runOnUiThread(() -> {
                try {
                    pendingBytes = Base64.decode(base64, Base64.DEFAULT);
                    pendingName = name;
                    Intent intent = new Intent(Intent.ACTION_CREATE_DOCUMENT);
                    intent.addCategory(Intent.CATEGORY_OPENABLE);
                    intent.setType(mime == null ? "application/octet-stream" : mime);
                    intent.putExtra(Intent.EXTRA_TITLE, name);
                    startActivityForResult(intent, REQUEST_SAVE);
                } catch (Exception error) {
                    pendingBytes = null;
                    Log.e(TAG, "export failed", error);
                    Toast.makeText(MainActivity.this, "Could not start the save dialog", Toast.LENGTH_LONG).show();
                }
            });
        }

        @JavascriptInterface
        public String appInfo() {
            return "{\"name\":\"Novelist\",\"version\":\"1.0\",\"native\":true}";
        }
    }
}
