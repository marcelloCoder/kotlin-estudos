fun main() {
    var text: String? = null
    text = null
    if (text != null){
        println(text.length)
    }else{
        println("A VARIAVEL E NULA")
        println(text?.length)
    }
}