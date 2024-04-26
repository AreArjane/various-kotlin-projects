package com.example.task2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Button
import android.content.Intent

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.result_activity)


        val resultText = findViewById<TextView>(R.id.resultText)
        val backButton = findViewById<Button>(R.id.backButton)

        val resultDeg = intent.getStringExtra("Message")
        resultText.text = resultDeg

        backButton.setOnClickListener {
            val intent = Intent(this, ConverterActivity::class.java)
            startActivity(intent)
        }


    }
}