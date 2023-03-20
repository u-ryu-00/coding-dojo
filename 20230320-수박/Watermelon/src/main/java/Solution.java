import java.util.ArrayList;
import java.util.List;

public class Solution {
    public String solution(int n) {
        String answer = "";
        List<String> waterMelon = new ArrayList<>();
        for (int i = 0; i < n; i += 1) {
            if (i % 2 == 0) {
                waterMelon.add("수");
            }
            if (i % 2 == 1) {
                waterMelon.add("박");
            }
            answer = String.join("", waterMelon);
        }
        return answer;
    }
}

/*
1. 이해
- 길이가 n이고, "수박수박수박수..."와 같은 패턴을 유지하는 문자열을 리턴하는 함수 solution을 완성하라.
예를 들어 n이 4이면 "수박수박"을 리턴하고 3이라면 "수박수"를 리턴하면 된다.
2. 계획
- 홀수자리에는 수를 출력하고 짝수자리에는 박을 출력한다. 이것을 입력받은
3. 실행
 */
