package dio.diobank.testes
import dio.diobank.Banco

fun main(){
    val digiBank = Banco( "Digione", 12)

    println(digiBank.nome)
    println(digiBank.numero)

}