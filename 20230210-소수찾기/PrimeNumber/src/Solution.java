

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int answer = 0;
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i += 1) {
            int count = 0;
            for (int j = 1; j <= i; j += 1) {
                if (i % j == 0) {
                    count += 1;
                }
            }
            if (count == 2) {
                answer += 1;
            }

        }
        System.out.println("소수의 개수는 " + answer);
    }
}
