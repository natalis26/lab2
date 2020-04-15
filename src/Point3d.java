public class Point3d {
    private double xCoord; // координата X
    private double yCoord; // координата Y
    private double zCoord; // координата Z

    // Конструктор инициализации
    public Point3d (double x, double y, double z) {
        this.xCoord = x;
        this.yCoord = y;
        this.zCoord = z;
    }

    // Конструктор по умолчанию
    public Point3d () {
        this(0, 0, 0);
    }

    // Возвращение координаты X
    public double getX () { return xCoord; }

    // Возвращение координаты Y
    public double getY () { return yCoord; }

    // Возвращение координаты Z
    public double getZ () { return zCoord; }

    // Установка значения координаты X
    public void setX (double val) {
        this.xCoord = val;
    }

    // Установка значения координаты Y
    public void setY (double val) {
        this.yCoord = val;
    }

    // Установка значения координаты Z
    public void setZ (double val) {
        this.zCoord = val;
    }

    // Сравнение двух объектов
    public boolean equals (Point3d a) { return getX() == a.xCoord && getY() == a.yCoord && getZ() == a.zCoord; }

    // Вычисляет расстояние между двумя точками
    public double distanceTo (Point3d point) {
        return Math.round(
                Math.sqrt(
                        Math.pow(this.xCoord - point.xCoord, 2) +
                                Math.pow(this.yCoord - point.yCoord, 2) +
                                Math.pow(this.zCoord - point.zCoord, 2)
                ) * 100) / 100;
    }
}
