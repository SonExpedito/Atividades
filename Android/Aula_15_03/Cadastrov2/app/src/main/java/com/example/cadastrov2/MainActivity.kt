package com.example.cadastrov2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edtNome:EditText = findViewById(R.id.edtNome)
        val btnCadastrar:Button = findViewById(R.id.btnCadastrar)
        val edtEndereco:EditText = findViewById(R.id.edtEndereco)
        val edtBairro:EditText = findViewById(R.id.edtBairro)
        val edtCidade:EditText = findViewById(R.id.edtCidade)
        val edtEstado:EditText = findViewById(R.id.edtEstado)
        val edtCep:EditText = findViewById(R.id.edtCep)
        btnCadastrar.setOnClickListener{
            val toast= Toast.makeText(this, edtNome.text.toString()
                +"\n" + edtEndereco.text.toString()
                +"\n" + edtBairro.text.toString()
                +"\n" + edtCidade.text.toString()
                +"\n" + edtEstado.text.toString()
                +"\n" + edtCep.text.toString(), Toast.LENGTH_SHORT)

            val toast2= Toast.makeText(this, "Dados Cadastrados com Sucesso", Toast.LENGTH_SHORT)

            toast.show()
            toast2.show()
        }
    }
}