//1
fun showGameLogo() {
    println("=== EPIC QUEST ===")
}
//2
fun showEnemy(name: String, level: Int) {
    println("Враг: $name (Уровень: $level)")
}
//3
fun spawnEnemy(name: String, health: Int = 100, isBoss: Boolean = false) {
    println("Враг: $name (Здоровье: $health HP${if (isBoss) " | БОСС!" else ""}")
}
//4
fun spawnEnemy2(name: String, health: Int = 100, isBoss: Boolean = false) {
    println("Враг: $name (Здоровье: $health HP${if (isBoss) " | БОСС!" else ""}")
}
//5
fun calculateXP(level: Int): Int {
    return level * 1000
}
//6
fun checkInventory(item: String): Boolean {
    val inventory = listOf("Меч", "Щит", "Ключ", "Карта")
    return item in inventory
}
//7
fun castSpell() {
    println("Каст случайного заклинания!")
}

fun castSpell(spell: String) {
    println("Каст заклинания $spell!")
}

fun castSpell(spell: String, power: Int) {
    println("Каст $spell с силой $power!")
}
//8
fun createWeapon(name: String): String {
    return "Оружие: $name"
}
fun createWeapon(name: String, damage: Int): String {
    return "Оружие: $name (Урон: $damage)"
}
fun createWeapon(damage: Int, isMagic: Boolean): String {
    return "${if (isMagic) "Магическое" else "Обычное"} оружие (Урон: $damage)"
}
//9
fun heal() {
    println("Лечение: +10 HP")
}
fun heal(amount: Int) {
    println("Лечение: +$amount HP")
}
fun heal(amount: Int, isPotion: Boolean) {
    if (isPotion) {
        println("Выпито зелье (+$amount HP)")
    } else {
        println("Заклинание лечения (+$amount HP)")
    }
}
fun main() {
    //1
    showGameLogo()
    showGameLogo()
    //2
    showEnemy("Дракон", 15)
    showEnemy("Вампир", 10)
    //3
    spawnEnemy("Дракон", isBoss = true)
    spawnEnemy("Орк", 150)
    spawnEnemy("Вампир", 200, true)

    //4
    spawnEnemy2("Гигант", 300)
    spawnEnemy2("Король Тьмы", 500, true)

    //5
    val xpForLevel5 = calculateXP(5)
    println("Для 5 уровня надо $xpForLevel5 опыта")
    //6
    println("Есть ли Меч в инвентаре: ${checkInventory("Меч")}")
    println("Есть ли Зелье в инвентаре: ${checkInventory("Зелье")}")

    //7
    castSpell()
    castSpell("Огненный шар")
    castSpell("Исцеление", 75)
    //8
    println(createWeapon("Нож"))
    println(createWeapon("Секира", 28))
    println(createWeapon(60, true))
    println(createWeapon(22, false))
    //9
    heal()
    heal(50)
    heal(150, true)
    heal(225, false)

}
