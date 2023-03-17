import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        // 패턴 컴파일
        Pattern pattern = Pattern.compile("([0-9]+)([SDT])([*#]?)");

        // 컴파일된 패턴 검사
        Matcher matcher = pattern.matcher(dartResult);

        // 스텍을 이용해서 그룹별로 뽑기
        Stack<Integer> stack = new Stack<>();
        while (matcher.find()) {
            // matcher.group(1)에 해당하는 정보가 점수이므로 이를 number 변수에 저장해준다.
            int number = Integer.parseInt(matcher.group(1));

            // 보너스(group(2))의 조건에 맞게 점수를 계산해준다.
            if (matcher.group(2).equals("D")) {
                number *= number;
            }
            if (matcher.group(2).equals("T")) {
                number *= (number * number);
            }

            // 옵션(group(3))의 조건에 맞게 점수를 변경해준다.
            if (matcher.group(3).equals("*")) {
                if (!stack.isEmpty()) {
                    int top = stack.pop();
                    stack.push(top * 2);
                }
                number *= 2;
            }
            if (matcher.group(3).equals("#")) {
                number *= -1;
            }
            stack.push(number);
        }
        while (!stack.isEmpty())
            answer += stack.pop();

        return answer;
    }
}

/*
1. 이해
- 다트 게임은 총 3번의 기회로 구성된다.
- 각 기회마다 얻을 수 있는 점수는 0에서 10점 까지이다.
- S -> 1제곱 / D -> 2제곱 / T -> 3제곱
- * -> 해당 점수와 바로 전에 얻은 점수를 각 2배로 만든다. / # -> 해당 점수는 마이너스 된다.
2. 계획
- 일단 해야할 것은 점수와 보너스, 옵션을 각각 분리해내는 것이다.
- 점수 + 보너스(S, D, T) + 옵션(*이나 # 중 하나이며 없을 수도 있다.)
3. 실행
 */

/*
코드 해설
- while(matcher.find())
find() 메서드는 패턴이 일치하는 다음 문자열이 존재한다면 true를 반환하기 때문에 while문을 사용하면 문자열의 끝까지 조회가 가능하다.
- matcher.group(1)
1번째 그룹의 문자열을 반환한다. 다트 게임 문제에서는 점수에 해당하는 문자열이다.
- matcher.group(2)
2번째 그룹의 문자열을 반환한다. 다트 게임 문제에서는 보너스(S, D,T)에 해당하는 문자열이다.
- matcher.group(3)
3번째 그룹의 문자열을 반환한다. 다트 게임 문제에서는 옵션(*, #)에 해당하는 문자열이다.
- stack.pop()
stack의 가장 윗 데이터를 반환한다. 만약 stack이 비었다면 이 연산은 정의 불가 상태이다.
- stack.push()
stack의 가장 윗 데이터로 top이 가리키는 자리 위에 (top = top + 1) 메모리를 생성한다.
 */
