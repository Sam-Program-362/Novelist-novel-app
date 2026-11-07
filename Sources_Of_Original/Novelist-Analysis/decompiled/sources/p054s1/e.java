package p054s1;

import E1.a;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f4504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f4505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f4506c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d f4507d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d f4508e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final d f4509f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final d f4510g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final d f4511h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final d f4512i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final d f4513j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final List f4514k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final List f4515l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f4516m;
    public static final Map n;

    static {
        d dVar = new d("--aot-shared-library-name=", "AOTSharedLibraryName");
        f4504a = dVar;
        d dVar2 = new d("--aot-shared-library-name=", "aot-shared-library-name", "io.flutter.embedding.engine.loader.FlutterLoader.", true);
        f4505b = dVar2;
        d dVar3 = new d("--flutter-assets-dir=", "FlutterAssetsDir");
        f4506c = dVar3;
        d dVar4 = new d("--flutter-assets-dir=", "flutter-assets-dir", "io.flutter.embedding.engine.loader.FlutterLoader.", true);
        f4507d = dVar4;
        d dVar5 = new d("--old-gen-heap-size=", "OldGenHeapSize");
        f4508e = dVar5;
        d dVar6 = new d("--enable-impeller=", "EnableImpeller");
        d dVar7 = new d("--impeller-backend=", "ImpellerBackend");
        d dVar8 = new d("--enable-dart-profiling", "EnableDartProfiling");
        d dVar9 = new d("--profile-startup", "ProfileStartup");
        d dVar10 = new d("--trace-startup", "TraceStartup");
        d dVar11 = new d("--merged-platform-ui-thread", "MergedPlatformUIThread");
        d dVar12 = new d("--vm-snapshot-data=", "VmSnapshotData");
        f4509f = dVar12;
        d dVar13 = new d("--isolate-snapshot-data=", "IsolateSnapshotData");
        f4510g = dVar13;
        d dVar14 = new d("--enable-hcpp-and-surface-control", "EnableHcpp");
        d dVar15 = new d("--enable-flutter-gpu", "EnableFlutterGPU");
        d dVar16 = new d("--impeller-lazy-shader-mode", "ImpellerLazyShaderInitialization");
        d dVar17 = new d("--impeller-antialias-lines", "ImpellerAntialiasLines");
        d dVar18 = new d("--enable-opengl-gpu-tracing", 0, "EnableOpenGLGPUTracing");
        d dVar19 = new d("--enable-vulkan-gpu-tracing", 0, "EnableVulkanGPUTracing");
        d dVar20 = new d("--skia-deterministic-rendering", 0, "SkiaDeterministicRendering");
        d dVar21 = new d("--enable-software-rendering", 0, "EnableSoftwareRendering");
        f4511h = dVar21;
        d dVar22 = new d("--use-test-fonts", 0, "UseTestFonts");
        d dVar23 = new d("--vm-service-port=", 0, "VMServicePort");
        d dVar24 = new d("--enable-vulkan-validation", 0, "EnableVulkanValidation");
        d dVar25 = new d("--test-flag", 0, "TestFlag");
        f4512i = dVar25;
        d dVar26 = new d("--leak-vm=", 0, "LeakVM");
        f4513j = dVar26;
        d dVar27 = new d("--start-paused", 0, "StartPaused");
        d dVar28 = new d("--disable-service-auth-codes", 0, "DisableServiceAuthCodes");
        d dVar29 = new d("--endless-trace-buffer", 0, "EndlessTraceBuffer");
        d dVar30 = new d("--trace-skia", 0, "TraceSkia");
        d dVar31 = new d("--trace-skia-allowlist=", 0, "TraceSkiaAllowList");
        d dVar32 = new d("--trace-systrace", 0, "TraceSystrace");
        d dVar33 = new d("--trace-to-file=", 0, "TraceToFile");
        d dVar34 = new d("--profile-microtasks", 0, "ProfileMicrotasks");
        d dVar35 = new d("--dump-skp-on-shader-compilation", 0, "DumpSkpOnShaderCompilation");
        d dVar36 = new d("--purge-persistent-cache", 0, "PurgePersistentCache");
        d dVar37 = new d("--verbose-logging", 0, "VerboseLogging");
        d dVar38 = new d("--dart-flags=", 0, "DartFlags");
        d dVar39 = new d("--no-enable-merged-platform-ui-thread", 0, "DisableMergedPlatformUIThread");
        List<d> listUnmodifiableList = Collections.unmodifiableList(Arrays.asList(dVar23, dVar22, dVar21, dVar20, dVar, dVar3, dVar6, dVar7, dVar24, dVar27, dVar28, dVar29, dVar8, dVar9, dVar30, dVar31, dVar32, dVar33, dVar34, dVar35, dVar37, dVar38, dVar11, dVar39, dVar2, dVar4, dVar5, dVar12, dVar13, dVar36, dVar10, dVar26, dVar25, dVar15, dVar16, dVar17, dVar18, dVar19, dVar14));
        f4514k = listUnmodifiableList;
        f4515l = Collections.unmodifiableList(Arrays.asList(dVar39));
        a aVar = new a();
        aVar.put(dVar2, dVar);
        aVar.put(dVar4, dVar3);
        f4516m = aVar;
        HashMap map = new HashMap(listUnmodifiableList.size());
        HashMap map2 = new HashMap(listUnmodifiableList.size());
        for (d dVar40 : listUnmodifiableList) {
            map.put(dVar40.f4501a, dVar40);
            map2.put(dVar40.f4502b, dVar40);
        }
        n = Collections.unmodifiableMap(map);
        Collections.unmodifiableMap(map2);
    }

    public static d a(String str) {
        int iIndexOf = str.indexOf(61);
        if (iIndexOf != -1) {
            str = str.substring(0, iIndexOf + 1);
        }
        d dVar = (d) n.get(str);
        d dVar2 = (d) f4516m.get(dVar);
        return dVar2 != null ? dVar2 : dVar;
    }
}
