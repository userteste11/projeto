package com.example.projeto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var cliente = this.findViewById<TextView>(R.id.textView4)
        val intent = intent
        val textoCampo1 = intent.getStringExtra("chaveCampo1")

        cliente.setText(textoCampo1)
    }
}