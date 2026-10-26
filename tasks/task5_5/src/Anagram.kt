infix fun String.anagramOf(other: String): Boolean =
    this.lowercase().toList().sorted() == other.lowercase().toList().sorted()