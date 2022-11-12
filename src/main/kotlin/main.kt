fun main() {
    println("Bytebank")
    val contaRenan = Conta()
    contaRenan.titular = "Renan"
    contaRenan.numero = 100
    contaRenan.saldo = 600.0

    val contaKarina = Conta()
    contaKarina.titular = "Karina"
    contaKarina.numero = 101
    contaKarina.saldo = 350.0

    println(contaKarina.titular)
    println(contaKarina.numero)
    println(contaKarina.saldo)

    println(contaRenan.titular)
    println(contaRenan.numero)
    println(contaRenan.saldo)

    println("depositando na conta do Renan")
    contaRenan.deposita(50.0)
    println(contaRenan.saldo)

    println("depositando na conta da Ka")
    contaKarina.deposita(70.0)
    println(contaKarina.saldo)

    println("saque Renan")
    contaRenan.saca(650.0)
    println(contaRenan.saldo)

    println("saque Karina")
    contaKarina.saca(28.9)
    println(contaKarina.saldo)

    contaKarina.transfere(50.0, contaRenan)

    println(contaKarina.saldo)
    println(contaRenan.saldo)
}


class Conta {
    var titular = ""
    var numero = 0
    var saldo = 0.0

    fun deposita(valor: Double) {
        saldo += valor
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
            destino.saldo += valor
            println("Transferencia realizada com sucesso")
            return true
        }
        return false
    }
}

fun testaCoipiasEReferencias() {
    //Entendendo referencias de objetos em kotlin
    val numeroX = 10
    var numeroY = numeroX
    numeroY++
    println("numeroX $numeroX")
    println("numeroY $numeroY")

    val contaJoao = Conta()
    contaJoao.titular = "Joao"
    var contaMaria = contaJoao
    contaMaria.titular = "Maria"

    println("titular conta Joao: ${contaJoao.titular}")
    println("titular conta Joao: ${contaMaria.titular}")
}

private fun testaLaco() {
    for (i in 5 downTo 1 step 4) {
        val titular: String = "Renan $i"
        val numeroConta: Int = 1000 + i
        var saldo = i + 10.0


        println("Titular: $titular")
        println("Numero da conta: $numeroConta")
        println("Saldo da conta: $saldo")
        println("---------------------------")

        //testaCondicoes(saldo)

    }
}

fun testaCondicoes(saldo: Double) {
    if (saldo > 0.0) {
        println("Conta e positiva")
    } else if (saldo == 0.0) {
        println("conta neutra")
    } else {
        println("conta negativa")
    }

}

//Da pra usar o when no lugar do if
//when {
//    saldo > 0.0 -> println("Conta Positiva")
//    saldo == 0.0 -> println("Conta Zerada")
//    else -> println("Conta Negativa")
//}