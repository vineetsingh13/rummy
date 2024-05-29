package com.example.rummy

import com.example.rummy.models.Rank
import com.example.rummy.models.Suit


class game {

    private var player1HandOldValue = 0
    private var player1HandNewValue = 0
    private var player2HandOldValue = 0
    private var player2HandNewValue = 0

    private var player1DealtcardSuit: Suit? = null
    private var player1DealtcardRank: Rank? = null
    private var player2DealtcardSuit: Suit? = null
    private var player2DealtcardRank: Rank? = null

    private var player1Hand: ArrayList<card>? = null
    private var player2Hand: ArrayList<card>? = null

    private var player1Name: String? = null
    private var player2Name: String? = null

    private var result: String? = null
    private var resultMessage: String? = null

    var hand1: hand = hand()
    var hand2: hand = hand()

    private var player1: player = player("Player1", hand1)
    private var player2: player = player("Player2", hand2)

    var rule: Rule = Rule()

    constructor(player1: player, player2: player) {
        this.player1 = player1
        this.player2 = player2
        player1Name = player1Name
        player2Name = player2Name
        player1Hand = ArrayList<card>()
        player2Hand = ArrayList<card>()
        player1HandOldValue = player1HandOldValue
        player1HandNewValue = player1HandNewValue
        player2HandOldValue = player2HandOldValue
        player2HandNewValue = player2HandNewValue
        player1DealtcardSuit = player1DealtcardSuit
        player1DealtcardRank = player1DealtcardRank
        player2DealtcardSuit = player2DealtcardSuit
        player2DealtcardRank = player2DealtcardRank
    }

    fun getPlayer1(): player {
        return player1
    }

    fun getPlayer2(): player {
        return player2
    }

    fun getPlayer1Hand(): hand? {
        return player1.getHand()
    }

    fun getPlayer2Hand(): hand? {
        return player2.getHand()
    }

    fun dealPlayer1card(): ArrayList<card>? {
        player1Hand = hand1.buildHand()
        val player1 = player("Player1", hand1)
        player1Name = player1.getName()
        player1DealtcardSuit = hand1.getcardSuit()
        player1DealtcardRank = hand1.getcardRank()
        player1Hand = hand1.getcardsInHand()
        for (card in player1Hand!!) {
            val suit: Suit = card.getSuit()!!
            val rank: Rank = card.getRank()!!
            val cardValue: Int = card.getValue(rank)
        }
        player1HandNewValue = player1HandOldValue + hand1.getcardValue()
        player1HandOldValue = player1HandNewValue
        return player1Hand
    }

    fun getPlayer1HandNewValue(): Int {
        return player1HandNewValue
    }

    fun getplayer1DealtcardSuit(): Suit? {
        return player1DealtcardSuit
    }

    fun getplayer1DealtcardRank(): Rank? {
        return player1DealtcardRank
    }

    fun getPlayer1HandSize(): Int {
        return player1Hand!!.size
    }

    fun dealPlayer2card(): ArrayList<card>? {
        player2Hand = hand2.buildHand()
        val player2 = player("Player2", hand2)
        player2Name = player2.getName()
        player2DealtcardSuit = hand2.getcardSuit()
        player2DealtcardRank = hand2.getcardRank()
        player2Hand = hand2.getcardsInHand()
        for (card in player2Hand!!) {
            val suit: Suit = card.getSuit()!!
            val rank: Rank = card.getRank()!!
            val cardValue: Int = card.getValue(rank)
        }
        player2HandNewValue = player2HandOldValue + hand2.getcardValue()
        player2HandOldValue = player2HandNewValue
        return player2Hand
    }

    fun getPlayer2HandNewValue(): Int {
        return player2HandNewValue
    }

    fun getplayer2DealtcardSuit(): Suit? {
        return player2DealtcardSuit
    }

    fun getplayer2DealtcardRank(): Rank? {
        return player2DealtcardRank
    }

    fun getPlayer2HandSize(): Int {
        return player2Hand!!.size
    }

    fun getResult(player1HandNewValue: Int, player2HandNewValue: Int): String? {
        var player1HandNewValue = player1HandNewValue
        var player2HandNewValue = player2HandNewValue
        player1HandNewValue = getPlayer1HandNewValue()
        player2HandNewValue = getPlayer2HandNewValue()
        result = rule.getResult(player1HandNewValue, player2HandNewValue)
        resultMessage = if (result == "Player1") {
            player1.getName() + " is the winner!!!"
        } else if (result == "Player2") {
             "AI is the winner!!!"
        } else {
            "It's a draw!!!"
        }
        return resultMessage
    }
}