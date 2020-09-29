class DigitalHouseManager {
        var listaAlunos: ArrayList<Aluno> = arrayListOf()
        var listaProfessores: ArrayList<Professor> = arrayListOf()
        var listaCursos: ArrayList<Curso> = arrayListOf()
        var listaMatriculas: ArrayList<Matricula> = arrayListOf()


    fun registrarCurso(nome: String , codigo: Int , qtdMaxAlunos: Int) {
        val novoCurso = Curso()
        novoCurso.nome = nome
        novoCurso.codigo = codigo
        novoCurso.qtdMaxAlunos = qtdMaxAlunos

        listaAlunos.add(novoCurso)

    }

    fun excluirCurso(codigo: Int) {
        for (codigo in listaCursos) {
            if (codigo == codigo) {
                listaCursos.remove(codigo)
            }
        }
    }

    fun registrarProfessorAdjunto(professorAdjunto: ProfessorAdjunto) {
        registrarProfessorAdjunto(professorAdjunto)
        listaProfessores.add(professorAdjunto)
    }

    fun registrarProfessorTitular(professorTitular: ProfessorTitular) {
        registrarProfessorTitular(professorTitular)
        listaProfessores.add(professorTitular)
    }

    fun excluirProfessor(codigo: Int) {
        for (codigo in listaProfessores) {
            if (codigo == codigo) {
                listaProfessores.remove(codigo)
            }

        }
    }

    fun registrarAluno(aluno: Aluno) {
        registrarAluno(aluno)
        listaAlunos.add(aluno)
    }

}


