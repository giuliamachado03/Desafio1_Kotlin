class DigitalHouseManager {

    var listaAlunos = arrayListOf<Aluno>()
    var listaProfessores = arrayListOf<Professor>()
    var listaCursos = arrayListOf<Curso>()
    var listaMatriculas = arrayListOf<Matricula>()


    fun registrarCurso(nome: String , codigoDoCurso: Int , qtdMaxAlunos: Int) {
        val novoCurso = Curso(nome , codigoDoCurso , qtdMaxAlunos)
        listaCursos.add(novoCurso)

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
                    break
                }

            }
        }

        fun matricularAluno(nome: String , sobrenome: String , codigoDoAluno: Int) {
            val novoAlunoMatriculado = Aluno(nome , sobrenome , codigoDoAluno)
            listaAlunos.add(novoAlunoMatriculado)
        }

        fun matricularAluno(codigoAluno: Int , codigoDoCurso: Int) {

            for (aluno in listaAlunos) {
                if (codigoAluno == aluno.codigoAluno) {
                    for (curso in listaCursos) {
                        if (codigoDoCurso == curso.codigoDoCurso) {
                            curso.adicionarUmAluno(aluno)
                            listaMatriculas.add(Matricula(aluno , curso))
                            println("Matricula realizada!")
                        } else {
                            println("Não foi possível realizar a matricula. Não há mais vagas.")
                        }
                    }
                }

            }

        }

        fun alocarProfessores(codigoDoCurso: Int, codigoProfessorTitular: Int, codigoProfessorAdjunto: Int) {

            listaCursos.forEach{ it ->

                if (codigoDoCurso == it.codigoDoCurso){
                    for (professor in listaProfessores){
                        if (codigoProfessorAdjunto == professor.codigoDoProfessor){
                            it.professorAdjunto
                            if (codigoProfessorTitular == professor.codigoDoProfessor){
                                it.professorTitular
                            }
                            }
                        }
                    }
                }

        }

        fun Any.add(element: Curso) = Unit
    }
}


