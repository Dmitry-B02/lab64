package com.example.lab6_4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lab6_4.databinding.ActivityMainBinding
import com.squareup.picasso.Picasso

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if (binding.img.drawable == null) {
            val url = "https://i.ibb.co/LCGjry8/Screenshot-20211121-231052-Gallery.jpg"
            Picasso.get().load(url).into(binding.img)
        }
    }
}