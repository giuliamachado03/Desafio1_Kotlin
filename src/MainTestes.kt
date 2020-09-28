fun main() {

    val aluno1 = Aluno("Giulia" , "Machado" , 13)
    val aluno2 = Aluno("Gabriella" , "Trombini" , 11)
    val aluno3 = Aluno("Ana Luiza" , "Braidoti" , 1)
    val aluno4 = Aluno("Giovanna" , "Francisco" , 12)
    val aluno5 = Aluno("Heitor" , "Macedo" , 15)

    val professorTitular1 = ProfessorTitular("Roberto" , "Machado" , 10 , 1234 , "Álgebra")
    val professorTitular2 = ProfessorTitular("Monica" , "Nascimento" , 7 , 1236 , "Funções")

    val professorAdjunto1 = ProfessorAdjunto("Renato" , "Signorini" , 5 , 1235 , 20.5)
    val professorAdjunto2 = ProfessorAdjunto("Carolina" , "Ferraz" , 3 , 1237 , 18.0)

    val listaAlunosMatriculados1 = arrayListOf<Aluno>(aluno1,aluno2,aluno3)

    val curso1 = Curso("Matemática Básica" , 33 , professorTitular1 , professorAdjunto2 , 4 , listaAlunosMatriculados1)


    // Teste 1 - Método adiconarUmAluno da Classe Curso
    // Considerando val listaAlunosMatriculados1 = arrayListOf<Aluno>(aluno1,aluno2,aluno3)
    // print(curso1.adicionarUmAluno(aluno1)) - false
    // print(curso1.adicionarUmAluno(aluno2)) - false
    // print(curso1.adicionarUmAluno(aluno3))
    //print(curso1.adicionarUmAluno(aluno4)) - true
    //print(curso1.adicionarUmAluno(aluno5)) - true
    //println(listaAlunosMatriculados1) - conferência

   // Teste 2 - Método excluirAluno
    // Considerando val listaAlunosMatriculados1 = arrayListOf<Aluno>(aluno1,aluno2,aluno3)
    // print(curso1.excluirAluno(aluno5)) - false
    // print(curso1.excluirAluno(aluno4)) - false
    // print(curso1.excluirAluno(aluno3)) - true
    // print(curso1.excluirAluno(aluno2)) - true
    // print(curso1.excluirAluno(aluno1)) - true


    print(curso1.excluirAluno(aluno1))
}




