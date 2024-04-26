package com.example.task2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.ArrayAdapter
import android.content.Intent
import java.lang.NumberFormatException
import android.widget.Toast


class ConverterActivity : AppCompatActivity() {
    private val converter = ConverterView()

    private lateinit var KeyDic: Spinner
    private lateinit var calculatorButton: Button
    private lateinit var inputText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_converter)


        calculatorButton = findViewById<Button>(R.id.calculate)
        inputText = findViewById<EditText>(R.id.inputcalculator)
        KeyDic = findViewById<Spinner>(R.id.unitChoose)


        val c = getString(R.string.Celisus)
        val k = getString(R.string.kelvin)
        val f = getString(R.string.Fehren)
        val keys = arrayOf(c,k,f)

        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, keys)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        KeyDic.adapter = adapter




        calculatorButton.setOnClickListener {
            try {
                val keyy = KeyDic.selectedItem.toString()
                val key = keyy.firstOrNull() ?: 'C'
                val valueInput = inputText.text.toString().toDoubleOrNull()
                if (valueInput != null) {
                    val conFunksjon = converter.getResult(key, valueInput)
                    if (conFunksjon != null) {
                        val intent = Intent(this, ResultActivity::class.java)
                        val message = "Result ${String.format("%.2f", conFunksjon.first)} $c, ${String.format("%.2f", conFunksjon.second)} $f, ${String.format("%.2f", conFunksjon.third)} $k"
                        intent.putExtra("Message", message)
                        startActivity(intent)
                    } else {
                        Toast.makeText(this, "Somethings wrong happend", Toast.LENGTH_SHORT).show() }
                } else {
                    Toast.makeText(this, "Invalid INPUT", Toast.LENGTH_SHORT).show()}
            } catch (e: NumberFormatException) {
                Toast.makeText(this, "Invalid input format", Toast.LENGTH_SHORT).show()
            }
        }

                }
            }


