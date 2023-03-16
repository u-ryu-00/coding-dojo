/*
문자열 내 마음대로 정렬하기 파일 수정해보기
파일 수정수정수정
 */

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = {};

        for (int i = 0; i < strings.length; i += 1) {
            strings[i].indexOf(n);
        }
        System.out.println("수정");

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] strings = new String[]{"sun", "bed", "car"};

        for (int i = 0; i < strings.length; i += 1) {
            String[] sorts = new String[strings.length];
            sorts[i] = String.valueOf(strings[i].charAt(n));
            System.out.println(sorts[i]);
            Arrays.sort(sorts);
            System.out.println(sorts[i]);

            
//            System.out.println(strings[i].charAt(n));
        }
    }
}

/*
1. 이해
- 문자열로 구성된 리스트 strings와 정수 n이 주어졌을 때, 각 문자열의 인덱스 n번째 글자를 기준으로 오름차순 정렬하려 한다.
- 예를 들어 strings가 ["sun", "bed", "car"]이고 n이 1이면 각 단어의 인덱스 1의 문자 "u", "e", "a"로 strings를 정렬한다.
- 그것의 결과는 ["car", "bed", "sun"]
2. 계획
- 각 문자열의 인덱스 글자에 맞는 글자 추출하기
- 추출한 글자를 오름차순으로 정렬하기
- 
3. 실행
 */
