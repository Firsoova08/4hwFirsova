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

}
