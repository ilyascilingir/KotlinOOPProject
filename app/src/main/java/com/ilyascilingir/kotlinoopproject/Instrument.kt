package com.ilyascilingir.kotlinoopproject

interface Instrument {

    // Javada herhangi bir sınıfta fonksiyon oluşturup body siz bırakamayız fakat interface lerinde mutlaka body siz olmalı. Ancak, kotlin de iki türlü de yazılabilir (body li veya body siz)

    // Burada fonksiyon tanımlayalım.
    fun info() {
        println("instrument info")
    }
}