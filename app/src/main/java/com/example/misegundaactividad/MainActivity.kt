package com.example.misegundaactividad

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.misegundaactividad.actividadessecundarias.SecondActivity
import com.example.misegundaactividad.actividadessecundarias.ThirdActivity
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val boton1 = findViewById<Button>(R.id.button1)
        val boton2 = findViewById<Button>(R.id.button2)
        val boton3 = findViewById<Button>(R.id.button3)
        val eT_inicio = findViewById<EditText>(R.id.eT1)

        boton1.setOnClickListener{
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra(SecondActivity.VAR1, "1")
            startActivity(intent)
        }

        boton2.setOnClickListener{
            val intent = Intent(this, ThirdActivity::class.java)
            var texto = ("La longitud del edit text era: "+eT_inicio.length())
            intent.putExtra(ThirdActivity.VAR1, texto)
            startActivity(intent)
        }

        boton3.setOnClickListener{
            if(Random.nextBoolean()){
                val intent = Intent(this, SecondActivity::class.java)
                intent.putExtra(SecondActivity.VAR1, "2")
                startActivity(intent)
            }else{
                val intent = Intent(this, ThirdActivity::class.java)
                var texto = ("El texto del edit text era: "+ eT_inicio.text)
                intent.putExtra(ThirdActivity.VAR1, texto)
                startActivity(intent)
            }

        }
    }
}