package com.appsnica.login

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.widget.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nombreInput = findViewById<EditText>(R.id.nombre_input)
        val emailInput = findViewById<EditText>(R.id.email_input)
        val passwordInput = findViewById<EditText>(R.id.password_input)
        val loginButton = findViewById<Button>(R.id.login_button)

        loginButton.setOnClickListener {
            val nombre = nombreInput.text.toString().trim()
            val email = emailInput.text.toString().trim()
            val password = passwordInput.text.toString().trim()

            if (nombre.isEmpty() || email.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Por favor completa todos los campos", Toast.LENGTH_SHORT).show()
            } else {
                // Navegar a la pantalla principal
                val intent = Intent(this, usuario_menu::class.java)
                intent.putExtra("NOMBRE_USUARIO", nombre)
                intent.putExtra("CORREO_USUARIO", email)
                startActivity(intent)
                finish()
            }
        }
    }
}






















