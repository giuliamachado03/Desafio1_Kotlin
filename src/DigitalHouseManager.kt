
class DigitalHouseManager( var listaAlunos : ArrayList<Aluno>,
                           var listaProfessores : ArrayList<Professor>,
                           var listaCursos : ArrayList<Curso>,
                           var listaMatriculas : ArrayList<Matricula>) {

    fun registrarCurso(curso: Curso) {
        registrarCurso(curso)
        listaCursos.add(curso)
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

}