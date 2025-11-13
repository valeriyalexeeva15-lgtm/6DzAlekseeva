fun main() {
    val sword = Item("Меч", "оружие", 100)
    val armor = Item("Щит", "броня", 40)
    val potion = Item("Зелье силы", "зелье")

    sword.printInfo()
    armor.printInfo()
    potion.printInfo()
}