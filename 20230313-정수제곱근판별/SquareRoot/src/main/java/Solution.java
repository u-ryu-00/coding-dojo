public class Solution {
    public double solution(long n) {
        double answer = 0;
        if (n % Math.sqrt(n) == 0) {
            answer = (Math.sqrt(n) + 1) * (Math.sqrt(n) + 1);
        }
        if (n % Math.sqrt(n) != 0) {
            answer = -1;
        }
        return answer;
    }
}

/*
1. 이해
- 임의의 양의 정수 n에 대해 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 한다.
- n이 양의 정수 x의 제곱이라면 x + 1의 제곱을 리턴하고, n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하자.
2. 계획
- n을 sqrt(n)으로 나누었을 때 나머지가 0이라면 sqrt(n) + 1를 제곱한 수를 리턴하고
- n을 sqrt(n)으로 나누었을 때 나머지가 0이 아니라면 -1을 리턴한다.
3. 실행
 */
