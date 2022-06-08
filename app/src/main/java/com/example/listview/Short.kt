package com.example.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.listview.databinding.ActivityLongBinding
import com.example.listview.databinding.ActivityShortBinding

class Short : AppCompatActivity() {
    private lateinit var b: ActivityShortBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityShortBinding.inflate(layoutInflater)
        setContentView(b.root)
    }
}