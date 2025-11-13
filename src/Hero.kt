class Hero (val name: String, val level: Int){
    fun canCast(spell: Spell): Boolean {
        val nameLengthOk = spell.name.length <= level * 2
        val dimensionsOk = spell.width <= 5 && spell.height <= 5
        return nameLengthOk && dimensionsOk
    }
}