import com.dumdumbich.study.enternalstudent.data.Logfile
import com.dumdumbich.study.enternalstudent.ui.EternalStudentApp
import javafx.application.Application
import java.time.LocalDateTime

const val MESSAGE_Hello = "Hello, Eternal Student"
const val MESSAGE_Args = "Program arguments:"


fun main(args: Array<String>) {
    val timeAppLaunched = LocalDateTime.now()
    println(MESSAGE_Hello)
    println("$MESSAGE_Args ${args.joinToString()}")

    val log = Logfile(Logfile.PATH)
    log.add("${Logfile.MESSAGE_AppLaunce} $timeAppLaunched \n")

    Application.launch(EternalStudentApp::class.java, *args)

    val timeAppCompleted = LocalDateTime.now()
    log.add("${Logfile.MESSAGE_AppComplete} $timeAppCompleted \n")
}
