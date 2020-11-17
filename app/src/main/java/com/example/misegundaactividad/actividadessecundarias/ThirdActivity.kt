package com.example.misegundaactividad.actividadessecundarias

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import com.example.misegundaactividad.MainActivity
import com.example.misegundaactividad.R

class ThirdActivity : AppCompatActivity(){
    companion object {
        const val VAR1 = "VARIABLE"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.third_activity)

        val mostrar = findViewById<TextView>(R.id.textView1)
        val texto = intent.getStringExtra(VAR1)

        texto?.let{
            mostrar.text= texto
        }
    }
}