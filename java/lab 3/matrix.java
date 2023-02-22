import java.util.*;
class matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[3][3];
        int leftSum = 0, rightSum = 0;
        System.out.println("Enter the elements of the matrix: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    leftSum += matrix[i][j];
                }
                if (i + j == 2) {
                    rightSum += matrix[i][j];
                }
            }
        }
        System.out.println("Left Diagonal Sum: " + leftSum);
        System.out.println("Right Diagonal Sum: " + rightSum);
    }
}
