import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        1. 이해
        - 대문자와 소문자가 섞여있는 문자열 s를 입력한다.
        - s의 p의 개수와 y의 개수를 비교해 같으면 true, 다르면 false를 출력한다.
        - p, y 모두 하나도 없는 경우는 항상 ture를 리턴한다.
        - 개수를 비교할 때 대문자와 소문자는 비교하지 않는다.


        2. 계획
        - 일단 입력받은 문자열 s의 대문자와 소문자를 비교하지 않기로 했으므로 입력받은 문자열 s를 몽땅 소문자로 바꿔서 비교해줄것이다.
        - 문자열 s 속의 p의 개수와 y의 개수를 센다. 어떻게..? 입력받은 문자열을 배열에 넣어서 비교해줄까?
        - if(p의 개수 == y의 개수) -> true
        - if(p의 개수 != y의 개수) -> false

        3. 실행
        */
        System.out.print("문자열 s를 입력하세요 : ");
        String s = scanner.next().toLowerCase(); // 입력한 문자열 s를 몽땅 소문자로 바꿔준다.
        String[] arr = s.split(""); // 입력한 문자열 s를 arr 배열에 담아주고 한글자씩 배열에 저장해준다.
        for (int i = 0; i < arr.length; i += 1) {
            System.out.print(arr[i] + " ");
        }
        // arr 배열에 잘 담겼는지 출력해서 확인해준다.

        // p의 개수를 세어 줄 변수 p
        int p = 0;
        // y의 개수를 세어 줄 변수 y
        int y = 0;
        for (int i = 0; i < arr.length; i += 1) {
            if (arr[i].equals("p")) {
                p += 1;
            }
            if (arr[i].equals("y")) {
                y += 1;

            }
        }
        // 글자 하나하나 비교해서 p랑 같으면 p 카운트 올려주고 y랑 같으면 y 카운트 올려주기
        System.out.println();
        System.out.println("p의 개수: " + p); // p의 개수가 잘 세어졌는지 확인하기 위해 출력해준다.
        System.out.println("y의 개수: " + y); // y의 개수가 잘 세어졌는지 확인하기 위해 출력해준다.
        if (p == y || (p == 0 && y == 0)) { // 조건에 맞게 결과 출력하기
            System.out.println(true);
        }
        if (p != y) {
            System.out.println(false);
        }
    }
}

