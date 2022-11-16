fun main() {
    println("Bytebank")

    val renanFuncionario = Funcionario(
        nome = "Renan",
        cpf = "42632896843",
        salario = 1890.0
    )
    val karinaGerente = Gerente(
        nome = "Karina",
        cpf = "605.987.362.98",
        salario = 2800.0,
        senha = 12345
    )
    val franciscaoDiretor = Diretor(
        nome = "Francisco",
        cpf = "785.968.325-96",
        salario = 4000000.0,
        senha = 987654,
        plr = 50000.0
    )



    println("nome: ${renanFuncionario.nome}")
    println("cpf: ${renanFuncionario.cpf}")
    println("salario: ${renanFuncionario.salario}")
    println("bonificacao: ${renanFuncionario.bonificacao}")
    println("-----------------------------------------------")

    println("nome: ${karinaGerente.nome}")
    println("cpf: ${karinaGerente.cpf}")
    println("salario: ${karinaGerente.salario}")
    println("bonificacao: ${karinaGerente.bonificacao}")
    println("-----------------------------------------------")

    println("nome: ${franciscaoDiretor.nome}")
    println("cpf: ${franciscaoDiretor.cpf}")
    println("salario: ${franciscaoDiretor.salario}")
    println("bonificacao: ${franciscaoDiretor.bonificacao}")
    println("participacao nos lucros: ${franciscaoDiretor.plr}")




    if(karinaGerente.autentica(22222)){
        println("Sucesso")
    } else {
        println("Senha incorreta")
    }
}


