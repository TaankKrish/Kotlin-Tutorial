fun main(){
    evenodd(1)
    evenodd(2)
}

fun evenodd(num:Int){
    val result= if (num%2==0) "even" else "odd"
    println(result)
}