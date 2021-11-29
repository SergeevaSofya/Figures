import Rect as Rect
import Circle as Circle
import Square as Square

fun main() {
    val figures: Array<Transforming>

    val transforming0: Transforming = Rect(3, 2, 2, 4)
    transforming0.move(5, 7)
    transforming0.scale(2)
    transforming0.turn(RotateDirection.CLOCKWISE, 10, 4)

    val transforming1: Transforming = Circle(5, 5, 4)
    transforming1.move(10, 10)
    transforming1.scale(2)
    transforming1.turn(RotateDirection.COUNTERCLOCKWISE, 15, 15)

    val transforming2: Transforming = Square(-3, -3, 2)
    transforming2.move(20, 20)
    transforming2.scale(2)
    transforming2.turn(RotateDirection.CLOCKWISE, 7, 1)

}