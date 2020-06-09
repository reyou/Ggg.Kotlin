// Infix functions, extensions, type inference, nullable types,
// lambda expressions, labeled this, Elvis operator (?:)
infix fun String.andAnother(other : Any?) = buildString()
{
    append(this@andAnother); append(" "); append(other ?: "")
}

// Immutable types, delegated properties, lazy initialization, string templates
val greeting by lazy { val doubleEl: String = "ll"; "he${doubleEl}o" }

// Inline higher-order functions
inline fun greet(s: () -> String) : String = greeting andAnother s()



fun main() {
    val result: Boolean = "Hello, World" matches "^Hello".toRegex()
}


