package com.example.rummy.ui

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import com.example.rummy.GameOver
import com.example.rummy.card
import com.example.rummy.databinding.ActivityMainBinding
import com.example.rummy.game
import com.example.rummy.hand
import com.example.rummy.models.Rank
import com.example.rummy.models.Suit
import com.example.rummy.player

class MainActivity : AppCompatActivity() {

    private val hand1 = hand()
    private val hand2 = hand()

    private val player1 = player("Player1", hand1)
    private val player2 = player("Player2", hand2)

    private val game = game(player1, player2)

    private var player1DealtCardSuit: Suit? = null
    private var player1DealtCardRank: Rank? = null
    private var player1HandOldValue = 0
    private var player1HandNewValue = 0
    private var player1Hand: ArrayList<card>? = null
    private lateinit var hand1Details: ArrayList<String>
    private var player1CardDetails: String? = null
    private var player1EachIcon: String? = null
    private lateinit var player1AllIcons: ArrayList<String>

    private var player2DealtCardSuit: Suit? = null
    private var player2DealtCardRank: Rank? = null
    private var player2HandOldValue = 0
    private var player2HandNewValue = 0
    private var player2Hand: ArrayList<card>? = null
    private lateinit var hand2Details: ArrayList<String>
    private var player2CardDetails: String? = null
    private var player2EachIcon: String? = null
    private lateinit var player2AllIcons: ArrayList<String>


    private lateinit var binding: ActivityMainBinding

    private val handler= Handler(Looper.getMainLooper())
    private val aiDelay=3000L


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)

        binding.buttonPlayer1.setOnClickListener {
            dealCardForPlayer1()

            handler.postDelayed({
                dealCardForPlayer2()
            },aiDelay)
        }


        binding.buttonResult.setOnClickListener {

            results()
        }

    }

    private fun results() {
        player1HandNewValue = game.getPlayer1HandNewValue()
        player2HandNewValue = game.getPlayer2HandNewValue()
        val outcome = game.getResult(player1HandNewValue, player2HandNewValue)

        val i= Intent(this,GameOver::class.java)
        i.putExtra("winner",outcome.toString())
        startActivity(i)
        finish()
    }


    private fun dealCardForPlayer1(){
        Toast.makeText(this,"AI Turn",Toast.LENGTH_SHORT).show()
        hand1Details = ArrayList()
        player1AllIcons = ArrayList()

        val player1CardIconImageViews = arrayListOf(
            binding.player1FirstCard,
            binding.player1SecondCard,
            binding.player1ThirdCard,
            binding.player1FourthCard
        )

        var imageViewIndex = 0

        if (player1Hand != null && player1Hand!!.size == 4) return

        player1Hand = game.dealPlayer1card()
        player1DealtCardRank = game.getplayer1DealtcardRank()
        player1DealtCardSuit = game.getplayer1DealtcardSuit()

        for (card in player1Hand!!) {
            val suit = card.getSuit()
            val rank = card.getRank()
            val cardValue = card.getValue(rank!!)

            player1CardDetails = "$rank of $suit"
            player1EachIcon = card.getCardIcon(player1CardDetails!!)

            setCardImage(player1EachIcon!!, player1CardIconImageViews[imageViewIndex])
            imageViewIndex++

            player1AllIcons.add(player1EachIcon!!)
            hand1Details.add(player1CardDetails!!)
        }
        for (player1Card in hand1Details) {
            println("Player 1 card in hand is: $player1Card")
        }

        checkAndShowResult()
    }


    private fun dealCardForPlayer2(){
        Toast.makeText(this,"Your Turn",Toast.LENGTH_SHORT).show()
        binding.buttonPlayer1.isEnabled=false
        hand2Details = ArrayList()
        player2AllIcons = ArrayList()

        val player2CardIconImageViews = arrayListOf(
            binding.player2FirstCard,
            binding.player2SecondCard,
            binding.player2ThirdCard,
            binding.player2FourthCard
        )

        var imageViewIndex = 0

        if (player2Hand != null && player2Hand!!.size == 4) return

        player2Hand = game.dealPlayer2card()
        player2DealtCardRank = game.getplayer2DealtcardRank()
        player2DealtCardSuit = game.getplayer2DealtcardSuit()

        for (card in player2Hand!!) {
            val suit = card.getSuit()
            val rank = card.getRank()
            val cardValue = card.getValue(rank!!)

            player2CardDetails = "$rank of $suit"
            player2EachIcon = card.getCardIcon(player2CardDetails!!)

            setCardImage(player2EachIcon!!, player2CardIconImageViews[imageViewIndex])
            imageViewIndex++

            player2AllIcons.add(player2EachIcon!!)
            hand2Details.add(player2CardDetails!!)
        }
        binding.buttonPlayer1.isEnabled=true
        checkAndShowResult()

    }


    private fun checkAndShowResult(){

        if(player1Hand!!.size==4 && player2Hand!!.size==4){
            binding.buttonResult.visibility=View.VISIBLE
        }
    }

    @SuppressLint("DiscouragedApi")
    private fun setCardImage(card: String, imageView: ImageView) {
        //card param example= "ace_of_spades"
        val imageId = resources.getIdentifier(card, "drawable", packageName)
        imageView.setImageResource(imageId)
    }

}

