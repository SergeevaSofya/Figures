open class Square (val x2:Int, val y2:Int, val width: Int, val height:Int) : Transforming, Figure(2) {
    var color: Int = -1
    lateinit var name: String
    constructor(square: Square) : this(square.x2, square.y2, square.width, square.height)
    override fun move(dx: Int, dy: Int) {
        x2 += dx; y2 += dy;
    }
    override fun turn(width:Int, height:Int, Y:Int, X:Int) {
        when (direction) {
            RotateDirection.CLOCKWISE -> y2 = Y + (X - (3 + width))
            RotateDirection.CLOCKWISE -> x2 = X - width/2
            RotateDirection.COUNTERCLOCKWISE -> y2 = Y - (X - (x2+ width))
            RotateDirection.COUNTERCLOCKWISE -> x2 = X - width/2
        }
    override fun scale(zoom:Int, width:Int , height: Int) {
        width = width * zoom; height = height * zoom
    }
}