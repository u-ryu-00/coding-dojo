import java.util.Arrays;

public class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;

        Arrays.sort(reserve);
        Arrays.sort(lost);

        // 도난 당하지 않은 학생의 수
        answer = n - lost.length;

        // 여벌 체육복을 가져왔지만 도난 당한 학생 수 (다른 학생에게 체육복을 빌려줄 수 없음.)
        for (int i = 0; i < lost.length; i += 1) {
            for (int j = 0; j < reserve.length; j += 1) {
                if (lost[i] == reserve[j]) {
                    answer += 1;
                    lost[i] = -1;
                    reserve[j] = -1;
                    break;
                }
            }
        }

        // 도난 당했지만 체육복을 빌릴 수 있는 학생 수
        for (int i = 0; i < lost.length; i += 1) {
            for (int j = 0; j < reserve.length; j += 1) {
                if (lost[i] - 1 == reserve[j] || lost[i] + 1 == reserve[j]) {
                    answer += 1;
                    reserve[j] = -1;
                    break;
                }
            }
        }
        return answer;
    }
}

/*
 1. 이해
 - 학생들의 번호는 체격 순으로 매겨져 있어, 바로 앞 번호의 학생이나 바로 뒷번호의 학생에게만 체육복을 빌려줄 수 있다.
 - 예를 들어, 4번 학생은 3번 학생이나 5번 학생에게만 체육복을 빌려줄 수 있다.
 - 전체 학생의 수 : n, 체육복을 도난당한 학생들의 번호가 담긴 배열 : lost,
 여벌의 체육복을 가져온 학생들의 번호가 담긴 배열 : reserve

 2. 계획
 - 체육복을 도난 당한 학생에게 체육복을 빌려줄 수 있는 사람이 있는지를 확인해야 함.
 어떻게 확인할까?
 lost 배열의 요소와 reserve 배열 요소의 차이를 구한다.
 그 차이가 1이라면 빌려줄 수 있고, 차이가 1보다 크다면 빌려줄 수 없다.
 - 일단 lost 배열과 reserve 배열을 sort한다?
 - 체육복을 도난 당한 학생 중 체육복을 빌리지 못한 학생이 몇 명인지 센다.
 - 체육복을 도난 당한 학생 중 체육복을 빌리지 못한 학생의 수를 n(전체 학생의 수)에서 빼면 정답.
 */
