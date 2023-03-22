package com.example.diceroller2

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Criando uma Variável para o Botão e Utilizando o reconhecedor de Click
        val rollButton:Button = findViewById(R.id.roll_button)
        val SetupButton:Button = findViewById(R.id.SeUpt_Button)

        rollButton.setOnClickListener{ rollDice()}
        SetupButton.setOnClickListener{setUp()}
    }
    @SuppressLint("SetTextI18n")
    private fun rollDice(){

        Toast.makeText(this, "Botão Pressionado", Toast.LENGTH_SHORT).show() //Notificação

        val randomInt = (1..6).random() //Número aleatório

        val resultText: TextView = findViewById(R.id.text_result) //Criando variável do Texto visualizado
        resultText.text = "Dice Rolled!"
        resultText.text = randomInt.toString() //Atribuindo valor, e pasando o aleatório para String

    }

    private fun setUp(){

        val resultText: TextView = findViewById(R.id.text_result) //Buscando o Texto

        Toast.makeText(this, "Mudando", Toast.LENGTH_SHORT).show()

        if(resultText.text.equals("Rolar")){
            resultText.text = "1"

        }

       else{
          var resultInt = resultText.text.toString().toInt()+1
            if (resultInt<6){

                resultInt++
                resultText.text = resultInt.toString()
            }

       }


    }


}