data class Curso (var nome : String ,
             var codigo : Int ,
             var professorTitular: ProfessorTitular ,
             var professorAdjunto: ProfessorAdjunto ,
             var qtdMaxAlunos : Int ,
             var listaAlunosMatriculados : ArrayList<Aluno>) {

    fun adicionarUmAluno(umAluno: Aluno): Boolean {

        listaAlunosMatriculados.add(umAluno)

        val listaAlunoAtualizada = listaAlunosMatriculados.size

        return if (listaAlunoAtualizada >= qtdMaxAlunos) {
            return false
        } else {
            true
        }
    }
    fun excluirAluno (umAluno: Aluno){}
}
