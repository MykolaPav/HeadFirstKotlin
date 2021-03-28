
fun main() {
    val arr = arrayOf("Rock", "Scissors", "Paper")
    val gameChoice = getGameChoice(arr)
    val userChoice = getUserChoice(arr)
    printResult(userChoice, gameChoice)
}

fun getGameChoice(option :Array<String>) = option[(Math.random() * option.size).toInt()]

fun getUserChoice(option :Array<String>) :String {
    var isValidChoice = false
    var userChoice = ""
    //Выполнять цикл, пока пользователь не введет допустимый вариант
    while (!isValidChoice){
        //Запросить у пользователя его выбор
        print("Please enter one of the following:")
        for (item in option) print(" $item")
        println(".")
        //Прочитать пользовательский ввод
        val userInput = readLine()
        //Проверить пользовательский ввод
        if (userInput != null && userInput in option) {
            isValidChoice = true
            userChoice = userInput
        }
        //Проверить пользовательский ввод
        if (!isValidChoice) println("You must enter a valid choice.")
    }
return userChoice
}
fun printResult(userChoice :String, gamerChoice :String) {
    val result :String
    //Определить результат
    if (userChoice == gamerChoice) result = "Tie!"
    else if ((userChoice == "Rock" && gamerChoice == "Scissors") ||
            (userChoice == "Paper" && gamerChoice == "Rock") ||
         (userChoice == "Scissors" && gamerChoice == "Paper")) result = "You win"
    else result = "You lose"
    //Вывести результат
    println("You chose $userChoice. I chose $gamerChoice. $result")
}