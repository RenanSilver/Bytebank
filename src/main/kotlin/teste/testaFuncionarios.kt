import modelo.*

fun testaFuncionarios() {
    val renanFuncionario = Analista(
        nome = "Renan",
        cpf = "42632896843",
        salario = 1890.0
    )
    val karinaGerente = Gerente(
        nome = "Karina",
        cpf = "605.987.362.98",
        salario = 2800.0, senha = 12345
    )
    val franciscaoDiretor = Diretor(
        nome = "Francisco",
        cpf = "785.968.325-96",
        salario = 4000000.0,
        senha = 987654, plr = 50000.0
    )

    val maria = Analista(
        nome = "Maria",
        cpf = "555.999.666.88",
        salario = 5000.0
    )

    val edil = Auxiliar(
        nome = "Edil",
        cpf = "658.988.663.56",
        salario = 200.0
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
    println("---------------*-*-*-**-----------*-*-*--*---------*-*-*-*-")

    println("nome: ${maria.nome}")
    println("cpf: ${maria.cpf}")
    println("salario: ${maria.salario}")
    println("bonificacao: ${maria.bonificacao}")
    println("-----------------------------------------------")

    println("nome: ${edil.nome}")
    println("cpf: ${edil.cpf}")
    println("salario: ${edil.salario}")
    println("bonificacao: ${edil.bonificacao}")


    val calculadora = CalculadoraBonificacao()
    calculadora.registra(karinaGerente)
    calculadora.registra(renanFuncionario)
    calculadora.registra(franciscaoDiretor)
    calculadora.registra(maria)
    calculadora.registra(edil)

    println("Total das bonificacoes: ${calculadora.total}")


    if (karinaGerente.autentica(22222)) {
        println("Sucesso")
    } else {
        println("Senha incorreta")
    }
}