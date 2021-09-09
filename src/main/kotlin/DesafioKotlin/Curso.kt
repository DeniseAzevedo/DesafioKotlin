package DesafioKotlin

class Curso(
    var nome: String,
    var codigoCurso: Int,
    var profTitular: ProfessorTitular,
    var profAdjunto: ProfessorAdjunto,
    var quantidadeMaxAlunos: Int,
    var listaAlunosMatriculados: MutableList<Aluno>
) {
    // TODO: 07/09/2021 Parte B
}