public class Solution {
    boolean solution(String string) {
        boolean answer = false;

        int count = 0;

        for (int i = 0; i < string.length(); i += 1) {
            if (string.charAt(0)==')') {
                return false;
            }

            if (string.charAt(i)=='(') {
                count += 1;
            }

            if (string.charAt(i)==')') {
                count -= 1;
            }

            if (count < 0) {
                break;
            }
        }

        if (count == 0) {
            answer = true;
        }

        return answer;
    }
}

/*
1. 이해
- 괄호가 바르게 짝지어졌다는 것은 '(' 문자로 열렸으면 반드시 짝지어서 ')' 문자로 닫혀야 한다는 뜻이다.
- 예를 들어, "()()" 또는 "(())()" 는 올바른 괄호이다.
  ")()(" 또는 "(()(" 는 올바르지 않은 괄호이다.
- '(' 또는 ')' 로만 이루어진 문자열 string이 주어졌을 때, 문자열 string이 올바른 괄호이면 true를 return 하고, 올바르지 않은 괄호이면 false를 return 하는 solution 함수를 완성하라.

2. 계획
- 문자열을 한글자씩 잘라서 새로운 배열에 담는다.
- 일단 시작하는 괄호가 닫히는 괄호면 false를 반환한다.
- 시작하는 괄호가 열리는 괄호면 일단 통과! 그렇다면 이제 열린 괄호의 개수와 닫히는 괄호의 개수를 세야 한다.
- 열린 괄호의 개수와 닫힌 괄호의 개수가 같으면 올바른 괄호이고, 열린 괄호의 개수와 닫힌 괄호의 개수가 다르면 올바르지 않은 괄호이다.
3. 실행
 */
