fun main() {
    println("Bytebank")

    val contaCorrente = ContaCorrente(
        titular = "Renan",
        numero = 555
    )
    val contaPoupanca = ContaPoupanca(
        titular = "Karina",
        numero = 444
    )

    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)

    println("saldo corrente: ${contaCorrente.saldo}")
    println("saldo poupanca: ${contaPoupanca.saldo}")

    println("----------------------------------------------")

    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)

    println("----------------------------------------------")

    println("saldo apos saque corrente: ${contaCorrente.saldo}")
    println("saldo apos saque poupanca: ${contaPoupanca.saldo}")


    println("----------------------------------------------")
    contaPoupanca.transfere(100.0, contaCorrente)

    println("saldo apos transferencia corrente<: ${contaCorrente.saldo}")
    println("saldo apos transferencia poupanca>: ${contaPoupanca.saldo}")



}





