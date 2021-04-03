package com.example.calculadoradenotas

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnCalcular = calcular
        val resultado = resultado

        btnCalcular.setOnClickListener {

            val nota1 = Integer.parseInt(nota1.text.toString())
            val nota2 = Integer.parseInt(nota2.text.toString())
            val pim = Integer.parseInt(pim.text.toString())
            val media = ((nota1 * 4) + (nota2 * 4) + (pim * 2)) / 10
            val faltas = Integer.parseInt(faltas.text.toString())

            if (media >= 5 && faltas <= 10) {
                    resultado.setText("Aluno foi Aprovado! " + "\n" + "Nota Final:" + media + "\n" + "Faltas: " + faltas)
                    resultado.setTextColor(Color.BLUE)
            } else {
                    resultado.setText("Aluno foi Reprovado! " + "\n" + "Nota Final:" + media + "\n" + "Faltas: " + faltas)
                    resultado.setTextColor(Color.RED)
            }

        }
        btnLimpar.setOnClickListener {
            nota1.setText("")
            nota2.setText("")
            pim.setText("")
            faltas.setText("")
            resultado.setText("")
        }
    }
}




