public class Solution {
    public int[] solution(long number) {

        String stringNumber = Long.toString(number);

        String[] stringArray = stringNumber.split("");

        int[] answer = new int[stringNumber.length()];

        for (int i = 0; i < stringArray.length; i += 1) {
            answer[i] = Integer.valueOf(stringArray[stringNumber.length() - i - 1]);
        }

        return answer;
    }
}

/*
1. 이해
- 자연수 number을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴한다.
2. 계획
- 자연수 number를 string형으로 바꾼다.
- 자연수 number의 각 자리 숫자를 배열에 담는다.
- 정수형 배열 answer의 크기는 자연수 number를 string형으로 바꾼 것의 길이이다.
- stringArray 배열을 reverse해서 answer 배열에 다시 담아준다.
3. 실행
 */
