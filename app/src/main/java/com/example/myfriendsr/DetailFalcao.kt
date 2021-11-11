package com.example.myfriendsr

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.RatingBar
import android.widget.TextView
import android.widget.Toast

class DetailFalcao : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_falcao)
        val ratingforapp = findViewById<RatingBar>(R.id.ratingBar4)
        //val textViewPuntaje = findViewById<TextView>(R.id.textViewPuntaje)
        ratingforapp.setOnRatingBarChangeListener { ratinBar, fl, b ->
            //textViewPuntaje.text = fl.toString()
            Toast.makeText(this, "Calificaste: ${fl}!!", Toast.LENGTH_LONG).show()
        }
    }
}