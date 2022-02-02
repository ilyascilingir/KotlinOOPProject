package com.ilyascilingir.kotlinoopproject

open class Musician(name: String, instrument: String, age: Int) {

    //Encapsulation

    // Bunları sildiğimizde de MainActivity de yine Musician sınıfı oluşturabilir fakat bu sefer değişiklik yapamayız. (set and get not allowed)

    var name : String? = name
        private set
        get

    var instrument : String? = instrument

    var age : Int? = age
        private set
        get

    private val bandName : String = "Metalica"

    fun returnBandName (password : String): String {
        if (password == "Ilyas") {
            return bandName
        } else {
            return "Wrong password !"
        }
    }

}