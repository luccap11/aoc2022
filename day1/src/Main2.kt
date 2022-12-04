import java.io.File

fun main(args: Array<String>) {
    var top = mutableListOf<Int>()
    var sum = 0
    File("day1\\src\\calories.txt").forEachLine {
        if (it.isEmpty()) {
            top.add(sum)
            sum = 0
        } else {
            sum += it.toInt()
        }
    }
    top.sortDescending()
    println(top.subList(0, 3).sum())
}