public class Solution {
    public int solution(int n) {
        int answer = 0;

        // 10진법 자연수 n을 3진법으로 나타낸다.
        String stringN = Integer.toString(n, 3);
        // 3진법 stringN을 앞뒤반전으로 뒤집어준다.
        StringBuffer stringBuffer = new StringBuffer(stringN);
        String reverse = stringBuffer.reverse().toString();
        // 앞뒤반전 3진법을 10진법으로 변환해준다.
        String[] array = reverse.split("");

        int multi = 1;
        for (int i = array.length - 1; i >= 0; i -= 1) {
            answer += Integer.parseInt(array[i]) * multi;
            multi *= 3;
        }
        return answer;
    }
}

/*
1. 이해
- 자연수 n이 매개변수로 주어진다.
- n을 3진법 상에서 앞뒤로 뒤집는다.
- 이를 다시 10진법으로 표현한다.

- n에 45라는 수가 들어온다.
- 45라는 수를 3진법으로 바꾸면 1200이다.
- 1200을 앞뒤로 뒤집는다 -> 0021
- 0021을 다시 10진법으로 표현한다. -> 7

<이번 코드에서 써야할 것들>
1) Integer.toString(int i, int radix)
- radix에 따라 다른 진법으로 정수 표현
- int 타입의 10진수를 2진수로 변환해 String으로 변환 -> Integer.toString(i,2)
- int 타입의 10진수를 8진수로 변환해 String으로 변환 -> Integer.toString(i,8)
2) sb.reverse().toString();

2. 계획
- 일단 자연수 n이 매개변수로 주어진다.
- 자연수 n을 3진법으로 표현한다. -> integerN = Integer.toString(n,3)
- 3진법으로 표현한 수를 앞뒤 반전한다. -> integerN.reverse().toString()
- 앞뒤 반전한 수를 다시 10진법으로 표현한다. -> answer = Integer.toString(integerN.reverse().toString(),10)

3. 실행
 */
