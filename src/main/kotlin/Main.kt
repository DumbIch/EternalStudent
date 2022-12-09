import java.io.File
import java.time.LocalDateTime

fun main(args: Array<String>) {
    println("Hello, Eternal Student")
    println("Program arguments: ${args.joinToString()}")

    val file = File("EternalStudent.log")

    val startAppTime = LocalDateTime.now()
    val startAppMessage = "start at: $startAppTime \n"

    file.appendText(startAppMessage)

}