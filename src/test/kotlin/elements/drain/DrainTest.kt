package elements.drain

import org.junit.Test
import kotlin.test.assertEquals

class DrainTest {
    private val drains = listOf(
        Drain(0.6, 0.6, 0.15, 1.0, 0.05, 0.225),
        Drain(1.8, 1.2, 0.15, 1.0, 0.05, 0.225)
    )

    @Test
    fun testAreaOfFormwork() {
        val expectedResults = arrayOf(2.7, 5.1)

        drains.forEachIndexed { index, drain ->
            run {
                assertEquals(expectedResults[index], 0.1, drain.getAreaOfFormwork())
            }
        }
    }

    @Test
    fun testVolumeOfBlinding()
    {
        val expectedResults = arrayOf(0.068, 0.128)

        drains.forEachIndexed { index, drain ->
            run {
                assertEquals(expectedResults[index], 0.1, drain.getBlindingVolume())
            }
        }
    }

    @Test
    fun testVolumeOfCartAway()
    {
        val expectedResults = arrayOf(0.72, 3.0)

        drains.forEachIndexed { index, drain ->
            run {
                assertEquals(expectedResults[index], 0.1, drain.getVolumeOfCartAway())
            }
        }
    }

    @Test
    fun testVolumeOfConcrete() {
        val expectedResults = arrayOf(0.315, 0.675)

        drains.forEachIndexed { index, drain ->
            run {
                assertEquals(expectedResults[index], 0.1, drain.getVolumeOfConcrete())
            }
        }
    }

    @Test
    fun testVolumeOfExcavation()
    {
        val expectedResults = arrayOf(1.08, 3.57)

        drains.forEachIndexed { index, drain ->
            run {
                assertEquals(expectedResults[index], 0.1, drain.getVolumeOfExcavation())
            }
        }
    }
}