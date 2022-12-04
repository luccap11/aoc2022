import java.io.File

fun main(args: Array<String>) {
    var top = 0
    var sum = 0
    File("day1\\src\\calories.txt").forEachLine {
        if (it.isEmpty()) {
            if (sum > top) {
                top = sum
            }
            sum = 0
        } else {
            sum += it.toInt()
        }
    }
    println(top)
}