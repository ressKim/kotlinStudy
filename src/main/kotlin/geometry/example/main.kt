package geometry.example

import geometry.shapes.createRandomRectangle
import geometry.whenStudy.Color

fun main(args: Array<String>) {

    println(createRandomRectangle().isSquared)

    println(Color.BLUE.rgb())


    val name = if(args.isNotEmpty()) args[0] else "Kotlin"

    println("hello , $name!")

//    val person = Person("Bob", person)

}



