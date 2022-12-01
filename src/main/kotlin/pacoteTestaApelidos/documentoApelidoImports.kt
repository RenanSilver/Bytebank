package pacoteTestaApelidos
import br.com.alura.bytebank.modelo.Cliente as ClienteApelido

fun main() {

    val cliente = ClienteApelido(nome = "Teste", cpf = "br/com/alura/bytebank/teste", senha = 123)
    val clienteApelido = Cliente()

//Entao foi criado um pacote com uma classe com o mesmo nome de outra classe, para instanciar as duas e colocar um
//apelido que referencie uma das classes dentro desse arquivo. Entao no import foi chamado o pacote ea classe, o uso do
// "as" e um nome que sera apenas utilizado dentro desse arquivo. !* import modelo.Cliente as ClienteApelido
}