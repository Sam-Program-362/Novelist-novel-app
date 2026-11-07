extension IterableX<T> on Iterable<T> {
  /// Returns the first element or `null` when the iterable is empty.
  ///
  /// Declared locally instead of relying on `package:collection` so the UI layer has no extra
  /// import surface and the analyser version cannot change the behaviour.
  T? get firstOrNull {
    final iterator = this.iterator;
    if (iterator.moveNext()) return iterator.current;
    return null;
  }
}
