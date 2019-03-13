package fr.intech.s5

import android.app.Activity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.rules_activity.*
import java.io.File

class Rules: Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.rules_activity)

        var rulesText : TextView = findViewById(R.id.rulesText)
        var file : String = "./regles.md"
        var rules : String = File(file).readText(Charsets.UTF_8)

        rulesText.text = rules
    }
}