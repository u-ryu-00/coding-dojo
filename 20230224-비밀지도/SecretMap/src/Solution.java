import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[]args){
        /*
        1. 이해
        - 지도는 한 변의 길이가 n인 정사각형 배열 형태로, 각 칸은 공백("") 또는 벽("#") 두 종류로 이루어져 있다.
        - 지도 1 또는 지도 2 중 어느 하나라도 벽인 부분은 전체 지도에서도 벽이다.
        - 지도 1과 지도 2에서 모두 공백인 부분은 전체 지도에서도 공백이다.
        - 지도 1과 지도 2는 각각 정수 배열로 암호화되어 있다.
        - 암호화된 배열은 지도의 각 가로줄에서 벽 부분을 1, 공백 부분을 0으로 부호화했을 때 얻어지는 이진수에 해당하는 값의 배열이다.
        입력 형식
        - 입력으로 지도의 한 변 크기 n과 2개의 정수 배열 arr1, arr2가 들어온다.
            - 1 <= n <= 16
            - arr1, arr2는 길이 n인 정수 배열로 주어진다.
            - 정수 배열의 각 원소 x를 이진수로 변환했을 때의 길이는 n 이하이다.
        출력 형식
        - 원래의 비밀지도를 해독하여 '#', 공백으로 구성된 문자열 배열로 출력하라.
        2. 계획
        - 지도의 한 변의 크기를 입력받는다.
        - array1을 입력받는다.
        - array2를 입력받는다.
        - array1 배열의 수와 array2 배열의 수를 2진수로 표현하고 조건에 맞게 정제해서 result 배열에 넣는다.
        - result 배열에서 1의 숫자는 #으로 출력하고, 0의 숫자는 공백("")으로 출력한다.
        3. 실행
         */
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
