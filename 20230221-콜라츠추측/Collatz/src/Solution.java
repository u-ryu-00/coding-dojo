import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        /*
        1. 이해
        <콜라츠 추측>
        - 입력된 수가 짝수라면 2로 나눈다.
        - 입력된 수가 홀수라면 3을 곱하고 1을 더한다.
        - 결과로 나온 수에 같은 작업을 1이 될때까지 반복한다.
        - 위 작업을 몇 번이나 반복해야 하는지 횟수를 계산해서 출력해야 한다.
        - 단, 주어진 수가 1인 경우에는 0을, 작업을 500번 반복할 때까지 1이 되지 않는다면 -1을 출력하자.
        2. 계획
        입력받은 수가 1이 될때까지 작업을 반복할 수 있도록 while(number != 1) 이렇게 while문을 써주자.

        3. 실행
         */
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong();
        int count = 0;

        while (number != 1) {
            if (number % 2 == 0) {
                number /= 2;
                count += 1;
            }

            if (number == 1) {
                count += 0;
                break;
            }

            if (number % 2 == 1) {
                number = 3 * number + 1;
                count += 1;
            }

            if (count == 499) {
                count = -1;
                break;
            }
        }
        System.out.println("횟수 " + count);
    }
}
