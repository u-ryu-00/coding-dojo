public class Solution {
    public String solution(String string) {
        String answer = "";

        String[] words = string.toLowerCase().split("");

        boolean space = true;

        for (int i = 0; i < words.length; i += 1) {
            String word = words[i];

            if (space) {
                answer += word.toUpperCase();
            }

            if (!space) {
                answer += word;
            }

            // 현재 단어가 공백인지 확인하고 현재 단어가 공백이라면 space를 true로 바꾼다.
            // 그러면 공백 다음 글자는 대문자로 바뀜!
            space = word.equals(" ");
        }
        return answer;
    }
}
/*
1. 이해
- JadenCase란 모든 단어의 첫문자가 대문자이고, 그 외의 알파벳은 소문자인 문자열이다.
- 단, 첫 문자가 알파벳이 아닐 때에는 이어지는 알파벳은 소문자로 쓰면 된다.
- 문자열 s가 주어졌을 때, s를 JadenCase로 바꾼 문자열을 리턴하는 함수 solution을 완성하라.
2. 계획
- 입력받는 문자열 string을 한글자씩 잘라서 새로운 배열 words에 담는다.
- 공백이라면, answer 문자열에 공백 다음 글자를 대문자로 바꿔서 더한다.
 */
