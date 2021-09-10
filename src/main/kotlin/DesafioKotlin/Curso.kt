package DesafioKotlin

open class Curso(
    var nome: String,
    var codigoCurso: Int,
    var profTitular: ProfessorTitular,
    var profAdjunto: ProfessorAdjunto,
    var quantidadeMaximaDeAlunos: Int,
    var listaAlunosMatriculados: MutableList<Aluno>,
) {
    fun adicionarUmAluno(umAluno: Aluno?): Boolean {
        if (listaAlunosMatriculados.size < quantidadeMaximaDeAlunos) {
            listaAlunosMatriculados.add(umAluno)
            return true
        }
        return false
    }

    fun excluirAluno(umAluno: Aluno) {
        listaAlunosMatriculados.remove(umAluno)
    }
}
