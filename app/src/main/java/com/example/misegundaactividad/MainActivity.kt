package com.example.misegundaactividad

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import com.example.misegundaactividad.actividadessecundarias.SecondActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(MainActivity::class.simpleName, "onCreate")

        val parametro = "Hola que tal"
        // NO HACER ESTO JAMÁS EN ANDROID
        // var a = SecondActivity()


        val tvButton = findViewById<TextView>(R.id.tvButton)

        tvButton.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra(SecondActivity.VAR1, parametro)
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(MainActivity::class.simpleName, "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(MainActivity::class.simpleName, "onResume")

    }

    override fun onRestart() {
        super.onRestart()
        Log.d(MainActivity::class.simpleName, "onRestart")

    }

    override fun onPause() {
        super.onPause()
        Log.d(MainActivity::class.simpleName, "onPause")

    }

    override fun onStop() {
        super.onStop()
        Log.d(MainActivity::class.simpleName, "onStop")

    }

    override fun onDestroy() {
        Log.d(MainActivity::class.simpleName, "onDestroy")
        super.onDestroy()
    }

}