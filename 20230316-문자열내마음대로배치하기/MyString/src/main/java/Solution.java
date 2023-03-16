import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = {};
        ArrayList<String> array = new ArrayList<>();
        for (int i = 0; i < strings.length; i += 1) {
            array.add("" + strings[i].charAt(n) + strings[i]);
        }
        Collections.sort(array);

        answer = new String[array.size()];
        for (int i = 0; i < array.size(); i += 1) {
            answer[i] = array.get(i).substring(1, array.get(i).length());
        }
        return answer;
    }
}


/*
1. 이해
- 문자열로 구성된 리스트 strings와 정수 n이 주어졌을 때, 각 문자열의 인덱스 n번째 글자를 기준으로 오름차순 정렬하려 한다.
- 예를 들어 strings가 ["sun", "bed", "car"]이고 n이 1이면 각 단어의 인덱스 1의 문자 "u", "e", "a"로 strings를 정렬한다.
- 그것의 결과는 ["car", "bed", "sun"]
2. 계획
- 각 문자열의 인덱스 글자에 맞는 글자 추출하기
- 추출한 글자를 오름차순으로 정렬하기
- 
3. 실행
 */
