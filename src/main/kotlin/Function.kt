fun cows (secretWord:String,tryWord:String):Int{
    var swSet:MutableSet<Char> = mutableSetOf<Char>()
    secretWord.forEach { ch -> swSet.add(ch) }
    swSet=swSet.sorted().toMutableSet()

    var twSet:MutableSet<Char> = mutableSetOf<Char>()
    tryWord.forEach { ch -> twSet.add(ch) }
    twSet=twSet.sorted().toMutableSet()

    var count = 0
    for (i in swSet){
        if (twSet.contains(i)){
            count++
        }
    }
    return count
}
fun bik (secretWord:String,tryWord:String):Int{
    val swSet:MutableSet<Char> = mutableSetOf<Char>()
    secretWord.forEach { ch -> swSet.add(ch) }

    val twSet:MutableSet<Char> = mutableSetOf<Char>()
    tryWord.forEach { ch -> twSet.add(ch) }
    var count = 0
    for (i in 0 until swSet.size){
        if (swSet.toMutableList()[i]==twSet.toMutableList()[i]){
            count++
        }
    }
    return count
}
fun unic (tryWord: String,lenght:Int):Boolean{
    var twSet:MutableSet<Char> = mutableSetOf<Char>()
    tryWord.forEach { ch -> twSet.add(ch) }
    var boo = false
    if (twSet.size != lenght){
        println("Неверно введена длина или есть повторяющиеся числа")
        boo = true
    }
    return boo
}