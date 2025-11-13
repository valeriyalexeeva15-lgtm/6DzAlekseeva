fun main() {
//    val sword = Item("Меч", "оружие", 100)
//    val armor = Item("Щит", "броня", 40)
//    val potion = Item("Зелье силы", "зелье")
//
//    sword.printInfo()
//    armor.printInfo()
//    potion.printInfo()

//    val safeLocation = Location("Деревня", "Низкий", 1)
//    val dangerousLocation = Location("Пещера", "Высокий", 5)
//
//    println(safeLocation.name)
//    println(safeLocation.isDangerous())
//
//    println(dangerousLocation.name)
//    println(dangerousLocation.isDangerous())

//    val hero = Hero("Герой", 5)
//
//    val spell1 = Spell("Шаровая молния", 5, 3)
//    val spell2 = Spell("Лёд",3 , 3)
//
//    println(hero.canCast(spell1))
//    println(hero.canCast(spell2))


    val enemy1 = Enemy(60, 4)
    val enemy2 = Enemy(40)
    val enemy3 = Enemy(100, 6)

    println("Враг 1: сила = ${enemy1.calculatePower()}")
    println("Враг 2: сила = ${enemy2.calculatePower()}")
    println("Враг 3: сила = ${enemy3.calculatePower()}")
}