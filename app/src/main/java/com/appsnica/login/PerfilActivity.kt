package com.appsnica.login

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import android.widget.Toast

class PerfilActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        try {
            setContentView(R.layout.activity_perfil)

            val nombreUsuario = intent.getStringExtra("NOMBRE_USUARIO") ?: "Nombre no disponible"
            val correoUsuario = intent.getStringExtra("CORREO_USUARIO") ?: "Correo no disponible"

            val nameText = findViewById<TextView>(R.id.perfil_name)
            val emailText = findViewById<TextView>(R.id.profile_email)

            nameText.text = "Nombre: $nombreUsuario"
            emailText.text = "Correo: $correoUsuario"

            findViewById<Button>(R.id.btn_logout).setOnClickListener {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                finish()
            }

            val btnSalir = findViewById<Button>(R.id.btn_regresar_menu)
            btnSalir.setOnClickListener {
                finish() // Vuelve a la actividad anterior
            }
        } catch (e: Exception) {
            Toast.makeText(this, "Error: ${e.message}", Toast.LENGTH_LONG).show()
            e.printStackTrace()
        }
    }
}