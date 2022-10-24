import cc.ekblad.konbini.Parser
import cc.ekblad.konbini.ParserResult.Error
import cc.ekblad.konbini.ParserResult.Ok
import cc.ekblad.konbini.parseToEnd

abstract class Day<T>(private val rawInput: String) {

    abstract fun inputParser(): Parser<T>

    fun parseInput(): T {
        return when (val pRes = inputParser().parseToEnd(rawInput)) {
            is Ok -> pRes.result
            is Error -> throw Error("couldn't parse input: " + pRes.reason)
        }
    }

    open fun solve1(): Any {
        TODO("not implemented")
    }

    open fun solve2(): Any {
        TODO("not implemented")
    }
}

fun <T : Any> run(day: Day<T>) {
    runPart(day, 1)
    runPart(day, 2)
}

fun <T : Any> runPart(day: Day<T>, part: Int) {
    print("Part $part: ")
    try {
        println(day.solve1())
    } catch (e: NotImplementedError) {
        println(e.message)
    }
}

