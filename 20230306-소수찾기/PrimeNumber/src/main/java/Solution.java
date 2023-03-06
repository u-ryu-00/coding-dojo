public class Solution {
    public int solution(int n) {
        int answer;
        int allCount = 0;
        for (int i = 2; i <= n; i += 1) {
            answer = 0;
            for (int j = 2; j < i; j += 1) {
                if (i % j == 0)
                    answer += 1;
            }
            if (answer == 0) {
                allCount += 1;
            }
        }
        return allCount;
    }
}

/*
1. 이해
- 1부터 입력받은 숫자 n 사이에 있는 소수의 개수를 반환하는 함수를 만든다.
- 소수는 1과 자기 자신으로만 나누어지는 수를 의미한다.
2. 계획
- 입력 받은 숫자 이외에 다른 숫자로 나누어 떨어질 경우 (소수가 아님)
- 2부터 n까지의 숫자를 2부터 나눠서 자기자신으로만 나누어 떨어진다면 소수로 결정!

5를 입력했다!
그러면 1부터 5 사이에 있는 소수의 개수를 반환하게 만들면 된다.
소수는 1과 자기 자신으로만 나누어지는 수를 의미한다.
1은 소수가 아니기 때문에 애초에 계산범위에서 빼버리자

그러면 2 3 4 5 이렇게 4개만 판별해서 개수를 세주면 되는 것 아닌가.

    2는 소수인가 ? yes  => 왜? 1과 자기 자신으로만 나누어지는 수이다.
    2 % 1 == 0, 2 % 2 == 0
    소수가 맞으니까 count를 하나 늘려준다.

    3은 소수인가 ? yes => 1과 자기 자신으로만 나누어지는 수이다.
    3 % 1 == 0, 3 % 2 != 0, 3 % 3 == 0
    소수가 맞으니까 count를 하나 늘려준다.

    4는 소수인가 ? no! => 1과 자기 자신 외에도 2라는 숫자로 나누어주면 나누어 떨어진다.
    4 % 1 == 0, 4 % 2 == 0, 4 % 3 != 0 4 % 4 == 0
    소수가 아니므로 count를 늘려주지 않는다.

    5는 소수인가 ? yes => 1과 자기 자신으로만 나누어지는 수이다.
    5 % 1 == 0, 5 % 2 != 0, 5 % 3 != 0, 5 % 5 == 0
    그래서 소수의 총 개수는 3개!
    소수가 맞으니까 count를 하나 늘려준다.

3. 실행
 */
