package com.example.rummy

class player {

    private var name: String? = null
    private var hand: hand? = null

    constructor()

    constructor(name: String?, hand: hand?) {
        this.name = name
        this.hand = hand
    }

    fun getName(): String? {
        return name
    }

    fun setName(newPlayer: String?) {
        name = name
    }

    fun getHand(): hand? {
        return hand
    }
}