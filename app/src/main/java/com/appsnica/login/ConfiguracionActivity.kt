package com.appsnica.login

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.*
import android.widget.Toast
import android.widget.Switch
import com.appsnica.login.R


class ConfiguracionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_configuracion)

        val btnSalir = findViewById<Button>(R.id.btn_salir_config)
        btnSalir.setOnClickListener {
            finish() // Vuelve a la actividad anterior
        }

        val switchModoOscuro = findViewById<Switch>(R.id.switch_dark_mode)
        switchModoOscuro.setOnCheckedChangeListener { _, isChecked ->
            Toast.makeText(this, if (isChecked) "Modo oscuro activado" else "Modo claro activado", Toast.LENGTH_SHORT).show()
        }
    }
}

