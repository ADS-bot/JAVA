import java.util.*;
class Shape
{
    double area;
    void showArea()
    {
        System.out.println("Area is: "+area);
    }
}
class Circle extends Shape
{
    double r;
    void getRadius()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius: ");
        r = sc.nextDouble();
    }
    void calculateArea()
    {
        area = 3.14*r*r;
    }
}
class Rectangle extends Shape
{
    double l,b;
    void getLengthBreadth()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length and breadth: ");
        l = sc.nextDouble();
        b = sc.nextDouble();
    }
    void calculateArea()
    {
        area = l*b;
    }
}
public class define
{
    public static void main(String args[])
    {
        Circle c = new Circle();
        Rectangle r = new Rectangle();
        c.getRadius();
        c.calculateArea();
        c.showArea();
        r.getLengthBreadth();
        r.calculateArea();
        r.showArea();
    }
}
