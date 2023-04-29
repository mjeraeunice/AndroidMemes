package com.example.memeworld

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Pagefourmeme : AppCompatActivity() {
    lateinit var tvPreviousthree:TextView
    lateinit var tvNextfour:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pagefourmeme)
        tvPreviousthree=findViewById(R.id.tvPreviousthree)
        tvNextfour=findViewById(R.id.tvNextfour)
        tvPreviousthree.setOnClickListener {
            val intent= Intent(this,Pagethreememe::class.java)
            startActivity(intent)
        }
        tvNextfour.setOnClickListener {
            val intent= Intent(this,Pagefivememe::class.java)
            startActivity(intent)
        }
    }
}