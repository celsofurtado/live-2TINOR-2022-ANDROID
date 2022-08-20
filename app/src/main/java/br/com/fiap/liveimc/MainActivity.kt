package br.com.fiap.liveimc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var editTextWeight: EditText
    lateinit var editTextHeight: EditText
    lateinit var buttonCalculate: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Criar referência para os componentes de tela
        editTextWeight = findViewById(R.id.edit_text_weight)
        editTextHeight = findViewById(R.id.edit_text_height)
        buttonCalculate = findViewById(R.id.button_calculate)

        // Ouvinte de click no botão
        buttonCalculate.setOnClickListener {
            calc()
        }

    }

    private fun calc() {
        val weight = editTextWeight.text.toString().toInt()
        val height = editTextHeight.text.toString().toDouble()

        val bmi = bmiCalculate(weight, height)

        // Abrir a activity de resultado
        val openResult = Intent(this, ResultActivity::class.java)
        openResult.putExtra("bmi_value", bmi)
        openResult.putExtra("status", "Você está com peso ideal!")
        startActivity(openResult)

    }
}