package com.example.memeworld

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Pagefivememe : AppCompatActivity() {
    lateinit var tvPreviousfour:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pagefivememe)
        tvPreviousfour=findViewById(R.id.tvPreviousfour)
        tvPreviousfour.setOnClickListener {
            val intent=Intent(this,Pagefourmeme::class.java)
            startActivity(intent)
        }
    }
}