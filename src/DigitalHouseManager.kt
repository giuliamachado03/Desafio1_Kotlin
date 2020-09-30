class DigitalHouseManager {

    var listaAlunos = arrayListOf<Aluno>()
    var listaProfessores = arrayListOf<Professor>()
    var listaCursos = arrayListOf<Curso>()
    var listaMatriculas = arrayListOf<Matricula>()


    fun registrarCurso(nome : String, codigoDoCurso : Int, qtdMaxAlunos : Int) {
        val novoCurso = Curso(nome, codigoDoCurso, qtdMaxAlunos)
        listaAlunos.add(novoCurso)

    }

    fun excluirCurso(codigoDoCurso: Int) {
        for (curso in listaCursos) {
            if (codigoDoCurso == curso.codigoDoCurso) {
                listaCursos.remove(curso)
                break
            }
        }

        fun registrarProfessorAdjunto(professorAdjunto: ProfessorAdjunto) {
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

    private fun Any.add(element: Curso) {

    }
}


