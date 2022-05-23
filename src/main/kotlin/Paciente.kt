fun main(){
    val pacientes =Hospital(6,"Roberto Carlos", 6, true)


    println(" O nome do paciente é:${pacientes.nome} ")
    println(" O quarto dele é ${pacientes.quartos}")
    println(" O leito dele é o ${pacientes.leito}")
    pacientes.uti()

    println("$pacientes")
}
