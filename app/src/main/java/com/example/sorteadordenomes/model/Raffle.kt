package com.example.sorteadordenomes.model

import kotlin.random.Random

class Raffle{

    val database = DataBase()

    private fun raffle(names: ArrayList<String>): String {
        val randomIndex = Random.nextInt(names.size)
        return names[randomIndex]
    }

    fun raffleNameFemale():String{
        val namesFemale = database.listOfFemaleNames
        return raffle(namesFemale)
    }

    fun raffleNameMale():String{
        val namesMale = database.listOfMaleNames
        return raffle(namesMale)
    }

    fun raffleAnimal():String{
        val nameAnimal = database.animalList
        return raffle(nameAnimal)
    }
}