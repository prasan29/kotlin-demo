package kotlindemo

import java.util.*

enum class EntityType {
    HELP, EASY, MEDIUM, HARD;

    fun getFormattedName() = name.toLowerCase().capitalize()
}

object EntityFactory {
    fun create(type: EntityType): Entity {
        val id = UUID.randomUUID().toString()
        val name = when (type) {
            EntityType.EASY -> type.name
            EntityType.MEDIUM -> type.getFormattedName()
            EntityType.HARD -> type.name
            EntityType.HELP -> type.getFormattedName()
        }
        return when (type) {
            EntityType.EASY -> Entity.Easy(id, name)
            EntityType.MEDIUM -> Entity.Medium(id, name)
            EntityType.HARD -> Entity.Hard(id, name, 2f)
            EntityType.HELP -> Entity.Help
        }
    }
}

sealed class Entity {
    object Help : Entity() {
        val name = "Help"
    }

    data class Easy(val id: String, val name: String) : Entity()
    data class Medium(val id: String, val name: String) : Entity()
    data class Hard(val id: String, val name: String, val multiplier: Float) : Entity()
}

fun Entity.Medium.printInfo() {
    println("Medium class id: $id")
}

var Entity.Medium.info: String
    get() = ""
    set(value) = TODO()

fun main() {
/*    val entity: Entity = EntityFactory.create(EntityType.HELP)
    val message = when (entity) {
        Entity.Help -> "Help class"
        is Entity.Easy -> "Easy class"
        is Entity.Medium -> "Medium class"
        is Entity.Hard -> "Hard class"
    }

    println(message)*/

/*    val entity1 = Entity.Easy("id", "name")
    val entity2 = Entity.Easy("id", "name")

    println(if (entity1 === entity2) "Equal" else "Unequal")*/

    val entity = EntityFactory.create(EntityType.MEDIUM)

    if (entity is Entity.Medium) {
        entity.printInfo()
        entity.info
    }

    Entity.Medium("2", "Prasan").printInfo()
}