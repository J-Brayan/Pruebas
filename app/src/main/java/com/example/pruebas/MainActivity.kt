package com.example.pruebas

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.pruebas.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var union: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        union = ActivityMainBinding.inflate(layoutInflater)
        setContentView(union.root)

        val cednit= union.editText.text
        val uno = Cosas(cednit, "1234Pass")


        union.salir.setOnClickListener(this::cerrar)

        union.button.setOnClickListener { volver(uno) }

    }

    fun volver(objeto : Cosas) {
        //val intent = Intent(this, inicioAca::class.java)
        //startActivity(intent)
        union.textView.text = objeto.cade
    }

    fun cerrar(view: View){
        finishAffinity()
    }

}

class Cosas (val cade: Editable, val clave: String){

}
