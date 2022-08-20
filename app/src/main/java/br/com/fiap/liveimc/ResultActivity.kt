package br.com.fiap.liveimc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ResultActivity : AppCompatActivity() {

    lateinit var textViewResult: TextView
    lateinit var textStatus: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        textViewResult = findViewById(R.id.text_imc)
        textStatus= findViewById(R.id.text_status_imc)

        val bmi = intent.getDoubleExtra("bmi_value", 0.0)

        textViewResult.text = String.format("%.2f", bmi)
        textStatus.text = intent.getStringExtra("status")

    }
}