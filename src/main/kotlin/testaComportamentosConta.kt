fun testaComportamentosConta() {

    val contaRenan = Conta("Renan", 1000)
    contaRenan.deposita(600.0)

    //labels. Se existe algum parametro com com valor definido consigomos alteralo dessa maneira.
    val contaKarina = Conta(titular = "Karina", numero = 500)
    contaKarina.deposita(500.0)

    println(contaKarina.titular)
    println(contaKarina.numero)
    println(contaKarina.saldo)

    println(contaRenan.titular)
    println(contaRenan.numero)
    println(contaRenan.saldo)
}