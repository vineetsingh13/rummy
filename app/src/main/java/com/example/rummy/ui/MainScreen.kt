package com.example.rummy.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatDelegate
import com.example.rummy.R
import com.example.rummy.databinding.ActivityMainScreenBinding

class MainScreen : AppCompatActivity() {

    private lateinit var binding: ActivityMainScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)

        binding.playGame.setOnClickListener {
            val i=Intent(this,MainActivity::class.java)
            startActivity(i)
        }

        binding.Rules.setOnClickListener {
            showRules()
        }

        binding.exit.setOnClickListener {
            finishAffinity()
        }
    }

    private fun showRules() {

        val text="""
            1. This Rummy game is played between the player and AI.
            2. The objective is to form valid sets and sequences.
            3. Each player is dealt 4 cards at random.
            5. A valid set consists of 3 or 4 cards of the same rank but different suits.
            6. A valid sequence consists of 3 or more cards of the same suit in consecutive order.
            7. The game ends when a player declares and shows valid sets and sequences.
            8. Points are calculated based on the remaining cards in the opponent's hand.
            9. The player with the lowest points wins the game.
        """.trimIndent()

        AlertDialog.Builder(this)
            .setTitle("Rules")
            .setMessage(R.string.rules_text)
            .setCancelable(false)
            .setPositiveButton("ok",null)
            .show()
    }
}