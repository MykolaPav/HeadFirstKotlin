fun main () {
    val wordArray_1 = arrayOf("24/7", "multi-tier", "B-to-B", "dynamic", "pervasive")
    val wordArray_2 = arrayOf("empowered", "leveraged", "aligned", "targeted")
    val wordArray_3 = arrayOf("process", "paradigm", "solution", "portal", "vision")

    val arraySize_1 = wordArray_1.size
    val arraySize_2 = wordArray_2.size
    val arraySize_3 = wordArray_3.size

    val random_1 = (Math.random() * arraySize_1).toInt()
    val random_2 = (Math.random() * arraySize_2).toInt()
    val random_3 = (Math.random() * arraySize_3).toInt()

    val phrase = "${wordArray_1[random_1]} ${wordArray_2[random_2]} ${wordArray_3[random_3]}"
    println(phrase)

    println("myArr is ${if (wordArray_1.size > 10) "large" else "small"}")
}