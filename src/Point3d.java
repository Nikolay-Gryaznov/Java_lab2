public class Point3d {
    private double xCoord;
    private double yCoord;
    private double zCoord;

    public Point3d(double xCoord, double yCoord, double zCoord) {
        this.xCoord = xCoord;
        this.yCoord = yCoord;
        this.zCoord = zCoord;
    }

    public Point3d() {
        this.xCoord = 0.0;
        this.yCoord = 0.0;
        this.zCoord = 0.0;
    }

    public double getxCoord() {
        return xCoord;
    }

    public void setxCoord(double xCoord) {
        this.xCoord = xCoord;
    }

    public double getyCoord() {
        return yCoord;
    }

    public void setyCoord(double yCoord) {
        this.yCoord = yCoord;
    }

    public double getzCoord() {
        return zCoord;
    }

    public void setzCoord(double zCoord) {
        this.zCoord = zCoord;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point3d point3d = (Point3d) o;
        return Double.compare(point3d.xCoord, xCoord) == 0 && Double.compare(point3d.yCoord, yCoord) == 0 && Double.compare(point3d.zCoord, zCoord) == 0;
    }


}
