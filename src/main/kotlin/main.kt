fun main() {
    println("Bytebank")

    val renanFuncionario = Funcionario(
        nome = "Renan",
        cpf = "42632896843",
        salario = 1890.0
    )

    println("nome: ${renanFuncionario.nome}")
    println("cpf: ${renanFuncionario.cpf}")
    println("salario: ${renanFuncionario.salario}")
    println("bonificacao: ${renanFuncionario.bonificacao()}")
}


