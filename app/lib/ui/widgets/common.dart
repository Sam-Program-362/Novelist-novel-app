import 'dart:convert';
import 'dart:typed_data';

import 'package:flutter/material.dart';
import 'package:flutter/services.dart' show rootBundle;
import 'package:image_picker/image_picker.dart';

import '../../core/l10n/strings.dart';
import '../../core/utils/colours.dart';

/// Empty-state block used by every list in the app (the reference exposes one empty string per
/// list: `no_items_to_display`, `no_scenes_to_display`, …).
class EmptyState extends StatelessWidget {
  final IconData icon;
  final String title;
  final String? subtitle;
  final Widget? action;

  const EmptyState({
    super.key,
    required this.icon,
    required this.title,
    this.subtitle,
    this.action,
  });

  @override
  Widget build(BuildContext context) {
    final theme = Theme.of(context);
    return Center(
      child: Padding(
        padding: const EdgeInsets.all(32),
        child: Column(
          mainAxisSize: MainAxisSize.min,
          children: [
            Icon(icon, size: 44, color: theme.colorScheme.onSurfaceVariant),
            const SizedBox(height: 12),
            Text(
              title,
              textAlign: TextAlign.center,
              style: theme.textTheme.titleMedium?.copyWith(
                color: theme.colorScheme.onSurfaceVariant,
              ),
            ),
            if (subtitle != null) ...[
              const SizedBox(height: 6),
              Text(
                subtitle!,
                textAlign: TextAlign.center,
                style: theme.textTheme.bodySmall?.copyWith(),
              ),
            ],
            if (action != null) ...[const SizedBox(height: 16), action!],
          ],
        ),
      ),
    );
  }
}

/// The coloured status circle that doubles as the delete/merge affordance in the Plot and Write
/// lists (quickstart: “long press the circle to delete or merge items”).
class StatusDot extends StatelessWidget {
  final int colour;
  final double size;
  final bool outlined;

  const StatusDot({super.key, required this.colour, this.size = 20, this.outlined = false});

  @override
  Widget build(BuildContext context) {
    final resolved = colourFromStored(colour);
    return Container(
      width: size,
      height: size,
      decoration: BoxDecoration(
        color: outlined ? Colors.transparent : resolved,
        shape: BoxShape.circle,
        border: Border.all(color: resolved.withValues(alpha: 0.9), width: 1.6),
      ),
    );
  }
}

class CoverThumb extends StatelessWidget {
  final String? cover;
  final double width;
  final double height;
  final IconData fallbackIcon;

  const CoverThumb({
    super.key,
    required this.cover,
    required this.width,
    required this.height,
    this.fallbackIcon = Icons.menu_book_outlined,
  });

  @override
  Widget build(BuildContext context) {
    final scheme = Theme.of(context).colorScheme;
    Widget fallback = Container(
      width: width,
      height: height,
      color: scheme.surfaceContainerHighest,
      child: Icon(fallbackIcon, color: scheme.onSurfaceVariant, size: width * 0.34),
    );

    Widget? image;
    final value = cover;
    if (value != null && value.isNotEmpty) {
      if (value.startsWith('data:image')) {
        final comma = value.indexOf(',');
        if (comma > 0) {
          try {
            image = Image.memory(
              base64Decode(value.substring(comma + 1)),
              width: width,
              height: height,
              fit: BoxFit.cover,
              errorBuilder: (_, __, ___) => fallback,
            );
          } catch (_) {
            image = null;
          }
        }
      } else {
        // Imported documents may reference a base64 payload without the data prefix.
        try {
          image = Image.memory(
            base64Decode(value),
            width: width,
            height: height,
            fit: BoxFit.cover,
            errorBuilder: (_, __, ___) => fallback,
          );
        } catch (_) {
          image = null;
        }
      }
    }

    return ClipRRect(
      borderRadius: BorderRadius.circular(10),
      child: SizedBox(width: width, height: height, child: image ?? fallback),
    );
  }
}

/// Small circular badge showing whether a project has been backed up (quickstart: green = safe,
/// red = needs backup).
class BackupIndicator extends StatelessWidget {
  final bool hasBackup;

  const BackupIndicator({super.key, required this.hasBackup});

  @override
  Widget build(BuildContext context) {
    final colour = hasBackup ? const Color(0xFF3FA34D) : const Color(0xFFC2382B);
    return Tooltip(
      message: hasBackup ? S.backedUp : S.needsBackup,
      child: Container(
        width: 10,
        height: 10,
        decoration: BoxDecoration(color: colour, shape: BoxShape.circle),
      ),
    );
  }
}

