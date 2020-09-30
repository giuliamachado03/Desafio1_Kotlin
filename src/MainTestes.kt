
fun main() {

    val aluno1 = Aluno("Giulia", "Machado", 11)
    val aluno2 = Aluno("Heitor", "Macedo", 13)
    val aluno3 = Aluno("Gabriella", "Trombini", 12)

    var listaAlunos1 = arrayListOf<Aluno>(aluno1, aluno2)

    val curso1 = Curso("Matemática", 33, 3)
    val curso2 = Curso("Matemática Intermediária", 34, 3)
    val curso3 = Curso("Matemática Avançada", 35, 2)

    var listaCursos1 = arrayListOf<Curso>(curso1, curso2)


    val manager = DigitalHouseManager()

   print( manager.registrarCurso("Matemática", 33, 3))

}










