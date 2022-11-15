package com.example.pruebas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pruebas.databinding.ActivityInicioAcaBinding
import com.example.pruebas.databinding.ActivityMainBinding

class inicioAca : AppCompatActivity() {

    private lateinit var union: ActivityInicioAcaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        union = ActivityInicioAcaBinding.inflate(layoutInflater)
        setContentView(union.root)

        //union.textView2.setText()

    }


}