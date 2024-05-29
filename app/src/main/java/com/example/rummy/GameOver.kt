package com.example.rummy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.rummy.databinding.ActivityGameOverBinding
import com.example.rummy.ui.MainScreen

class GameOver : AppCompatActivity() {

    private lateinit var binding: ActivityGameOverBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityGameOverBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val str=intent.getStringExtra("winner")
        binding.materialTextView.text=str

        binding.playGame.setOnClickListener {
            val i = Intent(this,MainScreen::class.java)
            startActivity(i)
            finish()
        }
    }
}