enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

class Usuario (val nome: String)

data class ConteudoEducacional(val nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: MutableList<ConteudoEducacional>) {

    private var _inscritos = mutableListOf<Usuario>()
    val inscritos: List<Usuario>
    	get() = _inscritos
    
    fun matricular(usuario: Usuario) {
            _inscritos.add(usuario)
            println("O aluno ${usuario.nome} está matriculado está matriculado no curso $nome")
        }
    }


fun main() {
    
    val usuario1 = Usuario("João")
    val usuario2 = Usuario("Maria")
    
    val conteudo1 = ConteudoEducacional("Introdução ao Kotlin")
    val conteudo2 = ConteudoEducacional("Programação Orientada a Objetos")
    
    val formacaoKotlin = Formacao("Formação Kotlin", mutableListOf(conteudo1, conteudo2))
    
    formacaoKotlin.matricular(usuario1)
    formacaoKotlin.matricular(usuario2)
    
    
    println("Inscritos na formação ${formacaoKotlin.nome}: ${formacaoKotlin.inscritos.map { it.nome }}")
    
}