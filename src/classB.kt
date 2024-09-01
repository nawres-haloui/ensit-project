class classB {
    val number = 2
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as classB

        return number == other.number
    }

    override fun hashCode(): Int {
        return number
    }

}