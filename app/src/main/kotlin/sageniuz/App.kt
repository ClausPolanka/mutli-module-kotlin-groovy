package sageniuz

fun main() {
    App(ConsoleUi()).countWordsOf(text = "Hello World")
}

class App(private val ui: Ui) {
    fun countWordsOf(text: String) {
        val wc = WordCounter().countWords(text)
        ui.show(wc)
    }
}
