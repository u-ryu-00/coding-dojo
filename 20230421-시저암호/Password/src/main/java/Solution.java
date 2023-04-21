public class Solution {
    public String solution(String s, int n) {
        String answer = "";

        for (int i = 0; i < s.length(); i += 1) {
            // 대문자일 때
            if (s.charAt(i) >= 65 && s.charAt(i) <= 90) {
                if (s.charAt(i) + n > 90) {
                    answer += (char) (s.charAt(i) + n - 26);
                }
                if (s.charAt(i) + n <= 90) {
                    answer += (char) (s.charAt(i) + n);
                }
            }
            // 소문자일 때
            if (s.charAt(i) >= 97 && s.charAt(i) <= 122) {
                if (s.charAt(i) + n > 122) {
                    answer += (char) (s.charAt(i) + n - 26);
                }
                if (s.charAt(i) + n <= 122) {
                    answer += (char) (s.charAt(i) + n);
                }
            }
            // 공백일 때
            if (s.charAt(i) == 32) {
                answer += " ";
            }
        }
        return answer;
    }
}

/*
1. 이해
- 어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 바꾸는 암호화 방식을 시저 암호라고 한다.
- 예를 들어 "AB"는 1만큼 밀면 "BC"가 된다.
- 문자열 s와 거리 n을 입력받아 s를 n만큼 민 암호문을 만드는 함수 solution을 완성해보자.
2. 계획
- 배열의 각 원소를 char형으로 바꿔주고 이를 아스키코드의 숫자와 비교해준다.
- 배열의 각 원소에서 n만큼을 더해준다.
- 이때 배열의 각 원소에서 n만큼 더한 수가 90(Z)나 122(z)보다 크다면 더한 수에서 26(알파벳 총 개수)만큼 빼줘야 한다.
-> 어떻게?
- 배열의 각 원소를 아스키코드의 숫자로 바꿔준다.
- 숫자에 입력받은 n만큼 더해준다. 이때 주의할 점은 아스키코드 숫자가 90(Z)이나 122(z)라면
26만큼을 빼서 다시 A, a로 돌아가야 한다는 점이다.
 */
