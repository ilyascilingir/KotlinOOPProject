package com.ilyascilingir.kotlinoopproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //constructor
        var myUser = User("Mustafa",35)

        myUser.name = "Ilyas"
        myUser.age = 28

        println(myUser.name)
        println(myUser.age)
        println(myUser.information())

        //encapsulation
        var james = Musician("James","Guitar",55)
        //james.age = 60
        println(james.age)
        println(james.returnBandName("Ilyas"))
        println(james.returnBandName("Ali"))

        //inheritance

        var lars = SuperMusician("Lars","Drums",65)
        println(lars.name)
        println(lars.returnBandName("Ilyas"))
        lars.sing()

        //pollymorphism

            // static pollymorphism

        var mathematics = Mathematics()
        println(mathematics.sum())
        println(mathematics.sum(3,5))
        println(mathematics.sum(3,5,7))


            // dynamic pollymorphism

        val animal = Animal()
        animal.sing()

        val barley = Dog()
        barley.test()
        barley.sing()

        //abstract & interface

        //var myPeople = People()  --> abstract sınıfın instance ı oluşturulmaz.

        var myPiano = Piano()
        myPiano.brand = "Yamaha"
        myPiano.digital = false
        println(myPiano.roomName)
        myPiano.info()

        //Lambda expressions

        fun printString (myString : String){
            println(myString)
        }
        printString("My Test String")

        val testString = { myString : String -> println(myString)}
        testString("My Lambda String")

        val multiplyLambda = {a:Int,b:Int -> a*b}
        println(multiplyLambda(4,5))

        val multiplyLambda1 : (Int,Int) -> Int = { x, y -> x*y }
        println(multiplyLambda1(5,5))

        // asynchrnous

        // callback function, listener function, completion function

        fun downloadMusicians (url : String, completion : (Musician) -> Unit ){
            //url -> download
            //data

            val kirkHammet = Musician("Kirk","Guitar",60)
            completion(kirkHammet)
        }

        downloadMusicians("metallica.com", {musician ->
            println(musician.name)
        })
    }
}