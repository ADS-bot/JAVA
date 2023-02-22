import java.util.*;

class oddeven {
    public static void main(String args[]) {
        int a[] = new int[10];
        int i;
        int even = 0;
        int odd = 0;
        for (i = 0; i < 10; i++) {
            a[i] = Integer.parseInt(args[i]);
            if (a[i] % 2 == 0) {
                even++;
            } 
            else {
                odd++;
            }
        }
        System.out.println("Even numbers are " + even);
        System.out.println("Odd numbers are " + odd);
    }
}