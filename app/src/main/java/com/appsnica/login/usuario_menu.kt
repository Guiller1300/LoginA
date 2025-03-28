package com.appsnica.login
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class usuario_menu : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_usuario_menu)

        val nombreUsuario = intent.getStringExtra("NOMBRE_USUARIO")
        val welcomeText = findViewById<TextView>(R.id.welcome_text)
        welcomeText.text = "¡Bienvenido, $nombreUsuario!"

        findViewById<Button>(R.id.btn_perfil).setOnClickListener {
            startActivity(Intent(this, PerfilActivity::class.java))
        }

        findViewById<Button>(R.id.btn_config).setOnClickListener {
            startActivity(Intent(this, ConfiguracionActivity::class.java))
        }

        findViewById<Button>(R.id.btn_logout).setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}