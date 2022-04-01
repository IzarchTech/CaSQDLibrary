package elements.drain

import interfaces.IBlinding
import interfaces.IFormwork

/**
 * Drain
 *
 * @param width Width of the drain
 * @param depth Depth of the drain
 * @param thickness Thickness of the slab/wall of the drain
 * @param span Span on the drain
 * @param blindingThickness Thickness of the blinding
 * @param workingAllowance Working allowance for construction
 */
class Drain(
    var width: Double,
    var depth: Double,
    var thickness: Double,
    var span: Double,
    override var blindingThickness: Double,
    var workingAllowance: Double = 0.0
) : IBlinding, IFormwork {

    val drainWidth: Double = width + (2 * thickness)

    val drainDepth: Double = depth + thickness

    val excavationDepth: Double = drainDepth + blindingThickness

    val excavationWidth: Double = drainWidth + (2 * workingAllowance)

    override fun getBlindingVolume(): Double = excavationWidth * blindingThickness * span

    override fun getAreaOfFormwork(): Double = (depth + drainDepth) * (2 * span)

    fun getVolumeOfConcrete(): Double = ((2 * depth) + drainWidth) * thickness * span

    fun getVolumeOfExcavation(): Double = excavationWidth * excavationDepth * span

    fun getVolumeOfCartAway(): Double = excavationDepth * drainWidth * span
}