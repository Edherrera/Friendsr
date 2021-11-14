package com.example.myfriendsr

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RatingBar
import android.widget.Toast

class DetailMessi : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_messi)

        val ratingforapp = findViewById<RatingBar>(R.id.ratingBarMessi)
        //val CalMessi =
        //val textViewPuntaje = findViewById<TextView>(R.id.textViewPuntaje)
        ratingforapp.setOnRatingBarChangeListener { ratinBar, fl, b ->
            //textViewPuntaje.text = fl.toString()
            Toast.makeText(this, "Tu calificacíón para Messi es: ${fl}!!", Toast.LENGTH_LONG).show()
            val intent: Intent = Intent (this, MainActivity::class.java)
            //intent.putExtra
            startActivity(intent)
            finish()

        }
    }
}