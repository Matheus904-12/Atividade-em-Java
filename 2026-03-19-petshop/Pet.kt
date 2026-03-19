/**
 * Em Kotlin, uma interface define um "contrato". 
 * Diferente da herança de classe (onde o Animal "É UM" animal), 
 * a interface foca no que o animal "PODE FAZER".
 */
interface Pet {
    val nome: String
    val idade: Int
    
    // Interfaces em Kotlin podem ter métodos com implementação padrão
    fun brincar() {
        println("$nome está brincando!")
    }
    
    // Ou métodos que DEVEM ser implementados
    fun emitirSom()
}

// Em Kotlin, usamos ":" tanto para herança quanto para interfaces
class Gato(override val nome: String, override val idade: Int) : Pet {
    override fun emitirSom() {
        println("Miau")
    }
}

class Cachorro(override val nome: String, override val idade: Int) : Pet {
    override fun emitirSom() {
        println("Au Au")
    }
}

fun main() {
    val pets: List<Pet> = listOf(
        Gato("Mimi", 2),
        Cachorro("Thor", 3)
    )
    
    println("=== Kotlin Petshop ===")
    pets.forEach { pet ->
        print("${pet.nome} faz: ")
        pet.emitirSom()
        pet.brincar()
    }
}
