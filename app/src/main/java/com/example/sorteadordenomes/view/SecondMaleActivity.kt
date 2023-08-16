package com.example.sorteadordenomes.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.sorteadordenomes.R
import com.example.sorteadordenomes.model.Raffle

class SecondMaleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_male)

        val button_male = findViewById<Button>(R.id.button_raffle_male)
        val text = findViewById<TextView>(R.id.edit_name_male)

        button_male.setOnClickListener {
            val nameDrawn = selectedName()
            text.text = nameDrawn
        }
    }

    private fun selectedName():String {
        val sortear = Raffle()
        return sortear.raffleNameMale()
    }
}