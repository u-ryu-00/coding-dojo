/*
1. 이해
- 단어 s의 가운데 글자를 반환하는 함수 solution을 만든다.
- 단어의 길이가 짝수라면 가운데 두글자를 반환한다.
2. 계획
- 단어 s의 길이를 구한다.
-
3. 실행
 */
class Solution {
    public String solution(String s) {
        String answer = "";

        if (s.length() % 2 == 0) { //짝수
            answer = s.substring(s.length() / 2 - 1, s.length() / 2 + 1);
        }
        if (s.length() % 2 == 1) { //홀수
            answer = s.substring(s.length() / 2, s.length() / 2 + 1);
        }
        return answer;
    }
}
