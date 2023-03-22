package com.example.diceroller

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Criando uma Variável para o Botão e Utilizando o reconhecedor de Click
        val rollButton:Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener{ rollDice()}
    }
    @SuppressLint("SetTextI18n")
    private fun rollDice(){
        Toast.makeText(this, "Botão Pressionado", Toast.LENGTH_SHORT).show()
        val randomInt = (1..6).random() //Número aleatório
        val resultText: TextView = findViewById(R.id.text_result) //Criando variável do objeto criado
        resultText.text = "Dice Rolled" //Aribuindo valor
        resultText.text = randomInt.toString() //Atribuindo valor, e pasando o aleatório para String

    }


}