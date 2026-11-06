/**
 * Minimal ZIP writer (stored entries, no compression).
 *
 * EPUB and ODT only require a valid ZIP container; ODF additionally requires
 * the `mimetype` entry to be first and uncompressed, which a stored writer
 * satisfies by construction. Kept dependency-free so the server can emit both
 * formats without an archive library.
 */

const CRC_TABLE = (() => {
  const table = new Uint32Array(256);
  for (let i = 0; i < 256; i += 1) {
    let c = i;
    for (let bit = 0; bit < 8; bit += 1) c = c & 1 ? 0xedb88320 ^ (c >>> 1) : c >>> 1;
    table[i] = c >>> 0;
  }
  return table;
})();

export function crc32(bytes) {
  let crc = 0xffffffff;
  for (let i = 0; i < bytes.length; i += 1) crc = CRC_TABLE[(crc ^ bytes[i]) & 0xff] ^ (crc >>> 8);
  return (crc ^ 0xffffffff) >>> 0;
}

const encoder = new TextEncoder();

function toBytes(value) {
  if (value instanceof Uint8Array) return value;
  if (value instanceof ArrayBuffer) return new Uint8Array(value);
  return encoder.encode(String(value));
}

// 2026-01-01 00:00:00 in MS-DOS date/time fields, so output is deterministic.
const DOS_TIME = 0;
const DOS_DATE = ((2026 - 1980) << 9) | (1 << 5) | 1;

class Writer {
  constructor(size) {
    this.buffer = new Uint8Array(size);
    this.view = new DataView(this.buffer.buffer);
    this.offset = 0;
  }

  u16(value) {
    this.view.setUint16(this.offset, value, true);
    this.offset += 2;
  }

  u32(value) {
    this.view.setUint32(this.offset, value >>> 0, true);
    this.offset += 4;
  }

  bytes(value) {
    this.buffer.set(value, this.offset);
    this.offset += value.length;
  }
}

/**
 * @param {Array<{name: string, data: string|Uint8Array}>} entries
 *   Order matters: ODF requires the `mimetype` entry first.
 * @returns {Uint8Array}
 */
export function createZip(entries) {
  const prepared = entries.map((entry) => {
    const data = toBytes(entry.data);
    return {
      name: encoder.encode(entry.name),
      data,
      crc: crc32(data),
      offset: 0,
    };
  });

  const localSize = prepared.reduce((sum, e) => sum + 30 + e.name.length + e.data.length, 0);
  const centralSize = prepared.reduce((sum, e) => sum + 46 + e.name.length, 0);
  const writer = new Writer(localSize + centralSize + 22);

  for (const entry of prepared) {
    entry.offset = writer.offset;
    writer.u32(0x04034b50); // local file header
    writer.u16(20); // version needed
    writer.u16(0x0800); // UTF-8 name flag
    writer.u16(0); // stored
    writer.u16(DOS_TIME);
    writer.u16(DOS_DATE);
    writer.u32(entry.crc);
    writer.u32(entry.data.length);
    writer.u32(entry.data.length);
    writer.u16(entry.name.length);
    writer.u16(0); // extra length
    writer.bytes(entry.name);
    writer.bytes(entry.data);
  }

  const centralOffset = writer.offset;
  for (const entry of prepared) {
    writer.u32(0x02014b50); // central directory header
    writer.u16(20); // version made by
    writer.u16(20); // version needed
    writer.u16(0x0800);
    writer.u16(0);
    writer.u16(DOS_TIME);
    writer.u16(DOS_DATE);
    writer.u32(entry.crc);
    writer.u32(entry.data.length);
    writer.u32(entry.data.length);
    writer.u16(entry.name.length);
    writer.u16(0); // extra
    writer.u16(0); // comment
    writer.u16(0); // disk number
    writer.u16(0); // internal attributes
    writer.u32(0); // external attributes
    writer.u32(entry.offset);
    writer.bytes(entry.name);
  }

  const centralSizeActual = writer.offset - centralOffset;
  writer.u32(0x06054b50); // end of central directory
  writer.u16(0);
  writer.u16(0);
  writer.u16(prepared.length);
  writer.u16(prepared.length);
  writer.u32(centralSizeActual);
  writer.u32(centralOffset);
  writer.u16(0);

  return writer.buffer;
}
