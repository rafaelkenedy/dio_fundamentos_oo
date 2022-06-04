package dio.diobank.testes

import dio.diobank.Analista
import dio.diobank.ClienteTipo
import dio.diobank.Funcionario

fun main(){
    val rafael = Analista(
        nome = "Rafael",
        cpf = "051",
        salario = 2000.0,
        senha = "f123",
        clienteTipo = ClienteTipo.PF
    )

    ImprimeRelatorioFuncionario.imprime(rafael)

    TesteLogin().autentica(rafael)
}

