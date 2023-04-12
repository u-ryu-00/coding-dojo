public class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        for (int i = left; i < right + 1; i += 1) {
            int count = 0;
            for (int j = 1; j <= i; j += 1) {
                if (i % j == 0) {
                    count += 1;
                }
            }
            if (count % 2 == 0) {
                answer += i;
            }
            if (count % 2 != 0) {
                answer -= i;
            }
        }
        return answer;
    }
}

/*
1. 이해
- 두 정수 left와 right가 매개변수로 주어진다. left부터 right까지의 모든 수들 중에서,
약수의 개수가 짝수인 수는 더하고, 약수의 개수가 홀수인 수는 뺀 수를 return하도록 solution 함수를 완성하라.

2. 계획
- for문을 돌려서 left부터 right까지 모든 수의 약수의 개수를 계산한다.
- if문으로 약수의 개수가 짝수라면 answer에 더하고, 약수의 개수가 홀수라면 answer에서 뺀다.
- 약수의 개수 구하는 법은 주어진 수를 1부터 주어진 수까지 나누어 나머지가 0인 경우를 판별하여 카운트해주면 된다.
3. 실행
 */
