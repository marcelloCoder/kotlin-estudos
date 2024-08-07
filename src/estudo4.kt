import kotlin.random.Random

//4. Desenvolva uma função que recebe como parâmetro um vetor ou lista de números inteiros e
//um número inteiro a ser pesquisado dentro do vetor/lista. A função deve retornar “True” se o
//número pesquisado se encontra no vetor/lista ou “False”, caso contrário.

fun numeroPresente(lista: List<Int>, numero: Int): Boolean {
    return numero in lista
}

fun main() {

    val lista = List(100) {
        Random.nextInt(100, 200)
    }


    println("Lista de números:")
    println(lista.joinToString(", "))


    val numerosParaPesquisar = List(10) {
        Random.nextInt(100, 200)
    }

    
    for (numero in numerosParaPesquisar) {
        val estaPresente = numeroPresente(lista, numero)
        println("Número $numero está na lista? $estaPresente")
    }
}