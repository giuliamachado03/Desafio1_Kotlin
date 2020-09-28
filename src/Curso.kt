data class Curso(var nome: String ,
                 var codigo: Int ,
                 var professorTitular: ProfessorTitular ,
                 var professorAdjunto: ProfessorAdjunto ,
                 var qtdMaxAlunos: Int ,
                 var listaAlunosMatriculados: ArrayList<Aluno>) {

    fun adicionarUmAluno(umAluno: Aluno): Any {

        return if (listaAlunosMatriculados.contains(umAluno)) {
            return false
        } else if (listaAlunosMatriculados.size <= qtdMaxAlunos) {
            listaAlunosMatriculados.add(umAluno)
            return true
        } else {
        }
    }

    fun excluirAluno(umAluno: Aluno): Boolean {

        if (listaAlunosMatriculados.contains(umAluno)) {
            listaAlunosMatriculados.remove(umAluno)
            return true
        } else {
            return false
        }
    }
}










