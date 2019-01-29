import java.util.*

fun main(args: Array<String>) {
    var sName = "박모씨"
    println(sName + " - The Gamer")

    var sLines = """
        1
        2
        3
        4
        5
        6
        7
        8
        9
        10
        """

    println(sLines)

    var sFormatter = "$sLines <-- sName의 값"
    println(sFormatter)


    var sBash = "${"지금 시각은 - " + Date()}"
    println(sBash)
}