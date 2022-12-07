package br.com.alura.bytebank.modelo

import totalContas

abstract class Conta(
    var titular: Cliente,
    val numero: Int
) {
    var saldo = 0.0
        protected set

    init {
        println("Adicionou conta")
        totalContas++
    }

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