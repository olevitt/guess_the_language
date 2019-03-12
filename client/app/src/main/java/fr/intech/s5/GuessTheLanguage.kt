package fr.intech.s5

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText

class GuessTheLanguage: Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        val button : Button = findViewById(R.id.boutonPlay)
        var pseudo : EditText = findViewById(R.id.pseudo)

        button.setOnClickListener {
            if(!pseudo.text.isEmpty()) {
                openGame()
            }
        }
    }

    fun openGame() {
        val intent = Intent(this, Game::class.java)
        startActivity(intent)
    }
}