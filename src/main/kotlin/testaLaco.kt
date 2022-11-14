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