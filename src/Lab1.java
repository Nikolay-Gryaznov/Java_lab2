import java.util.Scanner;

public class Lab1 {

    public static boolean Exist(Point3d a, Point3d b, Point3d c){
        if (distanceTo(a, b)> distanceTo(a, c)+distanceTo(b, c) ){
            return false;
        }
        else if (distanceTo(a, c)> distanceTo(a, b)+distanceTo(b, c)){
            return false;
        }
        else return !(distanceTo(b, c) > distanceTo(a, c) + distanceTo(a, b));
    }


    public static double distanceTo(Point3d a, Point3d b)
    {
        double round = Math.sqrt(((b.getxCoord()-a.getxCoord()))*((b.getxCoord()-a.getxCoord())) + ((b.getyCoord()-a.getyCoord()))*((b.getyCoord()-a.getyCoord()))
                + ((b.getzCoord()-a.getzCoord()))*((b.getzCoord()-a.getzCoord())));
        round *= 100;
        round = (int) round;
        return (round / 100);
    }

    public static double Area(Point3d a, Point3d b, Point3d c)
// Нахождение площади
    {
        double Side1 = distanceTo(a, b), Side2 = distanceTo(a, c), Side3 =
                distanceTo(c, b);
        double per = (Side1 + Side2 + Side3) / 2;
        double round = Math.sqrt(per * (per - Side1) * (per - Side2) * (per - Side3));
        round *= 100;
        round = (int) round;
        return (round / 100);
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите по очереди координаты для первой точки: " +
                "\n");
        double a = in.nextInt();
        double b = in.nextInt();
        double c = in.nextInt();
        System.out.print("Введите по очереди координаты для второй точки: " +
                "\n");
        double a1 = in.nextInt();
        double b1 = in.nextInt();
        double c1 = in.nextInt();
        System.out.print("Введите по очереди координаты для третьей точки: " +
                "\n");
        double a2 = in.nextInt();
        double b2 = in.nextInt();
        double c2 = in.nextInt();

        Point3d Point = new Point3d(a,b,c);
        Point3d Point1 = new Point3d(a1,b1,c1);
        Point3d Point2 = new Point3d(a2,b2,c2);

        if (Point.equals(Point2)||Point2.equals(Point1)||Point.equals( Point1)||!Exist(Point, Point1, Point2)) {
            System.out.println("Треугольник не существует.");

        } else {
            if (Area(Point, Point1, Point2) == 0){
                System.out.println("Треугольник вырожденный. Все точки лежат на одной прямой.");
            }
            else{
                System.out.println("Площадь треугольника: ");
                System.out.print((Area(Point, Point1, Point2)));
            }
        }
    }

}
