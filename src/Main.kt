fun main() {
//    val sword = Item("Меч", "оружие", 100)
//    val armor = Item("Щит", "броня", 40)
//    val potion = Item("Зелье силы", "зелье")
//
//    sword.printInfo()
//    armor.printInfo()
//    potion.printInfo()

    val safeLocation = Location("Деревня", "Низкий", 1)
    val dangerousLocation = Location("Пещера", "Высокий", 5)

    println(safeLocation.name)
    println(safeLocation.isDangerous())

    println(dangerousLocation.name)
    println(dangerousLocation.isDangerous())
}