package dio.diobank

class Analista(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: String,
    val clienteTipo: ClienteTipo
) : Funcionario(nome, cpf, salario), Logavel{
    override fun calculoAuxilio() = salario * 0.1
    override fun login(): Boolean = "123" == senha
    override fun toString(): String = """
        Nome: $nome
        CPF: $cpf
        Salário: $salario
        Auxílio: ${calculoAuxilio()}    
        Tipo: ${clienteTipo.descricao}
    """.trimIndent()
}