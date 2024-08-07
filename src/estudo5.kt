//Implemente uma classe para um carro. A classe deve possuir os atributos marca, modelo, ano
//de fabricação, ano do modelo, placa e proprietário e dois construtores: um que inicializa
//somente marca, modelo e anos de fabricação e de modelo e outro que inicializa todos os
//atributos, conforme parâmetros. A classe deve permitir alterar os valores somente de placa e
//proprietário. Crie um método para calcular e obter quantos anos tem o veículo, considerando o
//ano do modelo – obter o ano atual via sistema. Teste o uso da classe Carro através da função
//main. Você deve criar dois carros e chamar cada método da classe para testar os carros criados.

import java.time.Year

class Carro(
    val marca: String,
    val modelo: String,
    val anoFabricacao: Int,
    val anoModelo: Int,
    var placa: String? = null,
    var proprietario: String? = null
) {
    // Construtor que inicializa apenas marca, modelo, ano de fabricação e ano do modelo
    constructor(marca: String, modelo: String, anoFabricacao: Int, anoModelo: Int) : this(
        marca,
        modelo,
        anoFabricacao,
        anoModelo,
        null,
        null
    )

    // Método para calcular a idade do veículo
    fun idadeVeiculo(): Int {
        val anoAtual = Year.now().value
        return anoAtual - anoModelo
    }

    // Método para alterar a placa
    fun alterarPlaca(novaPlaca: String) {
        placa = novaPlaca
    }

    // Método para alterar o proprietário
    fun alterarProprietario(novoProprietario: String) {
        proprietario = novoProprietario
    }

    // Método para exibir informações do carro
    fun exibirInformacoes() {
        println("Marca: $marca")
        println("Modelo: $modelo")
        println("Ano de Fabricação: $anoFabricacao")
        println("Ano do Modelo: $anoModelo")
        println("Placa: ${placa ?: "Não informada"}")
        println("Proprietário: ${proprietario ?: "Não informado"}")
        println("Idade do Veículo: ${idadeVeiculo()} anos")
    }
}

fun main() {
    // Criação do primeiro carro
    val carro1 = Carro("Toyota", "Corolla", 2010, 2010)
    carro1.alterarPlaca("ABC-1234")
    carro1.alterarProprietario("João Silva")
    carro1.exibirInformacoes()

    println()

    // Criação do segundo carro
    val carro2 = Carro("Ford", "Fiesta", 2015, 2016, "XYZ-5678", "Maria Oliveira")
    carro2.exibirInformacoes()
}
