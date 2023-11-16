import java.lang.Exception

fun main() {
    var lenghtOfWord:Int=-1
    while (lenghtOfWord>10 || lenghtOfWord<4){
        var boo = true
        while (boo){
            println("Загадайте длину неизвестного числа от 4 до 10")

            try{
                lenghtOfWord = readln().toInt()
                boo = false
            }
            catch (Ex:Exception){
                println("Это не число")
            }
        }
        if (lenghtOfWord>10 || lenghtOfWord<4){
            println("Длина должна быть от 4 до 10")
        }
    }

    var secretWord = (0..9).shuffled().joinToString("").substring(0,lenghtOfWord)
    println("Показать секретное число?\n1.Да")
    var answer = readln()
    if (answer == "1" || answer.lowercase() =="да")
        println("Секретное число: "+secretWord)

    var tryWord:String=""
    var countOfTryes =0
    do {
        countOfTryes++
        println("\n\nВведите число")
        tryWord = readln()
        while (unic(tryWord,lenghtOfWord)){
            tryWord = readln()
        }
        println( "${cows(secretWord,tryWord)-bik(secretWord,tryWord)} коров(ы)")
        println( "${bik(secretWord,tryWord)} бык(а)")
    }
    while (bik(secretWord, tryWord)!=lenghtOfWord)
    println("Поздравляю с победой. Вы решили секретное число с попытки ${countOfTryes}")
}