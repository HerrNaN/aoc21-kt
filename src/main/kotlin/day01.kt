import cc.ekblad.konbini.*


fun main() {
    run(Day01("1 2 3"))
}

class Day01(rawInput: String) : Day<List<Long>>(rawInput) {
    override fun inputParser(): Parser<List<Long>> =
        parser {
            chain(integer, whitespace).terms
        }

    override fun solve1(): Int {
        val input = parseInput()
        var nLarger = 0
        for (i in 1 until input.size) {
            if (input[i - 1] < input[i]) {
                nLarger++
            }
        }

        return nLarger
    }

}