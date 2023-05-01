import java.util.Arrays;

public class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        Arrays.sort(participant);
        Arrays.sort(completion);

        for (int i = 0; i < completion.length; i += 1) {
            if (!participant[i].equals(completion[i])) {
                answer += participant[i];
                break;
            }
        }

        if (answer.equals("")) {
            answer += participant[participant.length - 1];
        }
        // 완주자 목록에 다른 게 없다면 마지막 한 사람이므로 그 사람을 반환해준다.
        return answer;
    }
}
/*
1. 이해
- 단 한명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였다.
- 마라톤에 참여한 선수들의 이름이 담긴 배열 : participant
  완주한 선수들의 이름이 담긴 배열 : completion
  => 완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성
2. 계획
- 특정 요소가 participant 배열에 담겨 있는지?
- 참가자 명단과 완주한 선수 명단을 비교해야 한다.
- 완주한 선수 명단 첫번째 요소와 참가자 명단의 모든 요소를 비교한다.
    -> 일치 하는 요소가 있다면 참가자 명단에서 삭제한다.
- 완주한 선수 명단 두번째 요소와 참가자 명단의 모든 요소를 비교한다.
    -> 일치 하는 요소가 있다면 참가자 명단에서 삭제한다.
- 완주한 선수 명단 마지막번째 요소까지 모두 비교한 후 마지막까지 삭제되지 못한 요소를 반환.
 */
