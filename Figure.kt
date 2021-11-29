class Figure (var id: Int) {
    fun move(dx: Int, dy: Int)
    fun scale(zoom: Int)
    fun turn(direction: RotateDirection, centerX: Int, centerY: Int)
}