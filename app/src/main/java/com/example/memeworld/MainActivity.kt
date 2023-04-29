package com.example.memeworld

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var tvNextpage:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvNextpage = findViewById(R.id.tvNextpage)
        tvNextpage.setOnClickListener {
            val intent= Intent(this,Pagetwomeme::class.java)
            startActivity(intent)
        }
    }
}