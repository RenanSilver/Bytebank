abstract class Conta(
    var titular: String,
    val numero: Int
) {
    var saldo = 0.0
        protected set

    fun deposita(valor: Double) {
        if (valor > 0) {
            saldo += valor
        }
    }

    abstract fun saca(valor: Double)


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