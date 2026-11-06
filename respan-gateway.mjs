#!/usr/bin/env node
// Respan hosted gateway client for Novelist's model calls.
// Guide: https://www.respan.ai/docs/integrations/gateway/open-ai-sdk.md
// Only RESPAN_API_KEY is needed - the gateway handles provider authentication.
//
// Usage:
//   node --env-file=.env.local respan-gateway.mjs "Continue: The lighthouse blinked twice"
// Without RESPAN_API_KEY the helper reports that it is unconfigured instead of
// throwing, so the rest of the app keeps working.

const DEFAULT_BASE_URL = "https://api.respan.ai/api";
const DEFAULT_MODEL = "gpt-5.5";
const REQUEST_TIMEOUT_MS = 60_000;

export function gatewayBaseUrl() {
  return (process.env.RESPAN_BASE_URL || DEFAULT_BASE_URL).replace(/\/+$/, "");
}

export function isGatewayConfigured() {
  return Boolean(process.env.RESPAN_API_KEY);
}

/**
 * Send a chat-completions request through the Respan gateway.
 * @param {Array<{role: string, content: string}>} messages
 * @returns {Promise<{ok: true, content: string, model: string, usage?: object}
 *   | {ok: false, skipped: true, reason: string}
 *   | {ok: false, status: number, error: string}>}
 */
export async function chatCompletion(messages, options = {}) {
  const apiKey = process.env.RESPAN_API_KEY;
  if (!apiKey) {
    return { ok: false, skipped: true, reason: "RESPAN_API_KEY is not set" };
  }

  const { model = process.env.RESPAN_MODEL || DEFAULT_MODEL, metadata } = options;
  const body = { model, messages };
  if (metadata) body.metadata = metadata;

  let response;
  try {
    response = await fetch(`${gatewayBaseUrl()}/chat/completions`, {
      method: "POST",
      headers: {
        "content-type": "application/json",
        authorization: `Bearer ${apiKey}`,
      },
      body: JSON.stringify(body),
      signal: AbortSignal.timeout(REQUEST_TIMEOUT_MS),
    });
  } catch (error) {
    return { ok: false, status: 0, error: `gateway request failed: ${error.message}` };
  }

  const text = await response.text();
  if (!response.ok) {
    return { ok: false, status: response.status, error: text.slice(0, 500) };
  }

  let data;
  try {
    data = JSON.parse(text);
  } catch {
    return { ok: false, status: response.status, error: "gateway returned a non-JSON body" };
  }

  return {
    ok: true,
    content: data.choices?.[0]?.message?.content ?? "",
    model: data.model || model,
    usage: data.usage,
  };
}

/** One Novelist writing prompt, routed through the gateway. */
export async function continueStory(prompt) {
  return chatCompletion([
    { role: "system", content: "You are Novelist, a concise fiction writing assistant." },
    { role: "user", content: prompt },
  ], { metadata: { workflow: "novelist-continue" } });
}

const isMain = process.argv[1] && import.meta.url === new URL(`file://${process.argv[1]}`).href;

if (isMain) {
  const prompt = process.argv.slice(2).join(" ") || "Continue this opening line in two sentences: The lighthouse blinked twice.";
  const result = await continueStory(prompt);

  if (result.ok) {
    console.log(result.content);
  } else if (result.skipped) {
    console.log(`Respan gateway not configured (${result.reason}).`);
    console.log("Set RESPAN_API_KEY in .env.local and rerun: node --env-file=.env.local respan-gateway.mjs");
  } else {
    console.error(`Respan gateway error (status ${result.status}): ${result.error}`);
    process.exitCode = 1;
  }
}
