import java.util.Scanner;
class two {
    double length,breadth;
    two(double l, double b) {
        length = l;
        breadth = b;
    }
    double area() {
        return length * breadth;
    }
}
class three extends two {
    double height;
    three(double l, double b, double h) {
        super(l, b);
        height = h;
    }
    double volume() {
        return length * breadth * height;
    }
}
public class dimension {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length, breadth and height of the plastic (in feet): ");
        double l = sc.nextDouble();
        double b = sc.nextDouble();
        double h = sc.nextDouble();
        two sheet = new two(l, b);
        three box = new three(l, b, h);
        double sheetCost = sheet.area() * 40;
        double boxCost = box.volume() * 60;
        System.out.println("Cost of plastic sheet: Rs " + sheetCost);
        System.out.println("Cost of plastic box: Rs " + boxCost);
    }
}
