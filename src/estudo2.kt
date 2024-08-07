import kotlin.random.Random

fun main(args: Array<String>){

    // 2 - Crie um programa que gere um vetor ou lista contendo 20 números gerados aleatoriamente
    //entre 0 a 100 e imprime o maior valor, o menor valor, a soma e a média aritmética dos valores
    //gerados.

    val numeros = List(20) {
        Random.nextInt(0, 101)
    }

    val maiorNumero = numeros.maxOrNull() ?: 0
    val menorNumero = numeros.minOrNull() ?: 0
    val soma = numeros.sum()
    val media = numeros.average()

    println("Numeros aleatorios gerados: $numeros")
    println("Maior numero: $maiorNumero")
    println("Menor numero: $menorNumero")
    println("Soma: $soma")
    println("Media: $media")

}