interface Transforming {
    fun move (dx: Int, dy: Int)
    fun scale(zoom: Int)
    fun turn(direction: RotateDirection, X:Int, Y:Int)
}
enum class RotateDirection {
    CLOCKWISE, COUNTERCLOCKWISE
}