package com.appsnica.login

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.content.Intent
import android.widget.Button
import android.widget.EditText
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    private lateinit var nombreInput: EditText
    private lateinit var correoInput: EditText
    private lateinit var passwordInput: EditText
    private lateinit var loginBtn: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nombreInput = findViewById(R.id.nombre_input)
        correoInput = findViewById(R.id.email_input)
        passwordInput = findViewById(R.id.password_input)
        loginBtn = findViewById(R.id.login_button)

        loginBtn.setOnClickListener {
            val nombre = nombreInput.text.toString()
            val correo = correoInput.text.toString()
            val password = passwordInput.text.toString()

            if (nombre.isEmpty() || correo.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Por favor complete todos los campos", Toast.LENGTH_SHORT).show()
            } else {
                val intent = Intent(this, usuario_menu::class.java)
                intent.putExtra("NOMBRE_USUARIO", nombre)
                startActivity(intent)
                finish()
            }
        }
    }
}





















