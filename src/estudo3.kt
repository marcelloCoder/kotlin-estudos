import kotlin.random.Random


/* 3. Faça um programa que inicialize um vetor ou lista de 10 elementos inteiros com valores
 aleatórios entre 12 e 21 e imprime o vetor/lista gerado. Em seguida, elimine todos os elementos
 repetidos e imprima apenas os elementos restantes.*/

fun inicializa(tamanho: Int): List<Int> {
    return List(tamanho) {
        Random.nextInt(12, 22)
    }
}

fun eliminaRepetidos(lista: List<Int>): List<Int> {
    return lista.distinct()
}

fun imprime(lista: List<Int>) {
    println(lista.joinToString(", "))
}

fun main(args: Array<String>) {
    val tamanho = 10
    val lista = inicializa(tamanho)

    println("Lista original:")
    imprime(lista)

    val listaSemRepetidos = eliminaRepetidos(lista)

    println("Lista sem elementos repetidos:")
    imprime(listaSemRepetidos)

}