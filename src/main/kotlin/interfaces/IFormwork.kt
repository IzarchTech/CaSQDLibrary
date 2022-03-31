package interfaces

sealed interface IFormwork {
    /**
     * Calculates the area covered by formwork
     *
     * @return Area of formwork
     */
    fun getAreaOfFormwork(): Double
}