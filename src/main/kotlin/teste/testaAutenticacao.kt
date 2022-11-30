import modelo.*

fun testaAutenticacao() {
    val gerente = Gerente(
        nome = "Josue",
        cpf = "555.999.666.33",
        salario = 5000.0,
        senha = 987654321
    )

    val cliente = Cliente(
        nome = "Clientao",
        cpf = "999.999.999-23",
        senha = 123456
    )

    val diretor = Diretor(
        nome = "Diretorzao",
        cpf = "888.999.555-96",
        salario = 600.0,
        senha = 5555,
        plr = 999999.3
    )

    val sistema = SistemaInterno()
    sistema.entra(gerente, 987654320)
    sistema.entra(cliente, 1230056)
    sistema.entra(diretor, 5555)

}