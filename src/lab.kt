fun showGameLogo() {
    println("=== EPIC QUEST ===")
}
fun showEnemy(name: String, level: Int) {
    println("Враг: $name (Уровень: $level)")
}

fun spawnEnemy(name: String, health: Int = 100, isBoss: Boolean = false) {
    println("Враг: $name (Здоровье: $health HP${if (isBoss) " | БОСС!" else ""}")
}
fun spawnEnemy2(name: String, health: Int = 100, isBoss: Boolean = false) {
    println("Враг: $name (Здоровье: $health HP${if (isBoss) " | БОСС!" else ""}")
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

}
