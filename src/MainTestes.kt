fun main() {

    val aluno1 = Aluno("Giulia" , "Machado" , 13)
    val aluno2 = Aluno("Gabriella" , "Trombini" , 11)
    val aluno3 = Aluno("Ana Luiza" , "Braidoti" , 1)
    val aluno4 = Aluno("Giovanna" , "Francisco" , 12)
    val aluno5 = Aluno("Heitor" , "Macedo" , 15)

    val listaAlunosMatriculados1 = arrayListOf<Aluno>(aluno1 , aluno2 , aluno3 , aluno4 , aluno5)
    var listaAlunosMatriculados2 = arrayListOf<Aluno>(aluno1 , aluno2 , aluno3)
    var listaAlunosMatriculados3 = arrayListOf<Aluno>(aluno4 , aluno5)


    val professorTitular1 = ProfessorTitular("Roberto" , "Machado" , 10 , 1234 , "Álgebra")
    val professorTitular2 = ProfessorTitular("Monica" , "Nascimento" , 7 , 1236 , "Funções")

    val professorAdjunto1 = ProfessorAdjunto("Renato" , "Signorini" , 5 , 1235 , 20.5)
    val professorAdjunto2 = ProfessorAdjunto("Carolina" , "Ferraz" , 3 , 1237 , 18.0)


    val curso1 = Curso("Matemática Básica" , 33 , professorTitular1 , professorAdjunto2 , 5 , listaAlunosMatriculados1)
    val curso2 = Curso("Matemática Intermediária" , 34 , professorTitular2 , professorAdjunto2 , 3 , listaAlunosMatriculados2)
    val curso3 = Curso("Matemática Avançada" , 35 , professorTitular1 , professorAdjunto1 , 2 , listaAlunosMatriculados3)


}

