import java.util.Arrays;
import java.util.Collections;

public class Solution {
    public long solution(long number) {
        long answer = 0;

        String[] array = Long.toString(number).split("");
        Arrays.sort(array, Collections.reverseOrder());

        String result = "";

        for(String s : array)
            result += s;

        answer = Long.parseLong(result);

        return answer;
    }
}

/*
1. 이해
- n의 각 자릿수를 큰 것부터 작은 순으로 정렬한 새로운 함수를 리턴하라.
2. 계획
- 입력받은 정수 n을 string 타입으로 바꾸고 이를 배열에 저장한다.
- 배열 요소들을 내림차순 정렬한다.
- 배열 요소들을 string 타입의 변수 result 에 저장한다.
- result의 타입을 long으로 바꿔준다.

 */
