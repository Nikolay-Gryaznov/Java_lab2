public class Point2d {
    private double xCoord;
    private double yCoord;

    public Point2d(double xCoord, double yCoord) {
        this.xCoord = xCoord;
        this.yCoord = yCoord;
    }

    public Point2d(){
        this.xCoord = 0.0;
        this.yCoord = 0.0;
    }

    public double getX() {
        return xCoord;
    }

    public void setX(double xCoord) {
        this.xCoord = xCoord;
    }

    public double getY() {
        return yCoord;
    }

    public void setY(double yCoord) {
        this.yCoord = yCoord;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point2d point2d = (Point2d) o;
        return Double.compare(point2d.xCoord, xCoord) == 0 && Double.compare(point2d.yCoord, yCoord) == 0;
    }
}
