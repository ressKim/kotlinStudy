package geometry.shapes

import java.util.Random


class Rectangle(private val height: Int, private val width: Int) {
    val isSquared: Boolean
        get() = height == width
}

fun createRandomRectangle(): Rectangle {
    val random = Random()
    return Rectangle(random.nextInt(), random.nextInt())
}

