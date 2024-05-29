package com.example.rummy

import com.example.rummy.models.Rank
import com.example.rummy.models.Suit
import kotlin.random.Random


class deck {

    private val suit: Suit? = null
    private val rank: Rank? = null
    private var deck: ArrayList<card>? = null
    private val randomGenerator: Random = Random

    init{
        deck = ArrayList<card>()
        createDeck()
    }

    fun deckSize(): Int {
        return deck!!.size
    }

    fun createDeck() {
        for (suit in Suit.entries) {
            for (rank in Rank.values()) {
                deck!!.add(card(suit, rank))
            }
        }
    }

    fun dealRandomcard(): card {
        val index: Int = randomGenerator.nextInt(deck!!.size)
        return deck!![index]
    }
}