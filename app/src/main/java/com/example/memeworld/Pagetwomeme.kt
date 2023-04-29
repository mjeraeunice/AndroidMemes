package com.example.memeworld

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Pagetwomeme : AppCompatActivity() {
    lateinit var tvNextpagetwo:TextView
    lateinit var tvPreviouspage:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pagetwomeme)
        tvNextpagetwo=findViewById(R.id.tvNextpagetwo)
        tvPreviouspage=findViewById(R.id.tvPreviouspage)
        tvNextpagetwo.setOnClickListener {
            val intent= Intent(this,Pagethreememe::class.java)
            startActivity(intent)
        }
        tvPreviouspage.setOnClickListener {
            val intent= Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}