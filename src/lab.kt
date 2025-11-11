fun showGameLogo() {
    println("=== EPIC QUEST ===")
}
fun showEnemy(name: String, level: Int) {
    println("Враг: $name (Уровень: $level)")
}


fun main() {
    //1
    showGameLogo()
    showGameLogo()
    //2
    showEnemy("Дракон", 15)
    showEnemy("Вампир", 10)
}