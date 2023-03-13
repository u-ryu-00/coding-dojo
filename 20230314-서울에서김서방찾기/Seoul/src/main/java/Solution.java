public class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        for (int i = 0; i < seoul.length; i += 1) {
            if (seoul[i].equals("Kim")) {
                answer = "김서방은 " + i + "에 있다";
            }
        }
        return answer;
    }
}

/*
1. 이해
- String형 배열 seoul의 요소 중 "Kim"의 위치 x를 찾아 "김서방은 x에 있다"는 String을 반환하는 함수 solution을 완성하라.
2. 계획
- seoul의 모든 요소를 Kim과 비교하여 일치하는 것이 몇번째 위치에 있는지 알아낸다.
3. 실행
 */
