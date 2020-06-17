fun sayHello(itemToGreet:String): String {
    val msg = "Hello $itemToGreet";
    return msg;
}

fun main() {
 println(sayHello("Wow!"))
}