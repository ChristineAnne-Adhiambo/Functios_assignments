fun main() {
    printHello("Anne")
    remainder()
    var sum = add(3,9,9,1)
    println(sum)
    funFact("Loves avocado with sugar")
    var area =(26)

}
fun printHello(name: String?): Unit{
println("Hello $name")

}
fun remainder(){
    var y = 45
    var x = 2
    var b = y % x
    println(b)
}
fun add(num1:Int,num2:Int, num3:Int, num4: Int ): Int{
     return (num1 + num2 + num3 + num4)



}
fun funFact(String:String){
    println("Loves avocado with sugar")

}
fun area(radius: Int) :Double{
    var area = 3.14 * (radius * radius)
    return (area)
}