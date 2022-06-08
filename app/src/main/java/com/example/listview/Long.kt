package com.example.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.listview.databinding.ActivityLongBinding

class Long : AppCompatActivity() {
    private lateinit var b:ActivityLongBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityLongBinding.inflate(layoutInflater)
        setContentView(b.root)
    }
}