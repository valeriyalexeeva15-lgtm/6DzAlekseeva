class Enemy (val health: Int, val aggressionLevel: Int = 2) {
    fun calculatePower(): Int {
        return health * aggressionLevel
    }
}