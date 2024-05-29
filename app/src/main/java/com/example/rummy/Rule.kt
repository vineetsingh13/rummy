package com.example.rummy

class Rule {

    private var rank: String? = null
    private var value = 0

    private var player1HandValue = 0
    private var player2HandValue = 0

    private val result: String? = null

    constructor()

    constructor(player1HandValue: Int, player2HandValue: Int) {
        this.player1HandValue = player1HandValue
        this.player2HandValue = player2HandValue
    }

    constructor(rank: String?) {
        this.rank = rank
        // Assuming there should be some logic here for `value`
        value = getValueFromRank(rank)
    }

    fun getRank(): String? {
        return rank
    }

    fun getValueFromRank(rank: String?): Int {
        when (rank) {
            "ACE" -> value = 1
            "TWO" -> value = 2
            "THREE" -> value = 3
            "FOUR" -> value = 4
            "FIVE" -> value = 5
            "SIX" -> value = 6
            "SEVEN" -> value = 7
            "EIGHT" -> value = 8
            "NINE" -> value = 9
            "TEN" -> value = 10
            "JACK" -> value = 10
            "QUEEN" -> value = 10
            "KING" -> value = 10
        }
        return value
    }

    fun getResult(player1HandNewValue: Int, player2HandNewValue: Int): String? {
        return if (player1HandNewValue > player2HandNewValue) {
            "Player1"
        } else if (player2HandNewValue > player1HandNewValue) {
            "Player2"
        } else {
            "Game Drawn"
        }
    }
}