 class Curso (var nome: String, var codigoDoCurso: Int, var qtdMaxAlunos: Int ) {

     var professorTitular = arrayListOf<ProfessorTitular>()
     var professorAdjunto = arrayListOf<ProfessorAdjunto>()
     var listaAlunosMatriculados = arrayListOf<Aluno>()

     fun adicionarUmAluno(umAluno: Aluno) : Boolean{

         if (!listaAlunosMatriculados.contains(umAluno) && listaAlunosMatriculados.size < qtdMaxAlunos){
             listaAlunosMatriculados.add(umAluno)
             return true
         } else {
             return false
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













