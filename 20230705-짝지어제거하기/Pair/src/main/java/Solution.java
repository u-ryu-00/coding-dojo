import java.util.Stack;

public class Solution {
    public int solution(String string) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < string.length(); i += 1) {
            char character = string.charAt(i);

            if (!stack.isEmpty() && stack.peek() == character) {
                stack.pop();
            }
            else if (stack.isEmpty() || stack.peek() != character) {
                stack.push(character);
            }
        }
        return stack.isEmpty() ? 1 : 0;
    }
}

/*
1. 이해
- 짝지어 제거하기는 알파벳 소문자로 이루어진 문자열을 가지고 시작한다.
- 먼저 문자열에서 같은 알파벳이 2개 붙어 있는 짝을 찾는다.
- 그 다음, 그 둘을 제거한 뒤, 앞뒤로 문자열을 이어 붙인다.
- 이 과정을 반복해서 문자열을 모두 제거한다면 짝지어 제거하기가 종료된다.
- 문자열 S가 주어졌을 때, 짝지어 제거하기를 성공적으로 수행할 수 있는지를 반환하는 함수를 완성하라.
- 성공적으로 수행할 수 있으면 1을, 아닐 경우 0을 리턴해주면 된다.
예를 들어, 문자열 S = baabaa 라면
b aa baa -> bb aa -> aa ->
의 순서로 문자열을 모두 제거할 수 있으므로 1을 반환한다.
2. 계획
- 스택에 차례대로 문자를 저장하면서 이전에 저장된 문자와 현재 저장하려는 문자가 같으면 이전에 저장된 문자를 제거하는 방식을 사용해본다.
- 이후 스택이 비어있다면 모든 문자가 문제 조건 대로 처리가 되었다는 뜻이고 비어있지 않다면 문제 조건에 위배된 문자 조합이 있다는 뜻이다.
3. 실행
 */

/*
- Stack
push / pop

 */