Future<String?> promptForText(
  BuildContext context, {
  required String title,
  String initial = '',
  String? hint,
  int maxLines = 1,
  String confirmLabel = S.save,
}) async {
  final controller = TextEditingController(text: initial);
  final result = await showDialog<String>(
    context: context,
    builder: (dialogContext) {
      return AlertDialog(
        title: Text(title),
        content: TextField(
          controller: controller,
          autofocus: true,
          maxLines: maxLines,
          decoration: InputDecoration(hintText: hint),
        ),
        actions: [
          TextButton(
            onPressed: () => Navigator.of(dialogContext).pop(),
            child: const Text(S.cancel),
          ),
          FilledButton(
            onPressed: () => Navigator.of(dialogContext).pop(controller.text.trim()),
            child: Text(confirmLabel),
          ),
        ],
      );
    },
  );
  return result;
}

Future<bool> confirmAction(
  BuildContext context, {
  required String title,
  String? message,
  String confirmLabel = S.delete,
  bool destructive = true,
}) async {
  final theme = Theme.of(context);
  final result = await showDialog<bool>(
    context: context,
    builder: (dialogContext) => AlertDialog(
      title: Text(title),
      content: message == null ? null : Text(message),
      actions: [
        TextButton(
          onPressed: () => Navigator.of(dialogContext).pop(false),
          child: const Text(S.cancel),
        ),
        FilledButton(
          style: destructive
              ? FilledButton.styleFrom(backgroundColor: theme.colorScheme.error)
              : null,
          onPressed: () => Navigator.of(dialogContext).pop(true),
          child: Text(confirmLabel),
        ),
      ],
    ),
  );
  return result ?? false;
}

Future<int?> pickColour(BuildContext context, {int? current}) async {
  return showDialog<int>(
    context: context,
    builder: (dialogContext) {
      return AlertDialog(
        title: const Text(S.pickColour),
        content: SizedBox(
          width: 260,
          child: Wrap(
            spacing: 12,
            runSpacing: 12,
            children: [
              for (final colour in AppPalette.all)
                GestureDetector(
                  onTap: () => Navigator.of(dialogContext).pop(colour),
                  child: Container(
                    width: 40,
                    height: 40,
                    decoration: BoxDecoration(
                      color: colourFromStored(colour),
                      shape: BoxShape.circle,
                      border: Border.all(
                        color: current == colour
                            ? Theme.of(context).colorScheme.onSurface
                            : Colors.transparent,
                        width: 2.4,
                      ),
                    ),
                  ),
                ),
            ],
          ),
        ),
        actions: [
          TextButton(
            onPressed: () => Navigator.of(dialogContext).pop(),
            child: const Text(S.cancel),
          ),
        ],
      );
    },
  );
}

/// Picks an image from the gallery and returns it as a data URI (the format the reference stores in
/// `project_cover` / `item_picture`).
Future<String?> pickImageAsDataUri(BuildContext context) async {
  final picker = ImagePicker();
  final file = await picker.pickImage(source: ImageSource.gallery, maxWidth: 1600);
  if (file == null) return null;
  final bytes = await file.readAsBytes();
  final extension = file.name.toLowerCase().endsWith('.png') ? 'png' : 'jpeg';
  return 'data:image/$extension;base64,${base64Encode(bytes)}';
}

Uint8List? decodeDataUri(String? value) {
  if (value == null || value.isEmpty) return null;
  final comma = value.indexOf(',');
  final payload = value.startsWith('data:') && comma > 0 ? value.substring(comma + 1) : value;
  try {
    return base64Decode(payload);
  } catch (_) {
    return null;
  }
}

Future<String> loadAsset(String path) => rootBundle.loadString(path);

/// Reorder affordance shared by every sortable list: a context menu with move up/down.
Future<int?> showReorderMenu(BuildContext context, {required int index, required int length}) {
  return showModalBottomSheet<int>(
    context: context,
    builder: (sheetContext) => SafeArea(
      child: Column(
        mainAxisSize: MainAxisSize.min,
        children: [
          ListTile(
            enabled: index > 0,
            leading: const Icon(Icons.arrow_upward),
            title: const Text(S.reorderUp),
            onTap: index > 0 ? () => Navigator.of(sheetContext).pop(-1) : null,
          ),
          ListTile(
            enabled: index < length - 1,
            leading: const Icon(Icons.arrow_downward),
            title: const Text(S.reorderDown),
            onTap: index < length - 1 ? () => Navigator.of(sheetContext).pop(1) : null,
          ),
        ],
      ),
    ),
  );
}

void showMessage(BuildContext context, String message) {
  ScaffoldMessenger.of(context).showSnackBar(SnackBar(content: Text(message)));
}

String formatDate(int? millis) {
  if (millis == null || millis <= 0) return S.notSet;
  final date = DateTime.fromMillisecondsSinceEpoch(millis);
  return '${date.day.toString().padLeft(2, '0')}/'
      '${date.month.toString().padLeft(2, '0')}/${date.year}';
}

String formatDateShort(DateTime date) =>
    '${date.day.toString().padLeft(2, '0')}/${date.month.toString().padLeft(2, '0')}';
