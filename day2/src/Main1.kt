import java.io.File

fun main(args: Array<String>) {
    val winScore = 6
    val tieScore = 3
    var playScore = 0
    File("day2\\src\\input.txt").forEachLine {
        when (it) {
            "A Y" -> playScore += winScore + 2
            "B Z" -> playScore += winScore + 3
            "C X" -> playScore += winScore + 1

            "A X" -> playScore += tieScore + 1
            "B Y" -> playScore += tieScore + 2
            "C Z" -> playScore += tieScore + 3

            "A Z", -> playScore += 3
            "B X", -> playScore += 1
            "C Y", -> playScore += 2
        }
    }
    println(playScore)
}