import com.dumdumbich.study.enternalstudent.data.LogFile
import java.time.LocalDateTime

const val MESSAGE_Hello = "Hello, Eternal Student"
const val MESSAGE_Args = "Program arguments:"


fun main(args: Array<String>) {
    val timeAppLaunched = LocalDateTime.now()
    println(MESSAGE_Hello)
    println("$MESSAGE_Args ${args.joinToString()}")

    val log = LogFile(LogFile.PATH)
    log.add("${LogFile.MESSAGE_AppLaunce} $timeAppLaunched \n")

    val timeAppCompleted = LocalDateTime.now()
    log.add("${LogFile.MESSAGE_AppComplete} $timeAppCompleted \n")
}
