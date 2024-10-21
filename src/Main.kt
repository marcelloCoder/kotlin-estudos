fun main(args: Array<String>) {
    println("Hello World!")

    var nome: String = "Marcello"
    println(nome)

    nome = "Liandra"

    println("Nome : $nome")

    var price: Double
    price = 40.0033
    println(price)

    println("x == ${--price}")
    println("x == ${price--}")
    if (price >= 30){
        println("NUMERO MAIOR ou igual a 30")
    }else if (price < 30){
        println("NUMERO MENOR QUE 30")
    }else{
        println("NaN")
    }

    val operation = true
    if(!operation){
        println("OPERATION ACTIVATE")
    }else{
        println("OPERATION DENIED")
    }

    val score = 100
    if (operation && score == 100){
        println("100")
    }

    if (price > 22 || score > 200){
        println("condition true")
    }else{
        println("condition false")
    }

    val n1 = -8
    val n2 = -4
    val text = if (n1 > 0 || n2 > 0)
        "POSITIVE"
    else
        "NEGATIVE"
    println("$text")
}