fun main () {
    println("Введите число")
    var input = readln().toInt()
    var j = 1
    do {
        j*=input
        input--

    } while (input > 0)
    println("Факториал введенного числа  равен $j")
}

