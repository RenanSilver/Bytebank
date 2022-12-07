import br.com.alura.bytebank.modelo.*

fun testaContasDiferentes() {
    val renan = Cliente(
        nome = "Renan",
        cpf = "54654654",
        senha = 222222,
        endereco = Endereco(
            logradouro = "Rua Tijucas do Sul"
        )
    )
    val karina = Cliente(
        nome = "Karina",
        cpf = "123123",
        senha = 33333
    )

    val contaCorrente = ContaCorrente(
        titular = renan,
        numero = 555
    )
    val contaPoupanca = ContaPoupanca(
        titular = karina,
        numero = 444
    )

    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)

    println("saldo corrente: ${contaCorrente.titular.nome}")
    println("saldo poupanca: ${contaPoupanca.titular.cpf}")
    println("endereco do Titular: ${contaCorrente.titular.endereco.logradouro}")

    println("----------------------------------------------")

//    contaCorrente.saca(100.0)
//    contaPoupanca.saca(100.0)
//
//    println("----------------------------------------------")
//
//    println("saldo apos saque corrente: ${contaCorrente.saldo}")
//    println("saldo apos saque poupanca: ${contaPoupanca.saldo}")
//
//
//    println("----------------------------------------------")
//    contaPoupanca.transfere(100.0, contaCorrente)
//
//    println("saldo apos transferencia corrente<: ${contaCorrente.saldo}")
//    println("saldo apos transferencia poupanca>: ${contaPoupanca.saldo}")
}