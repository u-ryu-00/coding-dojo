public class Solution {
    public String solution(String string) {
        String answer = "";

        String[] numbers = string.split(" ");
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i += 1) {
            int number = Integer.parseInt(numbers[i]);

            min = Math.min(min, number);
            max = Math.max(max, number);
        }

        answer = min + " " + max;
        return answer;
    }
}

/*
1. 이해
- 문자열 s에는 공백으로 구분된 숫자들이 저장되어 있다.
- str에 나타나는 숫자 중 최소값과 최대값을 찾아 이를 리턴하라.
2. 계획
- 문자열을 공백을 기준으로 나눈다.
- 쪼개진 문자열을 정수형으로 반환한 후 최댓값과 최솟값을 구한다.
3. 실행
 */
