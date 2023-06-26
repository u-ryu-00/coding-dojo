public class Solution {
    public int[] solution(String string) {
        int[] answer = {};
        int countZero = 0;
        String binary = "";
        int count = 0;

        while (!string.equals("1")) {
            String text = string.replace("0", "");

            countZero += string.length() - text.length();

            int textLength = text.length();

            binary = Integer.toBinaryString(textLength);

            string = binary;

            count += 1;
        }
        answer = new int[]{count, countZero};

        return answer;
    }
}

/*
1. 이해
- 0과 1로 이루어진 어떤 문자열 x에 대한 이진 변환을 다음과 같이 정의한다.
    1) x의 모든 0을 제거한다.
    2) x의 길이를 c라고 하면 x를 "c를 2진법으로 표현한 문자열"로 바꾼다.
- 예를 들어 x = "0111010"이라면 x에 이진변환을 가하면
x = "0111010" -> 1111 -> 100
2. 계획
- 입력받은 문자열을 처리해서 1이 될 때까지 while 반복문을 돌린다.
- 입력받은 문자열에 있는 0을 ""으로 바꿔서 text 변수에 저장한다.
- 입력받은 문자열의 길이에서 text의 길이를 빼서 0의 개수를 센다. (+= 으로 표현해서 누적 계산!)
- text의 길이를 이진수로 바꿔서 binary 변수에 저장한다.
- 한번 반복문이 돌때마다 count를 1씩 늘려준다.
- 반복문이 다 돌고 난 후의 count와 countZero를 배열에 담아 return 한다. 

3. 실행
 */
