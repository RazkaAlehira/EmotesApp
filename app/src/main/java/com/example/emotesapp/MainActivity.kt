package com.example.emotesapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.emotesapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val inflater = layoutInflater
        binding = ActivityMainBinding.inflate(inflater)
        setContentView(binding.root)

        binding.btnChatNow.setOnClickListener {
            binding.btnChatNow.text = "Login"
        }
    }
}