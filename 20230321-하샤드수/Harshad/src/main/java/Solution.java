public class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int sum = 0;
        int y = x;

        while (y != 0) {
            sum += y % 10;
            y /= 10;
        }
        if (x % sum == 0) {
            answer = true;
        }
        if (x % sum != 0) {
            answer = false;
        }
        return answer;
    }
}

/*
1. 이해
- 자연수 x를 입력받아 x가 하샤드 수인지 아닌지 검사하는 함수, solution을 완성하라.
- 양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 한다.
2. 계획
3. 실행
 */
