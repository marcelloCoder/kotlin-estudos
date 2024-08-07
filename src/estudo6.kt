//Considere um sistema de uma empresa que vende produtos de informática. Dentre as várias
//classes desse sistema existe uma classe que define o tipo de dado Produto. Implemente essa
//classe em Kotlin considerando a descrição abaixo fornecida por um usuário do sistema:
//
//“Cada produto possui um código de identificação e uma descrição. A empresa necessita manter
//o controle sobre o preço de venda de seus produtos. É importante ter opções para definir o preço
//de cada produto e para conceder reajuste de preço de acordo com um percentual. A empresa
//também necessita manter o controle de estoque de cada produto. A efetuar uma venda, o
//estoque deve ser decrementado de acordo com a quantidade vendida (o estoque não pode ficar
//negativo), e ao efetuar uma compra, o estoque deve ser incrementado de acordo com a
//quantidade comprada”.
//
//Mostre exemplos de uso da classe Produto, criando alguns produtos e chamando as operações
//definidas na classe.

class Produto(
    val codigo: String,
    val descricao: String,
    private var preco: Double,
    private var estoque: Int
) {
    // Método para definir o preço de venda do produto
    fun definirPreco(novoPreco: Double) {
        if (novoPreco >= 0) {
            preco = novoPreco
        } else {
            println("O preço não pode ser negativo.")
        }
    }

    // Método para conceder reajuste de preço de acordo com um percentual
    fun reajustarPreco(percentual: Double) {
        if (percentual >= 0) {
            preco += preco * (percentual / 100)
        } else {
            println("O percentual de reajuste não pode ser negativo.")
        }
    }

    // Método para decrementar o estoque ao efetuar uma venda
    fun vender(quantidade: Int) {
        if (quantidade > 0 && quantidade <= estoque) {
            estoque -= quantidade
        } else {
            println("Quantidade inválida ou estoque insuficiente.")
        }
    }

    // Método para incrementar o estoque ao efetuar uma compra
    fun comprar(quantidade: Int) {
        if (quantidade > 0) {
            estoque += quantidade
        } else {
            println("A quantidade de compra deve ser positiva.")
        }
    }

    // Método para exibir informações do produto
    fun exibirInformacoes() {
        println("Código: $codigo")
        println("Descrição: $descricao")
        println("Preço: R$ %.2f".format(preco))
        println("Estoque: $estoque unidades")
    }
}

fun main() {
    // Criação de alguns produtos
    val produto1 = Produto("001", "Mouse Gamer", 150.0, 50)
    val produto2 = Produto("002", "Teclado Mecânico", 250.0, 30)
    val produto3 = Produto("003", "Monitor 24 polegadas", 1200.0, 20)

    // Exibe informações dos produtos
    produto1.exibirInformacoes()
    produto2.exibirInformacoes()
    produto3.exibirInformacoes()

    println("\nReajustando preços dos produtos...")

    // Reajusta o preço dos produtos
    produto1.reajustarPreco(10.0) // Aumenta o preço em 10%
    produto2.reajustarPreco(5.0)  // Aumenta o preço em 5%
    produto3.reajustarPreco(15.0) // Aumenta o preço em 15%

    // Exibe informações atualizadas dos produtos
    produto1.exibirInformacoes()
    produto2.exibirInformacoes()
    produto3.exibirInformacoes()

    println("\nEfetuando vendas e compras de produtos...")

    // Efetua vendas de produtos
    produto1.vender(10) // Vende 10 unidades de Mouse Gamer
    produto2.vender(5)  // Vende 5 unidades de Teclado Mecânico
    produto3.vender(2)  // Vende 2 unidades de Monitor

    // Efetua compras de produtos
    produto1.comprar(20) // Compra 20 unidades de Mouse Gamer
    produto2.comprar(10) // Compra 10 unidades de Teclado Mecânico

    // Exibe informações atualizadas dos produtos após vendas e compras
    produto1.exibirInformacoes()
    produto2.exibirInformacoes()
    produto3.exibirInformacoes()
}
