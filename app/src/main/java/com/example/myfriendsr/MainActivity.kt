package com.example.myfriendsr

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val imaMessi = findViewById<ImageView>(R.id.imageMessi)
        val imaCris = findViewById<ImageView>(R.id.imageCristiano)
        val imaMbappe = findViewById<ImageView>(R.id.imageMbappe)
        val imaFalcao = findViewById<ImageView>(R.id.imageFalcao)
        val imaCavani = findViewById<ImageView>(R.id.imageCavani)
        val imaNeymar = findViewById<ImageView>(R.id.imageNeimar)

        imaMessi.setOnClickListener { goToMessi() }
        imaCris.setOnClickListener { gotoCristiano() }
        imaMbappe.setOnClickListener { gotoMbappe() }
        imaFalcao.setOnClickListener { gotoFalcao() }
        imaCavani.setOnClickListener { gotoCavani() }
        imaNeymar.setOnClickListener { gotoNeymar() }


    }

    fun goToMessi() {
        val secondIntent = Intent(this,DetailMessi::class.java)
        secondIntent.putExtra("MISDATOS", "El valor que quiero pasar a la otra actividad")
        startActivity(secondIntent)
        Toast.makeText(this, " Escogiste a Messi!!!", Toast.LENGTH_LONG).show()

    }

    fun gotoCristiano() {
        val secondIntent = Intent(this,DetailCristiano::class.java)
        secondIntent.putExtra("MISDATOS", "El valor que quiero pasar a la otra actividad")
        startActivity(secondIntent)
        Toast.makeText(this, " Escogiste a Cristiano!!!", Toast.LENGTH_LONG).show()
    }

    fun gotoMbappe() {
        val secondIntent = Intent(this,DetailMappe::class.java)
        secondIntent.putExtra("MISDATOS", "El valor que quiero pasar a la otra actividad")
        startActivity(secondIntent)
        Toast.makeText(this, " Escogiste a Mbappe!!!", Toast.LENGTH_LONG).show()
    }

    fun gotoFalcao() {
        val secondIntent = Intent(this,DetailFalcao::class.java)
        secondIntent.putExtra("MISDATOS", "El valor que quiero pasar a la otra actividad")
        startActivity(secondIntent)
        Toast.makeText(this, " Escogiste a Falcao!!!", Toast.LENGTH_LONG).show()
    }

    fun gotoCavani() {
        val secondIntent = Intent(this,DetailCavani::class.java)
        secondIntent.putExtra("MISDATOS", "El valor que quiero pasar a la otra actividad")
        startActivity(secondIntent)
        Toast.makeText(this, " Escogiste a Cavani!!!", Toast.LENGTH_LONG).show()
    }

    fun gotoNeymar() {
        val secondIntent = Intent(this,DetailNeymar::class.java)
        secondIntent.putExtra("MISDATOS", "El valor que quiero pasar a la otra actividad")
        startActivity(secondIntent)
        Toast.makeText(this, " Escogiste a Neymar!!!", Toast.LENGTH_LONG).show()
    }




}