fun main () {
//    whileExample()
//    ifExample()
//    daBaDo()
//   firstFun()
//    arr()
//    firemen()
//    fruits()
}

fun whileExample() {
    var x = 1
    println("Before the loop. x = $x.")
    while (x < 4) {
        println("In the loop. x = $x.")
        x++
    }
    println("After the loop. x = $x.")
}

fun ifExample() {
    val x = 1
    val y = 1
        println(if (x > y) "x is greater than y" else "x is not greater than y")

    println("This line runs no matter what")
}

fun daBaDo() {
    var x = 1
    while (x < 3) {
        print(if (x == 1) "Yab" else "Dab")
    print("ba")
        x++
    }
    if (x == 3) println("Do")
}

fun firstFun() {
val x = 5
    val y = x.toDouble() / 2
    println(y)
}

fun arr() {
    val hobbits = arrayOf("Frodo", "Sam", "Merry", "Pippin")
    var x = 0
    while (x < hobbits.size) {
        println("${hobbits[x]} is a good Hobbit name")
        x++
    }
}

fun firemen() {
    val firemen = arrayOf("Pugh", "Nick", "Barney McGrew", "Cuthbert", "Dibble", "Grub")
    var firemanNo = 0
    while (firemanNo < firemen.size) {
        println("Fireman number ${firemanNo + 1} is ${firemen[firemanNo]}")
        firemanNo++
    }
}

fun fruits() {
    val index = arrayOf(1, 3, 4, 2)
    val fruit = arrayOf("Apple", "Banana", "Cherry", "Blueberry", "Pomegranate")
    var x = 0
    var y: Int
    while (x < fruit.size -1) {
        y = index[x]
        println("Fruit = ${fruit[y]}")
        x++
    }
}
