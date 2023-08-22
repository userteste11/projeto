package com.example.projeto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    private lateinit var campoLogin: TextInputEditText
    private lateinit var campoSenha: TextInputEditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        campoLogin = findViewById(R.id.campoTexto1)
        campoSenha = findViewById(R.id.campoTexto2)
    }

    fun UsuarioLogado(view: View) {
        val textoCampo1 = campoLogin.text.toString()
        val textoCampo2 = campoSenha.text.toString()

        val intent = Intent(this, MainActivity2::class.java)
        intent.putExtra("chaveCampo1", textoCampo1)
        campoLogin.text = null
        campoSenha.text = null
        startActivity(intent)
    }
}