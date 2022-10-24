import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class Day01Test {

    @Test
    fun inputParser() {
        assertEquals(
            listOf<Long>(1, 2, 3),
            Day01(
                "1\n" +
                        "2\n" +
                        "3"
            ).parseInput()
        )
    }

    @Test
    fun solve1() {
        assertEquals(
            7, Day01(
                "199\n" +
                        "200\n" +
                        "208\n" +
                        "210\n" +
                        "200\n" +
                        "207\n" +
                        "240\n" +
                        "269\n" +
                        "260\n" +
                        "263"
            ).solve1()
        )
    }
}