package com.example.newdiceroller

class Dice(private val numSides: Int) {

    /**
     * Roda randomicamente o dado e retorna o resultado
     */
    fun roll(): Int {
        return (1..numSides).random()
    }
}