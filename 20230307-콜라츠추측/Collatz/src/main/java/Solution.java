public class Solution {
    public int solution(long number) {
        int answer = 0;

        // 주어진 수가 1인 경우에는 0을 반환
        if (number == 1) {
            return 0;
        }

        while (number != 1) { // 같은 작업을 1이 될 때까지 반복한다.
            // 입력된 수가 짝수라면 2로 나눈다.
            if (number % 2 == 0) {
                number /= 2;
                answer += 1;
            }

            // number가 1이 되면 반복문 탈출하고 answer를 리턴
            if (number == 1) {
                break;
            }

            // 입력된 수가 홀수라면 3을 곱하고 1을 더한다.
            if (number % 2 == 1) {
                number = number * 3 + 1;
                answer += 1;
            }

            // 작업을 500번 반복할때까지 1이 되지 않는다면 -1을 반환
            if(answer == 500){
                return -1;
            }
        }
        return answer;
    }
}
/*
1. 이해
- 입력된 수가 짝수라면 2로 나눈다.
- 입력된 수가 홀수라면 3을 곱하고 1을 더한다.
- 결과로 나온 수에 같은 작업을 1이 될 때까지 반복한다.

위 작업을 몇 번이나 반복해야 1이 되는지 count해서 반환한다.
단, 주어진 수가 1인 경우에는 0을, 작업을 500번 반복할 때까지 1이 되지 않는다면 -1을 반환해라.
2. 계획
3. 실행
 */
