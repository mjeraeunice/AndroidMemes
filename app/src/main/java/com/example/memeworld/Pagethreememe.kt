package com.example.memeworld

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Pagethreememe : AppCompatActivity() {
    lateinit var tvPrevioustwo:TextView
    lateinit var tvNextthree:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pagethreememe)
        tvPrevioustwo=findViewById(R.id.tvPrevioustwo)
        tvNextthree=findViewById(R.id.tvNextthree)
        tvPrevioustwo.setOnClickListener {
            val intent=Intent(this,Pagetwomeme::class.java)
            startActivity(intent)
        }
        tvNextthree.setOnClickListener {
            val intent=Intent(this,Pagefourmeme::class.java)
            startActivity(intent)
        }

        }

    }
