import java.util.*;
class ready {
    int length, breadth;
    void read() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length");
        length = sc.nextInt();
        System.out.println("Enter the breadth");
        breadth = sc.nextInt();
    }
    void calculate() {
        int area = length*breadth, perimeter = 2*(length + breadth);
        System.out.println("Area of rectangle is " + area);
        System.out.println("Perimeter of rectangle is " + perimeter);
    }
    void display() {
        System.out.println("Length of rectangle is " + length);
        System.out.println("Breadth of rectangle is " + breadth);
    }
    public static void main(String args[]) {
        ready r = new ready();
        r.read();
        r.calculate();
        r.display();
    }
}