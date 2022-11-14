class Conta(
    var titular: String,
    val numero: Int
) {
    var saldo = 0.0
        private set


    fun deposita(valor: Double) {
        if (valor > 0) {
            saldo += valor
        }
    }

    fun saca(valor: Double) {
        if (this.saldo < valor) {
            println("Saldo insulficiente")
            return
        }
        saldo -= valor
        println("Saque: $valor")

    }

    fun transfere(valor: Double, destino: Conta): Boolean {
        if (saldo >= valor) {
            saldo -= valor
            destino.deposita(valor)
            println("Transferencia realizada com sucesso")
            return true
        }
        return false
    }

}