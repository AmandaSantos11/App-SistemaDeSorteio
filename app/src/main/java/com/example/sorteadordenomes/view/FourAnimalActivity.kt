package com.example.sorteadordenomes.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.sorteadordenomes.R
import com.example.sorteadordenomes.model.Raffle

class FourAnimalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_four_animal)

        val button_animal = findViewById<Button>(R.id.button_raffle_animal)
        val text = findViewById<TextView>(R.id.edit_name_animal)

        button_animal.setOnClickListener {
            val nameDrawn = selectedName()
            text.text = nameDrawn
        }
    }

    private fun selectedName():String {
        val sortear = Raffle()
        return sortear.raffleAnimal()
    }
}