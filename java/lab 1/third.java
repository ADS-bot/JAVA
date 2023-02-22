import java.util.*;
public class third {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principal: ");
        float principal = sc.nextFloat();
        System.out.println("Enter the time (in years): ");
        float time = sc.nextFloat();
        System.out.println("Enter the ROI: ");
        float rate = sc.nextFloat();
        float SI = (principal * time * rate) / 100;
        System.out.println("The SI is: " + SI);
    }
}