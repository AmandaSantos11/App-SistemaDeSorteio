package com.example.sorteadordenomes.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.sorteadordenomes.R
import com.example.sorteadordenomes.model.Raffle

class ThreeFemaleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_three_female)

        val button_female = findViewById<Button>(R.id.button_raffle_female)
        val text = findViewById<TextView>(R.id.edit_name_female)

        button_female.setOnClickListener {
            val nameDrawn = selectedName()
            text.text = nameDrawn
        }
    }

    private fun selectedName():String {
        val sortear = Raffle()
        return sortear.raffleNameFemale()
    }
}