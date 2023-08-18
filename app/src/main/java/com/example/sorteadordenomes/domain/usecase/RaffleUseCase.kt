class RaffleUseCase {
    fun raffle(names: ArrayList<String>): String {
        val randomIndex = Random.nextInt(names.size)
        return names[randomIndex]
    }
}