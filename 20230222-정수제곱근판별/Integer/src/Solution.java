import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Solution {
    public static void main(String[] args){
        /*
        1. 이해
        - 임의의 양의 정수 n에 대해 n이 어떤 양의 정수 x의 제곱인지 아닌지를 판단하려 한다.
        - n이 양의 정수 x의 제곱이라면 x + 1의 제곱을 출력하고 아니라면 -1을 출력한다.
        2. 계획
        양의 정수 n을 입력받는다.
        입력 받은 양의정수 n을 sqrt(n)으로 나누고 그것의 나머지가 0인지 확인해본다.
        - 나머지가 0이라면 (sqrt(n) + 1) ^2 을 출력한다.
        - 나머지가 0이 아니라면 -1을 출력한다.
        3. 실행
         */
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();

        if(n % sqrt(n) == 0){
           double answer = (sqrt(n) + 1) * (sqrt(n) + 1);
           System.out.println((int)answer);
        }
        if(n % sqrt(n) != 0){
            System.out.println("-1");
        }

    }
}
