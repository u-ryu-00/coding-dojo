public class Solution {
    public int gcd(int a, int b) {
        // 최대공약수 메서드, 유클리드 호제법
        int x = Math.max(a, b);
        int y = Math.min(a, b);

        while (x % y != 0) {
            int r = x % y;
            x = y;
            y = r;
        }
        return y;
    }

    public int solution(int[] array) {
        // 배열의 첫 번째 값을 저장
        int answer = array[0];

        // 배열의 길이가 1이면 반복 x, 그 이상은 다음 인덱스인 1부터 반복
        for (int i = 1; i < array.length; i += 1) {
            // 두 값의 최대공약수
            int gcd = gcd(answer, array[i]);
            // 두 값의 최소공배수
            answer = answer * array[i] / gcd;
        }
        return answer;
    }
}

/*
2개의 자연수에 대한 최소공배수, 최대공약수 문제를 다뤄 본 적이 있다. (유클리드 호제법)
- 입력받은 두 수 중 큰 수를 결정
- 큰 수를 작은 수로 나눈다.
- 나머지가 0일 경우 :
  최대공약수 = 작은 수
  최소공배수 = ( 두 수의 곱 ) / 최대공약수
- 나머지가 0이 아닐 경우
  큰 수 = 작은 수
  작은 수 = 나머지
  큰 수를 작은 수로 나눈다부터 다시 반복
1. 이해
- 두 수의 최소공배수(Least Common Multiple)란
  입력된 두 수의 배수 중 공통이 되는 가장 작은 숫자를 의미한다.
- 예를 들어 2와 7의 최소공배수는 14가 된다.
- 정의를 확장해서, n개의 숫자를 담은 배열 array가 입력되었을 때
  이 수들의 최소공배수를 반환하는 함수, solution을 완성하라.
2. 계획
- N개의 수의 최소공배수를 구하므로 기존의 두 수의 최대공약수, 최소공배수를 구하는 방식과 다르게
  answer의 값을 array의 첫 번째 값으로 고정한다.
- 1번째 인덱스 값과 2번째 인덱스 값의 최소공배수를 answer에 반영하고
  그 최소공배수와 다음 3번째 인덱스와의 최소공배수를 구한다.
- 1, 2번째 인덱스의 최소공배수 값과 3번째 인덱스 두 수의 최소공배수를 구한 값을 answer에 반영한다.
- 이와 같은 방법으로 마지막 인덱스의 값과도 최소공배수를 구해 answer에 반영한다.
- 최대공약수를 구하는 함수 gcd를 만든다.
3. 실행
 */
