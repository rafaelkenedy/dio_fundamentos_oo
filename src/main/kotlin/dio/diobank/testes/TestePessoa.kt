package dio.diobank.testes

import dio.diobank.Analista
import dio.diobank.Funcionario

fun main(){
    val rafael = Analista(nome = "Rafael", cpf = "051", salario = 2000.0)

    ImprimeRelatorioFuncionario.imprime(rafael)
}

