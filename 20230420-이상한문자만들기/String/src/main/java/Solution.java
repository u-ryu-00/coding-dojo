public class Solution {
    public String solution(String string) {
        String answer = "";
        String[] array = string.split("");
        int index = 0;

        for (int i = 0; i < array.length; i += 1) {
            if (array[i].equals(" ")) {
                index = 1;
            }
            answer += index % 2 == 0 ? array[i].toUpperCase() : array[i].toLowerCase();
            index += 1;
        }
        return answer;
    }
}

/*
1. 이해
- 문자열 s는 한 개 이상의 단어로 구성되어 있다. 각 단어는 하나 이상의 공백문자로 구분되어 있다.
- 각 단어의 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수를 완성하라.
2. 계획
- 일단 입력받은 문자열을 띄어쓰기 기준으로 쪼갠다.
- 쪼갠 문자열을 배열에 담아준다.
- for문 돌려서 배열의 요소 하나하나에 접근할 수 있도록 한다.
- 단어별로 짝수번째 인덱스는 대문자로, 홀수번째 인덱스는 소문자로 바꿔준다.
 */
