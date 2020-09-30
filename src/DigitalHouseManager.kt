class DigitalHouseManager {

    var listaAlunos = arrayListOf<Aluno>()
    var listaProfessores = arrayListOf<Professor>()
    var listaCursos = arrayListOf<Curso>()
    var listaMatriculas = arrayListOf<Matricula>()


    fun registrarCurso(nome: String , codigoDoCurso: Int , qtdMaxAlunos: Int) {
        val novoCurso = Curso(nome , codigoDoCurso , qtdMaxAlunos)
        listaAlunos.add(novoCurso)

    }

    fun excluirCurso(codigoDoCurso: Int) {
        for (curso in listaCursos) {
            if (codigoDoCurso == curso.codigoDoCurso) {
                listaCursos.remove(curso)
                break
            }
        }

        fun registrarProfessorAdjunto(
                nome: String ,
                sobrenome: String ,
                tempoDeCasa: Int ,
                codigoDoProfessor: Int ,
                qtdHorasMonitoria: Double ,
        ) {
            val novoProfessorAdjunto = ProfessorAdjunto(nome , sobrenome , tempoDeCasa , codigoDoProfessor , qtdHorasMonitoria)
            listaProfessores.add(novoProfessorAdjunto)
        }

        fun registrarProfessorTitular(
                nome: String ,
                sobrenome: String ,
                tempoDeCasa: Int ,
                codigoDoProfessor: Int ,
                especialidade: String ,
        ) {
            val novoProfessorTitular = ProfessorTitular(nome , sobrenome , tempoDeCasa , codigoDoProfessor , especialidade)
            listaProfessores.add(novoProfessorTitular)
        }

        fun excluirProfessor(codigoDoProfessor: Int) {
            for (professor in listaProfessores) {
                if (codigoDoProfessor == professor.codigoDoProfessor) {
                    listaProfessores.remove(professor)
                }

            }
        }

        fun matricularAluno(nome: String, sobrenome : String, codigoDoAluno: Int) {
            val novoAlunoMatriculado = Aluno(nome, sobrenome, codigoDoAluno)
            listaAlunos.add(novoAlunoMatriculado)
        }

    }

    private fun Any.add(element: Curso) {

    }
}


