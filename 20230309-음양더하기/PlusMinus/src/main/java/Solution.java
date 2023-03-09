public class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        for (int i = 0; i < absolutes.length; i += 1) {
            if (signs[i]) {
                absolutes[i] *= 1;
            }
            if (!signs[i]) {
                absolutes[i] *= -1;
            }
            answer += absolutes[i];
        }

        return answer;
    }
}
/*
1. 이해
- 정수들의 절댓값을 차례대로 담은 정수 배열 absolutes가 있다.
- 이 정수들의 부호를 차례대로 담은 불리언 배열 signs가 있다.
예를 들어
absolutes : 4, 7, 12
signs : true, false, true라면
실제 수는 +4, -7, +12이고 이것들이 전체 합은 9이므로 9를 리턴해야 한다.
2. 계획
만약 signs가 true라면 +이고 signs가 false라면 -를 붙여주는 로직을 작성하자.
3. 실행
 */
