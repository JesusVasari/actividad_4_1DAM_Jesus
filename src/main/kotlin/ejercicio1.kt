

fun main(){

    var nota:Int=0
    nota = readLine()!!.toInt()

    when  (nota){
       in 5..6 -> println("aprobado")
       in  7..8 ->println("notable")
       in  9..10 ->println("sobresaliente")
        in 0..4 -> println("suspenso")
        else -> println("el valor introducido es incorrecto")
    }


}