package com.example.sorteadordenomes.model

import kotlin.random.Random

class Raffle{

    val database = DataBase()
    val raffleUseCase = RaffleUseCase()

    fun raffleNameFemale():String{
        val namesFemale = database.listOfFemaleNames
        return raffleUseCase.raffle(namesFemale)
    }

    fun raffleNameMale():String{
        val namesMale = database.listOfMaleNames
        return raffleUseCase.raffle(namesMale)
    }

    fun raffleAnimal():String{
        val nameAnimal = database.animalList
        return raffleUseCase.raffle(nameAnimal)
    }
}