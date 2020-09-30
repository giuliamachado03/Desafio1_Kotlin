
import java.time.LocalDateTime

data class Matricula (var aluno: Aluno , var curso: Curso) {
    val dataDeMatricula = LocalDateTime.now()
}