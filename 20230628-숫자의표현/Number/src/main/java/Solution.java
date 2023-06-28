public class Solution {
    public int solution(int n) {
        int answer = 1;
        for (int i = 1; i <= n; i += 1) {
            int sum = i;
            for (int j = i + 1; j <= n; j += 1) {
                sum += j;

                if (sum == n) {
                    answer += 1;
                    break;
                }
                if (sum > n) {
                    break;
                }
            }
        }
        return answer;
    }
}

/*
1. 이해
- 자연수 n을 연속한 자연수들로 표현하는 방법은 여러 개이다.
- 예를 들어 15는 다음과 같이 4가지로 표현할 수 있다.
  1) 1 + 2 + 3 + 4 + 5 = 15
  2) 4 + 5 + 6 = 15
  3) 15 = 15
- 자연수 n이 매개변수로 주어질 때, 연속된 자연수들로 n을 표현하는 방법의 수를 return하는 solution을 완성하라.
2. 계획
- 반복문을 돌려서 1씩 증가시킨다.
- 연속된 숫자의 합이 구해야하는 숫자와 같아지면 answer의 count를 늘려주고 반복문을 빠져나온다.
- 연속된 숫자의 합이 구해야하는 숫자보다 커지면 반복문을 빠져나온다.  
3. 실행
 */

/*
"주어진 자연수를 연속된 자연수의 합으로 표현하는 방법의 수는 주어진 수의 홀수 약수의 개수와 같다"
위의 정수론 정리를 이용해서 풀어도 된다.
 */
