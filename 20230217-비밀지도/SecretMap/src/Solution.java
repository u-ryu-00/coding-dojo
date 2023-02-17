import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    /*
    1. 이해
    입력 형식
    - 입력으로 지도의 한 변 크기 n과 2개의 정수 배열 arr1, arr2가 들어온다.
        - 1 <= n <= 16
        - arr1, arr2는 길이 n인 정수 배열로 주어진다.
        - 정수 배열의 각 원소 x를 이진수로 변환했을 때의 길이는 n 이하이다. 즉, 0 <= x <= 2^n-1

    출력 형식
    - 원래의 비밀지도를 해독하여 "#", 공백으로 구성된 문자열 배열로 출력하라.

    문제 해설
    - 이 문제는 비트연산을 묻는 문제입니다. 이미 문제 예시에 2진수로 처리하는 힌트가 포함되어 있고,
    둘 중 하나가 1일 경우에 벽 #이 생기기 때문에 OR로 처리하면 간단히 풀 수 있습니다.
    - 이 문제는 비트 연산을 잘 다룰 수 있는지를 묻고자 하는 의도입니다. 비트 연산을 꼭 기억하시기 바랍니다.

    1) 지도는 한 변의 길이가 n인 정사각형 배열 형태로, 각 칸은 공백 또는 벽 두 종류로 이루어져 있다.
    2) 전체 지도는 두 장의 지도를 겹쳐서 얻을 수 있다. 각각 지도1과 지도2라고 하자.
    지도1 또는 지도2 중 어느 하나라도 벽인 부분은 전체 지도에서도 벽이다.
    지도1과 지도2에서 모두 공백인 부분은 전체 지도에서도 공백이다.
    3) 지도1과 지도2는 각각 정수 배열로 암호화되어 있다.
    4) 암호화된 배열은 지도의 각 가로줄에서 벽 부분을 1, 공백 부분을 0으로 부호화했을 때 얻어지는 이진수에 해당하는 값의 배열이다.

    지도의 한번 크기 n = 5를 입력받았다고 생각해보자. 그렇다면 arr1, arr2는 길이 5인 정수 배열로 주어진다.
    정수 배열의 각 원소 x를 이진수로 변환했을 때의 길이는 5이하이다. 즉 0 <= x <= 2^5-1
    2. 계획
    3. 실행
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int[] array1;
        int[] array2;

        String[] result;

        System.out.print("지도의 한 변의 크기를 입력해주세요 : ");
        n = scanner.nextInt();
        result = new String[n];

        // array1 입력받기
        array1 = new int[n];
        for (int i = 0; i < n; i += 1) {
            array1[i] = scanner.nextInt();
        }
        // 입력받은 것이 array1에 잘 들어갔는지 확인
        System.out.println("array1 : " + Arrays.toString(array1));

        // array2 입력받기
        array2 = new int[n];
        for (int i = 0; i < n; i += 1) {
            array2[i] = scanner.nextInt();
        }
        // 입력받은 것이 array2에 잘 들어갔는지 확인
        System.out.println("array2 : " + Arrays.toString(array2));

        for (int i = 0; i < n; i += 1) {
            result[i] = Integer.toBinaryString(array1[i] | array2[i]);
            // 2진수로 잘 표현되었는지 확인
            System.out.println(result[i]);
        }

        for (int i = 0; i < n; i += 1) {
            // String.format(포맷, 값) 문자열 형식 설정 메서드
            // String.format("%" + 자릿수 + "s", str)자릿수에 맞추어서 str이 변환된다.
            // 만약 str의 길이가 자릿수보다 길 경우 str이 그대로 출력된다.
            result[i] = String.format("%" + n + "s", result[i]);
            result[i] = result[i].replaceAll("1", "#");
            result[i] = result[i].replaceAll("0", " ");
            System.out.print(result[i]);
            System.out.println();
        }


    }
}

