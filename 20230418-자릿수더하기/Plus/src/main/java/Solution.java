public class Solution {
    public int solution(int n) {
        int answer = 0;

        while (n > 0) {
            answer += n % 10; // 일의 자리부터 자릿수 더하기
            n /= 10;
        }
        return answer;
    }
}

/*
1. 이해
- 자연수 n이 주어지면, n의 각 자릿수의 합을 구해서 return하는 solution 함수를 만든다.
2. 계획
- 자연수 n을 10으로 나눈 나머지를 answer에 더한다.
- 자연수 n을 10으로 나눈 몫을 다시 n에 재할당 하고
- 재할당 된 n을 10으로 나눈 나머지를 answer에 더한다.
- n이 0이 될 때까지 반복.
3. 실행
 */
