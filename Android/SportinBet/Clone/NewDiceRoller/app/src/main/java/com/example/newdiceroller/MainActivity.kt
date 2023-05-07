package com.example.newdiceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Criando uma Variável para o Botão e Utilizando o reconhecedor de Click

        //Imagem
        val Imagen: ImageView = findViewById(R.id.DiceImage)
        Imagen.setImageResource(R.drawable.dice_1)

        //Rolar
        val rollButton: Button = findViewById(R.id.botaozinho)
        rollButton.setOnClickListener { rollDice() }



    }

        private fun rollDice(){
            //Criando um novo Objeto Dado com 6 lados e rola o dado
            val dice = Dice(6)
            val DiceRoll = dice.roll()

            //Acha a imagem view no layout
            val diceImage: ImageView = findViewById(R.id.DiceImage)

            //Determina o id da imagem que deve ser usada com a rolagem do dado
            val drawableResource = when (DiceRoll) {
                1 -> R.drawable.dice_1
                2 -> R.drawable.dice_2
                3 -> R.drawable.dice_3
                4 -> R.drawable.dice_4
                5 -> R.drawable.dice_5
                else -> R.drawable.dice_6
            }

            //Atualiza a Imagem do Dado, conforme o rolamento e o when
            diceImage.setImageResource(drawableResource)

            //Atualiza a descrição do conteúdo
            diceImage.contentDescription = DiceRoll.toString()


           //Inciando o Sorteio
            Sorteio(DiceRoll)

        }

     private fun Sorteio(valorzinho : Int){
         //Variáveis
             val txtizinho: TextView = findViewById(R.id.textozinho)
             var Celbitiznho: EditText = findViewById(R.id.Cellbit)

         //Alterando o Texto
             txtizinho.text = "O Número Sorteado foi " +valorzinho.toString()

         //Sorteio
             when(Celbitiznho.text.toString().toInt()){
             valorzinho -> Toast.makeText(this, "Ganhou", Toast.LENGTH_SHORT).show()
             else -> Toast.makeText(this, "Perdeu", Toast.LENGTH_SHORT).show()
             }

     }


}