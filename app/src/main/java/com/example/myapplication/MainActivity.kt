package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etname = findViewById<EditText>(R.id.etname)
        val bt0k = findViewById<Bytton>(R.id.bt0k)
        val tvName = findViewById<TextView>(R.id.tvName)

        bt0k.set0nClickListener {
            tvName.text = etname.text
        }
    }
}