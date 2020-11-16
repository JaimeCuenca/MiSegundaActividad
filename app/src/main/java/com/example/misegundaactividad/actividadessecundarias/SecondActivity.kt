package com.example.misegundaactividad.actividadessecundarias

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.misegundaactividad.R

class SecondActivity : AppCompatActivity() {

    companion object {
        const val VAR1 = "VARIABLE1"
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_activity)
        Log.d(SecondActivity::class.simpleName, "onCreate")

        val tvNormal = findViewById<TextView>(R.id.tvNormal)

        val saludo = intent.getStringExtra(VAR1)

        saludo?.let {
            tvNormal.text = saludo
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(SecondActivity::class.simpleName, "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(SecondActivity::class.simpleName, "onResume")

    }

    override fun onRestart() {
        super.onRestart()
        Log.d(SecondActivity::class.simpleName, "onRestart")

    }

    override fun onPause() {
        super.onPause()
        Log.d(SecondActivity::class.simpleName, "onPause")

    }

    override fun onStop() {
        super.onStop()
        Log.d(SecondActivity::class.simpleName, "onStop")

    }

    override fun onDestroy() {
        Log.d(SecondActivity::class.simpleName, "onDestroy")
        super.onDestroy()
    }
}