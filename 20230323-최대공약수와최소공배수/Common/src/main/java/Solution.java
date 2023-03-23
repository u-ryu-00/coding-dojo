public class Solution {
    int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }

    public int[] solution(int n, int m) {
        int[] answer = new int[2];

        answer[0] = gcd(n, m);
        answer[1] = lcm(n, m);
        return answer;
    }
}

/*
1. 이해
2. 계획
- 입력받은 두 수 중 큰 수를 결정
- 큰 수를 작은 수로 나눈다.
- 나머지가 0일 경우 :
    최대공약수 = 작은 수
    최소공배수 = (두 수의 곱) / 최대공약수
- 나머지가 0이 아닐 경우 :
    큰 수 = 작은 수
    작은 수 = 나머지
    큰 수를 작은 수로 나눈다부터 다시 반복
3. 실행
 */
