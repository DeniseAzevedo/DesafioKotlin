package DesafioKotlin

import java.util.*

class DigitalHouseManager(
    var listaAlunosDH: MutableMap<Int, Aluno>,
    var listaProfessoresDH: MutableMap<Int, Professor>,
    var listaCursos: MutableMap<Int, Curso>,
    var listaMatricula: MutableMap<Int, DigitalHouseManager>,
    nome: String,
    quantidadeMaximaDeAlunos: Int,
    codigoCurso: Int,
    profTitular: ProfessorTitular,
    profAdjunto: ProfessorAdjunto,
    listaAlunosMatriculados: MutableList<Aluno>,
) : Curso(
    nome,
    codigoCurso,
    profTitular,
    profAdjunto,
    quantidadeMaximaDeAlunos,
    listaAlunosMatriculados) {

    fun registrarCurso(
        nome: String,
        codigoCurso: Int,
        quantidadeMaximaDeAlunos: Int,
    ) {
        for (indice in listaCursos.keys) {
            if (indice == codigoCurso) {
                println("Curso já existente.")
            } else listaCursos.put(codigoCurso, Curso(
                nome,
                codigoCurso,
                profTitular,
                profAdjunto,
                quantidadeMaximaDeAlunos,
                listaAlunosMatriculados
            ))
        }
    }

    fun excluirCurso(codigoCurso: Int) {
        listaCursos.remove(codigoCurso)
    }

    fun registrarProfessorAdjunto(
        nome: String,
        sobrenome: String,
        codigoProfessor: Int,
        quantidadeDeHoras: Int,
    ) {
        for (indice in listaProfessoresDH.keys) {
            if (indice == codigoProfessor) {
                println("Professor já cadastrado.")
            } else listaProfessoresDH.put(codigoProfessor, ProfessorAdjunto(nome, sobrenome, quantidadeDeHoras))
        }
    }

    fun registrarProfessorTitular(
        nome: String,
        sobrenome: String,
        codigoProfessor: Int,
        especialidade: String,
    ) {
        for (indice in listaProfessoresDH.keys) {
            if (indice == codigoProfessor) {
                println("Professor já cadastrado.")
            } else listaProfessoresDH.put(codigoProfessor, ProfessorTitular(nome, sobrenome, especialidade))
        }
    }

    fun excluirProfessor(codigoProfessor: Int) {

        listaProfessoresDH.remove(codigoProfessor)
    }

    fun matricularAluno(nome: String, sobrenome: String, codigoAluno: Int) {

        for (indice in listaAlunosDH.keys) {
            if (indice == codigoAluno) {
                println("Aluno já cadastrado.")
            } else listaAlunosDH.put(codigoAluno, Aluno(nome, sobrenome))
        }
    }

    fun matricularAlunoNoCurso(codigoAluno: Int, codigoCurso: Int) {

        for (indice in listaCursos.keys) { //Se curso pretendido estiver na lista de cursos
            if (indice == codigoCurso) {
                for (indice in listaAlunosDH.keys) { // se aluno já estiver cadastrado na escola
                    if (indice == codigoAluno) {
                        if (adicionarUmAluno(listaAlunosDH[indice])) {
                            // adiciona aluno no curso desde que não tenha atingido quantidade máxima de alunos
                            //Se adicionar aluno retornar true então conclui a matrícula do aluno no curso desejado
                            Matricula(listaAlunosDH[indice].toString(), listaCursos[indice].toString(), Date())
                            println("Aluno matriculado com sucesso no curso ${listaCursos[indice]}.")
                        }
                    }
                }
            } else println("Cadastro inexistente.")
        }

        fun alocarProfessores(
            codigoCurso: Int,
            codigoProfessorTitular: Int,
            codigoProfessorAdjunto: Int,
        ) {
            // TODO: 09/09/2021
        }
    }
}