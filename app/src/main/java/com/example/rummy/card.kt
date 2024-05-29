package com.example.rummy

import com.example.rummy.models.Rank
import com.example.rummy.models.Suit


class card {

    private var value = 0
    private var cardDetails: String? = null
    private var cardIcon: String? = null

    private var rule: Rule? = null
    private var suit: Suit? = null
    private var rank: Rank? = null

    constructor()

    constructor(suit: Suit?, rank: Rank?) {
        this.rank = rank
        value = value
        this.suit = suit
        cardDetails = cardDetails
        cardIcon = cardIcon
    }

    fun getRank(): Rank? {
        return rank
    }

    fun setRank(newRank: Rank?) {
        rank = newRank
    }

    fun getValue(rank: Rank): Int {
        rule = Rule(rank.toString())
        return rule!!.getValueFromRank(rank.toString())
    }

    fun setValue(newValue: Int) {
        value = newValue
    }

    fun getSuit(): Suit? {
        return suit
    }

    fun getSuit(newSuit: Suit?) {
        suit = newSuit
    }

    fun getCardIcon(cardDetails: String): String? {

        // Spades
        if (cardDetails == "ACE of SPADES") {
            cardIcon = "ace_of_spades"
        } else if (cardDetails == "TWO of SPADES") {
            cardIcon = "two_of_spades"
        } else if (cardDetails == "THREE of SPADES") {
            cardIcon = "three_of_spades"
        } else if (cardDetails == "FOUR of SPADES") {
            cardIcon = "four_of_spades"
        } else if (cardDetails == "FIVE of SPADES") {
            cardIcon = "five_of_spades"
        } else if (cardDetails == "SIX of SPADES") {
            cardIcon = "six_of_spades"
        } else if (cardDetails == "SEVEN of SPADES") {
            cardIcon = "seven_of_spades"
        } else if (cardDetails == "EIGHT of SPADES") {
            cardIcon = "eight_of_spades"
        } else if (cardDetails == "NINE of SPADES") {
            cardIcon = "nine_of_spades"
        } else if (cardDetails == "TEN of SPADES") {
            cardIcon = "ten_of_spades"
        } else if (cardDetails == "JACK of SPADES") {
            cardIcon = "jack_of_spades"
        } else if (cardDetails == "QUEEN of SPADES") {
            cardIcon = "queen_of_spades"
        } else if (cardDetails == "KING of SPADES") {
            cardIcon = "king_of_spades"
        }

        // Clubs
        if (cardDetails == "ACE of CLUBS") {
            cardIcon = "ace_of_clubs"
        } else if (cardDetails == "TWO of CLUBS") {
            cardIcon = "two_of_clubs"
        } else if (cardDetails == "THREE of CLUBS") {
            cardIcon = "three_of_clubs"
        } else if (cardDetails == "FOUR of CLUBS") {
            cardIcon = "four_of_clubs"
        } else if (cardDetails == "FIVE of CLUBS") {
            cardIcon = "five_of_clubs"
        } else if (cardDetails == "SIX of CLUBS") {
            cardIcon = "six_of_clubs"
        } else if (cardDetails == "SEVEN of CLUBS") {
            cardIcon = "seven_of_clubs"
        } else if (cardDetails == "EIGHT of CLUBS") {
            cardIcon = "eight_of_clubs"
        } else if (cardDetails == "NINE of CLUBS") {
            cardIcon = "nine_of_clubs"
        } else if (cardDetails == "TEN of CLUBS") {
            cardIcon = "ten_of_clubs"
        } else if (cardDetails == "JACK of CLUBS") {
            cardIcon = "jack_of_clubs"
        } else if (cardDetails == "QUEEN of CLUBS") {
            cardIcon = "queen_of_clubs"
        } else if (cardDetails == "KING of CLUBS") {
            cardIcon = "king_of_clubs"
        }

        // Hearts
        if (cardDetails == "ACE of HEARTS") {
            cardIcon = "ace_of_hearts"
        } else if (cardDetails == "TWO of HEARTS") {
            cardIcon = "two_of_hearts"
        } else if (cardDetails == "THREE of HEARTS") {
            cardIcon = "three_of_hearts"
        } else if (cardDetails == "FOUR of HEARTS") {
            cardIcon = "four_of_hearts"
        } else if (cardDetails == "FIVE of HEARTS") {
            cardIcon = "five_of_hearts"
        } else if (cardDetails == "SIX of HEARTS") {
            cardIcon = "six_of_hearts"
        } else if (cardDetails == "SEVEN of HEARTS") {
            cardIcon = "seven_of_hearts"
        } else if (cardDetails == "EIGHT of HEARTS") {
            cardIcon = "eight_of_hearts"
        } else if (cardDetails == "NINE of HEARTS") {
            cardIcon = "nine_of_hearts"
        } else if (cardDetails == "TEN of HEARTS") {
            cardIcon = "ten_of_hearts"
        } else if (cardDetails == "JACK of HEARTS") {
            cardIcon = "jack_of_hearts"
        } else if (cardDetails == "QUEEN of HEARTS") {
            cardIcon = "queen_of_hearts"
        } else if (cardDetails == "KING of HEARTS") {
            cardIcon = "king_of_hearts"
        }

        // Diamonds
        if (cardDetails == "ACE of DIAMONDS") {
            cardIcon = "ace_of_diamonds"
        } else if (cardDetails == "TWO of DIAMONDS") {
            cardIcon = "two_of_diamonds"
        } else if (cardDetails == "THREE of DIAMONDS") {
            cardIcon = "three_of_diamonds"
        } else if (cardDetails == "FOUR of DIAMONDS") {
            cardIcon = "four_of_diamonds"
        } else if (cardDetails == "FIVE of DIAMONDS") {
            cardIcon = "five_of_diamonds"
        } else if (cardDetails == "SIX of DIAMONDS") {
            cardIcon = "six_of_diamonds"
        } else if (cardDetails == "SEVEN of DIAMONDS") {
            cardIcon = "seven_of_diamonds"
        } else if (cardDetails == "EIGHT of DIAMONDS") {
            cardIcon = "eight_of_diamonds"
        } else if (cardDetails == "NINE of DIAMONDS") {
            cardIcon = "nine_of_diamonds"
        } else if (cardDetails == "TEN of DIAMONDS") {
            cardIcon = "ten_of_diamonds"
        } else if (cardDetails == "JACK of DIAMONDS") {
            cardIcon = "jack_of_diamonds"
        } else if (cardDetails == "QUEEN of DIAMONDS") {
            cardIcon = "queen_of_diamonds"
        } else if (cardDetails == "KING of DIAMONDS") {
            cardIcon = "king_of_diamonds"
        }
        return cardIcon
    }
}