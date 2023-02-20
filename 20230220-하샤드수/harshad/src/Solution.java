/*
1. 이해
- 양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다.
- 18의 자릿수 합은 1 + 8 = 9이고, 18은 9로 나누어떨어지므로 18은 하샤드 수 입니다.

2. 계획
- 양의 정수 x를 입력받습니다.
- 입력받은 양의 정수 x를 input 변수에 저장합니다.
- 양의 정수 x를 10으로 나눈 나머지를 sum변수에 더해주고 양의 정수 x를 10으로 나눠줍니다.
- 위 과정을 x가 0이 되기 전까지 해줍니다.
- intput의 값과 sum의 값을 나눈 나머지를 구해줍니다.
- 나머지가 0이라면 하샤드 수이고 0이 아니라면 하샤드 수가 아닙니다.

3. 실행
 */

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int input = x;
        int sum = 0;

        while (x != 0) {
            sum += x % 10;
            x /= 10;
        }

        boolean answer = input % sum == 0;
        if (input % sum == 0) {
            System.out.println(answer);
        }
        if (input % sum != 0) {
            System.out.println(answer);
        }

    }
}
