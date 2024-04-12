

// Define la data class ChatMessage
data class ChatMessage(val author: String, val body: String)

class SampleData {
    companion object {
        // Define la lista de conversación de muestra
        val conversationSample = listOf(
            ChatMessage(
                "Lexi",
                "Test...Test...Test..."
            ),
            ChatMessage(
                "Lexi",
                """List of Android versions:
            |Android KitKat (API 19)
            |Android Lollipop (API 21)
            |Android Marshmallow (API 23)
            |Android Nougat (API 24)
            |Android Oreo (API 26)
            |Android Pie (API 28)
            |Android 10 (API 29)
            |Android 11 (API 30)
            |Android 12 (API 31)""".trimMargin()
            ),
            // Agrega más mensajes según sea necesario
        )
    }
}
