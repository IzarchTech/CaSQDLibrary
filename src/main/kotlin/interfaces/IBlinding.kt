package interfaces

interface IBlinding {
    /**
     * Blinding thickness
     */
    var blindingThickness: Double

    /**
     * Calculates the volume of concrete for blinding
     *
     * @return Volume of concrete
     */
    fun getBlindingVolume(): Double
}