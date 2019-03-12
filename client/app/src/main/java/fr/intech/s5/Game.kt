package fr.intech.s5

import android.app.Activity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class Game: Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.game_activity)

        var pseudo : EditText = findViewById(R.id.pseudo)
        var displayPseudo: TextView = findViewById(R.id.pseudoDisplay)

        displayPseudo.text = pseudo.text
    }
}