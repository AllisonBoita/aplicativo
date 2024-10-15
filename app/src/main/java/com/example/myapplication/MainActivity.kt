package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import java.util.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun sortear(view: View) {
        val textoResultado = findViewById<TextView>(R.id.text_resultado) // encontre um item de interface pelo ID
        val numeroSorteado = Random().nextInt(100) //selecione numeros de 0 a 99 - o 100 não está incluso neste caso
        textoResultado.setText("Número Gerado: $numeroSorteado") // configure um texto no meu text_view.

    }

}