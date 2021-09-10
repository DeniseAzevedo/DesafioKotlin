package DesafioKotlin

class Aluno(
    var nome: String,
    var sobrenome: String
) {
    constructor(
        nome: String,
        sobrenome: String,
        codigoAluno: Int
    ): this(nome, sobrenome)
}