class DigitalHouseManager {
        var listaAlunos = arrayListOf<Aluno>()
        var listaProfessores = arrayListOf<Professor>()
        var listaCursos = arrayListOf<Curso>()
        var listaMatriculas= arrayListOf<Matricula>()


    fun registrarCurso(curso: Curso) {
        curso.nome
        curso.codigoDoCurso
        curso.qtdMaxAlunos

        listaAlunos.add(curso)

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

private fun <E> ArrayList<E>.add(element: Curso) {

}


