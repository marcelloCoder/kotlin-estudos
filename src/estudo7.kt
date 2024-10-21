fun main(args: Array<String>) {
    var alarm = 7
    when(alarm){
        in 1..10 -> println("SEU NUMERO ESTA ENTRE 1 E 10")
        12, 15, 16, 9 -> println("THE TIME IS $alarm")
        7 -> println("THE TIME IS $alarm")
        null -> println("THERE IS NO TIME SET")
        else -> println("THE TIME IS $alarm")
    }
    val text = when{
        alarm <= 10 -> println("NUMBER LESS THAN 10")
        alarm == 10 -> println("NUMBER IS 10")
        else -> println("nan")
    }
}