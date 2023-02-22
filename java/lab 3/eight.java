import java.util.*;
class Area {
    double are(double r) {
        return 3.14 * r * r;
    }
    double are(double b, double h) {
        return 0.5 * b * h;
    }
    double area(double a) {
        return a*a;
    }
}
class eight {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        double r = sc.nextDouble();
        System.out.println("Enter the base: ");
        double b = sc.nextDouble();
        System.out.println("Enter the height: ");
        double h = sc.nextDouble();
        System.out.println("Enter the side : ");
        double a = sc.nextDouble();
        Area myarea = new Area();
        double area1 = myarea.are(r), area2 = myarea.are(b, h), area3 = myarea.area(a);
        System.out.println("Area of circle is " + area1);
        System.out.println("Area of triangle is " + area2);
        System.out.println("Area of square is " + area3);
    }
}
