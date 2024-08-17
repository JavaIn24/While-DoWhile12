package Task6

fun main (){
    var a = 350.0
    var month = 0

    while (month++ <= 9){
        a += a * 0.07
    }
    println(a.toInt())
}