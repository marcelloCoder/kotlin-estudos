fun main(args: Array<String>) {
    val max = getMax(2, 3)
    val max2 = getMax2(2, 3)
    println(max)
    println(max2)
    sendMessage()
    println(sum(5,4,6,7))
    sum2(1,4,6,5,4,3,2,3,9)
}

fun getMax(a: Int, b: Int): Int {
    var max = if (a > b) a else b
    return max
}

fun getMax2(a: Int, b: Int): Int {
    if (a > b) {
        return a
    } else {
        return b
    }
}

fun sendMessage(name: String = "DEFAULT", message: String = someText()) {
    println("hello $name, message : $message")
}

fun someText() = "SOME TEXT"

fun sum(vararg numbers: Int): Int{
    var result = 0
    for (number in numbers){
        result += number
    }
    return result
}

fun sum2(vararg numbers: Int){
    numbers.forEach { println(it) }
}