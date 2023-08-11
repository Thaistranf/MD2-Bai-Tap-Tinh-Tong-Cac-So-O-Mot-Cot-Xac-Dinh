import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 5, 3, 6, 4, 8, 9},
                {2, 6, 1, 4, 8, 3, 2}
        };
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vị trí cột cần tính tổng: ");
        int col = sc.nextInt();

        int total = 0;
        for (int[] ints : arr) {
            total += ints[col];
        }
        System.out.print("Total = " + total);
    }
}