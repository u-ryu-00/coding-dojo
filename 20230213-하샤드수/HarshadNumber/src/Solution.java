import java.util.Scanner;

public class Solution {
    public static void main(String[] args){
        /*
        1. 이해
        양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 한다.
        예를 들어 18의 자릿수 합은 1 + 8 = 9이고, 18은 9로 나누어 떨어지므로 18은 하샤드 수이다.
        자연수 x를 입력받아 x가 하샤드 수인지 아닌지 검사해보자.
        x는 1 이상, 10000 이하인 정수이다.
        2. 계획
        18의 자릿수 합은 1 + 8이다.
        18 = 10 * 1 + 1 * 8
        123의 자릿수 합은 1 + 2 + 3이다.
        123 = 100 * 1 + 10 * 2 + 1 * 3
        자연수 x가 몇째자리의 숫자인지 생각해보자.
        123의 길이를 구하면? 길이 = length = 3
        10 ^ (length-1) + 10 ^ (length-2) + 10 ^ (length - 3)
        1234의 길이를 구하면? 1000 + 200 + 30 + 4 = 1234
        길이 = length = 4
        10 ^ 3 + 10 ^ 2 + 10 ^ 1 + 10 ^ 0
        자연수 x가 n자리의 숫자이다. ..
        10 ^ (length - 1) + 10 ^ (length - 2) + ... + 10 ^ 0 =


        3. 실행
        */
        int x = 0; // 입력된 숫자가 저장될 변수를 초기화한다.
        int sum = 0; // 입력된 숫자의 각 자리의 합을 저장할 변수를 초기화한다.

        System.out.print("숫자를 입력하세요 : ");
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();
        int input = x;

        while(x != 0){
            sum += x % 10; // x을 10으로 나눈 나머지를 sum에 더한다.
            x /= 10; // x을 10으로 나눈 값을 다시 x에 저장한다.
        }

        //System.out.println("각 자리수의 합은 " + sum + "입니다.");
        //System.out.println("입력한 수는 " + input + "입니다.");

        boolean answer = input % sum == 0;
        if(true){
            System.out.println(answer);
        }
        if(false){
            System.out.println(answer);
        }
    }
}
