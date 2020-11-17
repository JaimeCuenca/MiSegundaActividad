package com.example.misegundaactividad.actividadessecundarias

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import com.example.misegundaactividad.R

class SecondActivity : AppCompatActivity(){
    companion object {
        const val VAR1 = "0"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_activity)

        val imagen1 = findViewById<ImageView>(R.id.oldschool)
        val imagen2 = findViewById<ImageView>(R.id.deatheater)


        val mostrar = intent.getStringExtra(VAR1)

        if(mostrar=="1"){
            imagen1.isVisible=true
            imagen2.isVisible=false
        }else{
            imagen1.isVisible=false
            imagen2.isVisible=true
        }
    }
}