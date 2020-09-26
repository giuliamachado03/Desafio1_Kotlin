class ProfessorTitular(nome: String ,
                       sobrenome: String ,
                       tempoDeCasa: Short ,
                       codigoDoProfessor: Int ,
                       var especialidade: String) : Professor(nome , sobrenome , tempoDeCasa , codigoDoProfessor) {
}