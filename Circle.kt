open class Circle ( val x1:Int, val y1:Int, val radius:Int): Transforming, Figure(1){
    var color: Int = -1
    lateinit var name: String
    constructor(circle: Circle) : this(circle.x1, circle.y1, circle.radius)
    override fun move(dx:Int, dy:Int) {
        x1 += dx; y1 += dy;
}
    override fun scale(zoom:Int, radius:Int) {
        radius = radius * zoom
    }

    override fun turn(direction: RotateDirection, X: Int, Y: Int) {
        when (direction) {
            RotateDirection.CLOCKWISE -> y1 = Y + (X - (2 + radius))
            RotateDirection.CLOCKWISE -> x1 = X
            RotateDirection.COUNTERCLOCKWISE -> y1 = Y - (X - (2 + radius))
            RotateDirection.COUNTERCLOCKWISE -> x1 = X

    }
}