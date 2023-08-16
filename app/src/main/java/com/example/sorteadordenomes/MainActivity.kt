package com.example.sorteadordenomes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.sorteadordenomes.view.FourAnimalActivity
import com.example.sorteadordenomes.view.SecondMaleActivity
import com.example.sorteadordenomes.view.ThreeFemaleActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bt_male = findViewById<Button>(R.id.button_male)

        val bt_female = findViewById<Button>(R.id.button_female)

        val bt_pet = findViewById<Button>(R.id.button_pet)

        bt_male.setOnClickListener {
            openNextScreenTwo()
        }

        bt_female.setOnClickListener {
            openNextScreenThree()
        }

        bt_pet.setOnClickListener {
            openNextScreenFour()
        }
    }

    private fun openNextScreenTwo(){
        val intent = Intent(this,SecondMaleActivity::class.java)
        startActivity(intent)
    }

    private fun openNextScreenThree(){
        val intent = Intent(this,ThreeFemaleActivity::class.java)
        startActivity(intent)
    }

    private fun openNextScreenFour(){
        val intent = Intent(this,FourAnimalActivity::class.java)
        startActivity(intent)
    }
}