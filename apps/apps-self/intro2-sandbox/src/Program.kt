fun main() {
    val greeting
    by lazy {
        val doubleEl: String = "ll";
        "he${doubleEl}o"
    }
    // prints "hello"
    println(greeting)
}