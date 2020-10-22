package com.wcc.lancedados

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botaoLancarDados = findViewById<Button>(R.id.lanceDadosBotao)
        val valorDado1 = findViewById<TextView>(R.id.dado1)
        val valorDado2 = findViewById<TextView>(R.id.dado2)

        botaoLancarDados.setOnClickListener {
            valorDado1.text = larcarDados().toString()


        }
    }

    fun larcarDados(): Int {

        return (1..6).random();
    }
}