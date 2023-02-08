import java.util.Scanner;

public class SumOfIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("첫번째 숫자를 입력하세요.");
        int a = scanner.nextInt();
        System.out.println("두번째 숫자를 입력하세요.");
        int b = scanner.nextInt();

        long solution = 0;

            if (a < b) {
                for (int i = a; i < b + 1; i += 1) {
                    solution += i;
                }
            }
            if (a > b) {
                for (int i = b; i < a + 1; i += 1) {
                    solution += i;
                }
            }
            if (a == b) {
                solution = a;
            }
            System.out.println("결과 : " + solution);

    }
}
