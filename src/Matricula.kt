import java.time.LocalDate

data class Matricula (var aluno: Aluno , var curso: Curso) {
    val dataDeMatricula = LocalDate.now()
}