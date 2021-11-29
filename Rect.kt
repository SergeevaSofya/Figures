open class Rect (val x0:Int, val y0:Int, val width: Int, val height:Int) : Transforming, Figure(0) {
    var color: Int = -1
    lateinit var name: String
    constructor(rect: Rect) : this(rect.x0, rect.y0, rect.width, rect.height)
    override fun move(dx: Int, dy: Int) {
        x0 += dx; y0 += dy
    }
    override fun turn(width:Int, height:Int,Y:Int, X:Int) {
        when (direction){
            RotateDirection.CLOCKWISE -> y0 = Y + (X - (x0 + width))
            RotateDirection.CLOCKWISE -> x0 = X - height/2
            RotateDirection.COUNTERCLOCKWISE -> y0 = Y - (X - (1 + width))
            RotateDirection.COUNTERCLOCKWISE -> x0 =X - width/2
    }
    override fun scale(width: Int, height: Int, zoom:Int) {
        width = width * zoom; height = height * zoom
    }
}
}