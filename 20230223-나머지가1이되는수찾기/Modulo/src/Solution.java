import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
    /*
    1. 이해
    - 자연수 n을 입력받는다.
    - n을 x로 나눈 나머지가 1이 되도록 하는 가장 작은 자연수 x를 출력한다.
    예를 들어,
    10을 3으로 나눈 나머지가 1이고,
    3보다 작은 자연수 중에서 문제의 조건을 만족하는 수가 없으므로
    3을 출력한다.
    2. 계획
    - x를 2부터 1씩 늘려주면서 n을 x로 나눠준다.
    - n % x의 나머지가 1이 될 때까지 나눠준다.
    - n % x의 나머지가 1이 되면 x를 출력한다.
    3. 실행
     */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = 2;

        while (!(n % x == 1)) {
            x += 1;
        }
        System.out.println(x);
    }
}
