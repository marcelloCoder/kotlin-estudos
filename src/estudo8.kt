fun main() {
    var text: String? = null
    text = null
    if (text != null){
        println(text.length)
    }else{
        println("A VARIAVEL E NULA")
        println(text?.length)
    }

    sayHello("ALEX $text")
    sayHello("ALEX $text")
    sayAge(22)
}

fun sayHello(name: String){
    println("HELLO")
    println("$name")
}

fun sayAge(age: Int){
    println("$age")
}