package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edName = findViewById<EditText>(R.id.edName)
        val bt0k = findViewById<Button>(R.id.button)
        val tyName = findViewById<TextView>(R.id.tyName)

        bt0k.setOnClickListener{
            tyName.text = edName.text
        }
    }
}