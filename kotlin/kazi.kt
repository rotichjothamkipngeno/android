fun main(){


    one()
    two()

    findLCM()
four()
}


fun one(){
   println("whats your name  ")
    val name = readln()}


fun two(){

    val numbers = listOf(5, 10, 2  )
    val minNumber = numbers.min()
    println("Minimum number: $minNumber")
    val maxNumber = numbers.max()
    println("maximum number : $maxNumber")
}

fun findLCM(){

    val n1 = 4
    val n2 = 3
    var lcm: Int

    // maximum number between n1 and n2 is stored in lcm
    lcm = if (n1 > n2) n1 else n2

    // Always true
    while (true) {
        if (lcm % n1 == 0 && lcm % n2 == 0) {
            println("The LCM of $n1 and $n2 is $lcm.")
            break
        }
        ++lcm
    }



}
fun four (){
//
//    val name = readln()
//
//
//val ken = println("$name *9/5+32")
//    val nam = readln()
//
//
//
//

}
