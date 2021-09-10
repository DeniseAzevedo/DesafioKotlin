package DesafioKotlin

abstract class Professor(
    var nomeProf: String,
    var sobrenome: String,
) {
    constructor(
        nomeProf: String,
        sobrenome: String,
        tempoDeCasa: Int,
        codigoProfessor: Int
    ): this(nomeProf,sobrenome){

    }

}