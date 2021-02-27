package com.example.emotesapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.emotesapp.databinding.ActivityChatBinding
import com.example.emotesapp.databinding.ActivityMainBinding

class ChatActivity : AppCompatActivity() {

    private lateinit var binding: ActivityChatBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val inflater = layoutInflater
        binding = ActivityChatBinding.inflate(inflater)
        setContentView(binding.root)

        binding.btnBack
    }
}