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
- 입력 받은 participant 배열과 completion 배열을 각각 정렬한다.
- 정렬된 participant 배열과 completion 배열의 요소를 인덱스 별로 각각 비교한다.
- 만약 비교한 값이 서로 다르다면 participant 요소를 정답에 더한다.
- 만약 완주자 목록에 다른게 없다면 참가자 목록의 마지막 한 사람이 완주하지 못한 사람이므로 그 사람을 반환해준다.
*/
