import java.util.Arrays;
import java.util.Collections;

public class Solution {
    public String solution(String s) {
        String[] string = s.split("");

        Arrays.sort(string, Collections.reverseOrder());

        String joinString = String.join("", string);

        return joinString;
    }
}

/*
1. 이해
- 문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수 solution을 완성하라.
- s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주한다.
2. 계획
- 문자열 한글자 한글자를 배열에 저장한다.
- 배열의 요소를 내림차순으로 정렬한다.
- 정렬한 배열의 요소를 하나의 문자열로 다시 합쳐준다.
3. 실행
 */
