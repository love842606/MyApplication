package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var  etname:EditText
    lateinit var  bt0k:Button
    lateinit var tvName:TextView
    lateinit var  btClear: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etname = findViewById(R.id.etName)
        bt0k = findViewById(R.id.bt0k)
        tvName = findViewById(R.id.tvName)
        btClear = findViewById(R.id.btClear)

        bt0k.setOnClickListener{
            tvName.text = etname.text
        }

            btClear.setOnClickListener {
                tvName.text = ""
            }
    }
}