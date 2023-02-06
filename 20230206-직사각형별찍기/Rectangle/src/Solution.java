import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        if (n <= 1000 && m <= 1000) {
            for (int i = 1; i <= m; i += 1) {
                for (int j = 1; j <= n; j += 1) {
                    System.out.print("*");
                }
                System.out.println();

            }
        }
    }
}



