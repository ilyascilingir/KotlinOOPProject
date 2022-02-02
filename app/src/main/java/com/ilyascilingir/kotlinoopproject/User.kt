package com.ilyascilingir.kotlinoopproject

class User : People {

    //properties
    var name : String? = null
    var age : Int? = null

    //constructor vs init

    constructor(nameInput : String, ageInput : Int) {
        this.name = nameInput
        this.age = ageInput
    }

    init {
        println("init")
    }

}