fun main(){
    var i = 1
    while (i < 6){
        val titular = "Renan $i"
        val conta = 100 + i
        var saldo = i + 10.0

        println("Titular: $titular")
        println("Conta: $conta")
        println("Saldo: $saldo")
        println("-----------")
        i++
    }
}