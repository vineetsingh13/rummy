package com.example.rummy

import com.example.rummy.models.Rank
import com.example.rummy.models.Suit


class hand {

    private var cardsInHand: ArrayList<card>? = null
    private var suit: Suit? = null
    private var rank: Rank? = null
    private var cardValue = 0
    private var handValue = 0
    private var handSize = 0

    var deck: deck = deck()

    init {
        cardsInHand = ArrayList<card>()
        suit = suit
        rank = rank
        cardValue = cardValue
        handValue = handValue
        handSize = handSize
    }

    fun buildHand(): ArrayList<card>? {
        handValue = 0
        val newcard: card = deck.dealRandomcard()
        cardsInHand!!.add(newcard)
        for (card in cardsInHand!!) {
            suit = card.getSuit()
            rank = card.getRank()
            cardValue = card.getValue(rank!!)
            handValue = handValue + cardValue
        }
        return cardsInHand
    }

    fun getcardSuit(): Suit? {
        return suit
    }

    fun getcardRank(): Rank? {
        return rank
    }

    fun getcardValue(): Int {
        return cardValue
    }

    fun getHandValue(): Int {
        return handValue
    }

    fun getHandSize(): Int {
        handSize = cardsInHand!!.size
        return handSize
    }

    fun getcardsInHand(): ArrayList<card>? {
        return cardsInHand
    }
}