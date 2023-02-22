import java.util.*;
class substract {

    double subtract(double x, double y) {
        return (x - y);
    }

    double subtract(double x, double y, double z) {
        return (x - y - z);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter X: ");
        double x = sc.nextDouble();
        System.out.println("Enter Y: ");
        double y = sc.nextDouble();
        System.out.println("Enter Z: ");
        double z = sc.nextDouble();
        substract mysub = new substract();
        double sub1 = mysub.subtract(x, y);
        double sub2 = mysub.subtract(x, y, z);
        System.out.println("Substraction of two numbers is " + sub1);
        System.out.println("Substraction of three numbers is " + sub2);    
    }
}