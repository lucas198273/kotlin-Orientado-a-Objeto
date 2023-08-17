const val nomeCriador = "Lucas Dias"
const val telefoneDoCriado = 31992311011
class Pessoa(val nome: String, val idade: Int, val profissao: String)



fun main(args: Array<String>) {

    /*tipos mutaveis e imutaveis*/
    val valImutavel = "val IMUTAVEL"
    var varMutavel = "Lucas"
    print("print : exibi sem quebra de linha")
    println(" \n println : exibi com quebra de linha")

    varMutavel = "joao"
    println(varMutavel)
    println(valImutavel)

    print(nomeCriador)


    /*
    Operadores Aritimeticos
*/

    val cpf = 751244588
    val nomerosenha = 27.5  /*float*/




    /*val maiorQue = numeroAleatorio <= numeroAleatorio2*/
    /*"numero ${numeroAleatorio} maior que ${numeroAleatorio2}"+*/




    /* criando lista */
    val numeros = mutableListOf(1, 2, 3)
    numeros.add(5)
    numeros.add(65)
    numeros.add(154)
    println(numeros)
    println(numeros[0])
    println(numeros[1])
   /* lista numerica nao precisa de foreach*/

    val frutas = listOf("Maçã", "Banana", "Laranja")

    println("Imprimindo com forEach")
    frutas.forEach{fruta -> println(fruta) }

    RealizarCalculo(5,5)
    DadosCriador()

    // Criando uma lista imutável
    val frutasImutavels = listOf("Maçã", "Banana", "Laranja")

    // Tentativa de adicionar um elemento - Isso não é permitido em listas imutáveis
    // frutas.add("Pera") // Isso causará um erro de compilação

    // Tentativa de alterar um elemento - Isso também não é permitido
    // frutas[0] = "Abacaxi" // Isso causará um erro de compilação

    val numerosMutaveis = mutableListOf(1, 2, 3, 4, 5)

    // Adicionando elementos à lista mutável
    numerosMutaveis.add(6)

    // Alterando um elemento na lista mutável
    numerosMutaveis[0] = 10

    // Removendo um elemento da lista mutável
    numerosMutaveis.removeAt(1)
    println("\n NumerosMutaveis")
    println(numerosMutaveis)

    println("Trabalhando com Objetos em Listas: ")
    /*class Pessoa(val nome: String, val idade: Int, val profissao: String)*/
    val individuo1 = Pessoa("Lucas",22,"Empreendedor")
    val individuo2 = Pessoa("Lucas",23,"Programador")

    val listaPessoas = mutableListOf<Pessoa>()
    listaPessoas.add(individuo1)
    listaPessoas.add(individuo2)

    val bancoDeClientes = Cadastro()
    bancoDeClientes.adicionarPessoa(individuo1)
    bancoDeClientes.adicionarPessoa(individuo2)

    println("Testando Metodo para exibir lista de objetos")
    exibirListaDeObjetos(listaPessoas)
    println("Chamando metodo Cadastro para acessar o banco de dados do objeto Cadastro")
    bancoDeClientes.exibirListaDePessoas()
}
class Cadastro {
    private val listaPessoas = mutableListOf<Pessoa>()  /*Banco de dados de clientes*/
    fun adicionarPessoa(pessoa: Pessoa) {
        listaPessoas.add(pessoa)
    }
    fun exibirListaDePessoas() {
        listaPessoas.forEach { pessoa ->
            println("===========================================================================")
            println("Nome: ${pessoa.nome}, Idade: ${pessoa.idade}, Profissão: ${pessoa.profissao}")
            println("\n=====METODO CADASTRO EXECUTADO COM SUCESSO======")
        }
    }
}
fun exibirListaDeObjetos(listaObjetos: List<Pessoa>){
    listaObjetos.forEach { pessoa ->
        println("Nome: ${pessoa.nome}, Idade: ${pessoa.idade}, Profissão: ${pessoa.profissao}")
    }
}
fun DadosCriador(){
    print("Dados do Criador: $nomeCriador\n${telefoneDoCriado}")
}

fun Calculo(num1: Int , num2: Int){
    val numeroAleatorio = num1
    val numeroAleatorio2 = num2

    val resultadoDivisao = numeroAleatorio % numeroAleatorio2
    val resultadoMultiplicacao = numeroAleatorio * numeroAleatorio2
    val resultadoAdicao = numeroAleatorio + numeroAleatorio2
    val resultadoSubtracao = numeroAleatorio - numeroAleatorio2

    println("Trabalhando com os valores ${numeroAleatorio} e ${numeroAleatorio2}")
    println("Resultado Divisao ${resultadoDivisao}")
    println("Resultado Multiplicação ${resultadoMultiplicacao}")
    println("Resultado Adição ${resultadoAdicao}")
    println("Resultado Subtração ${resultadoSubtracao}")

    println("=======Metodo Caulculo executado com sucesso======")
}
fun RelacaoEntreNumeros(num1: Int, num2: Int){

    println("N1 menor ou igual ao N2")
    println(num1 <= num2)
    println("N1 maior que N2")
    println(num1 >= num2)
    println("N1 maior ou igual ao N2")
    println(num1 >= num2)
    println("N1  igual ao N2")
    println(num1 == num2)
    println("N1 Diferente do N2")
    println(num1 != num2)

    println("=======Metodo Relação entre numros executado com sucesso======")
}
fun RealizarCalculo(num1: Int ,num2 :Int){
    Calculo(num1,num2)
    println("Relação entre os numero")
    RelacaoEntreNumeros(num1,num2)
    println("Metodo Realizar Calculo finalizado")
}




    /*val listaUsuarios = mutableListOf<Usuario>()

    while (true) {
        println("1 - Cadastrar usuário")
        println("2 - Mostrar usuários cadastrados")
        println("3 - Sair")
        print("Escolha uma opção: ")

        val opcao = readLine()?.toIntOrNull()

        when (opcao) {
            1 -> {
                val usuario = cadastrarUsuario()
                listaUsuarios.add(usuario)
                println("Usuário cadastrado com sucesso!")
            }
            2 -> mostrarUsuariosCadastrados(listaUsuarios)
            3 -> {
                println("Saindo do programa.")
                break
            }
            else -> println("Opção inválida. Escolha uma opção válida.")
        }
    }
}

fun cadastrarUsuario(): Usuario {
    print("Digite o nome do usuário: ")
    val nome = readLine() ?: ""

    print("Digite a idade do usuário: ")
    val idade = readLine()?.toIntOrNull() ?: 0

    print("Digite o email do usuário: ")
    val email = readLine() ?: ""

    return Usuario(nome, idade, email)
}

fun mostrarUsuariosCadastrados(usuarios: List<Usuario>) {
    if (usuarios.isEmpty()) {
        println("Nenhum usuário cadastrado.")
    } else {
        println("Usuários cadastrados:")
        for ((index, usuario) in usuarios.withIndex()) {
            println("${index + 1}. Nome: ${usuario.nome}, Idade: ${usuario.idade}, Email: ${usuario.email}")
        }
    }*/

