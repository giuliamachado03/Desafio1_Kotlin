 class Curso (var nome: String, var codigoDoCurso: Int, var qtdMaxAlunos: Int ) {

    var professorTitular = arrayListOf<ProfessorTitular>()
    var professorAdjunto = arrayListOf<ProfessorAdjunto>()
    var listaAlunosMatriculados = arrayListOf<Aluno>()

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










