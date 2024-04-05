fun main(){
    var digit = 7


    if (digit % 2 ==0){
        println("even")
    }
   else{
       println("odd")
   }

task()
whileloop()
}
fun task(){

    var math :Int = 100
    var  eng :Int = 100
    var phy : Int= 100
    var chem :Int = 100

    var sum = math +eng + phy + chem
    var mean = sum/4
    println(mean)

    if ( mean <=30){
        println("E")
    }
    else if (mean<=50){
        println("D")

    }
    else if (mean <= 65){
        println("c")
    }
    else if (mean <= 75){
        println("B")
    }
    else if (mean <= 100) {
        println("A")
    }
   else{
       println("invalid")
   }
}
fun whileloop() {

    var grade = 10

   while (grade< 70){
       println(grade)
       grade++

   }









}