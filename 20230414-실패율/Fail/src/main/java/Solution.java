import java.util.ArrayList;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] fails = new int[N];
        int[] users = new int[N];

        // 시도자, 실패자 카운트
        for (int stage : stages) {
            // 마지막 스테이지를 깨지 않았을 경우
            if (stage != N + 1) {
                // 실패한 유저 카운트
                fails[stage - 1] += 1;

                // 시도한 유저 카운트
                for (int i = 0; i < stage; i++) {
                    users[i]++;
                }
            }

            // 마지막 스테이지를 깼을 경우
            else {
                // 시도한 유저 전부 카운트
                for (int i = 0; i < users.length; i++) {
                    users[i]++;
                }
            }
        }

        // 실패율
        ArrayList<Double[]> failRate = new ArrayList<>();

        // 실패율에 인덱스와 값 할당
        for (int i = 0; i < N; i++) {
            // 시도자, 실패자가 아무도 없을 경우 0을 나누게 되므로 NaN 처리 필요
            double rate = Double.isNaN((double) fails[i] / users[i]) ? 0 : (double) fails[i] / users[i];

            failRate.add(new Double[]{(double) i + 1, rate});
        }

        // 정렬
        failRate.sort((o1, o2) -> Double.compare(o2[1], o1[1]));

        return failRate.stream().mapToInt(value -> value[0].intValue()).toArray();
    }
}

/*
1. 이해
- 실패율 -> 스테이지에 도달했으나 아직 클리어하지 못한 플레이어의 수 / 스테이지에 도달한 플레이어 수
- 전체 스테이지의 개수 N, 게임을 이용하는 사용자가 현재 멈춰있는 스테이지의 번호가 담긴 배열 stages가 매개변수로 주어질 때, 실패율이 높은 스테이지부터 내림차순으로 스테이지의 번호가 담겨있는 배열을 return하도록 solution 함수를 완성하라.
- 1번 스테이지에는 총 8명의 사용자가 도전했으며, 이 중 1명의 사용자가 아직 클리어하지 못했다. (1번 스테이지 실패율 : 1/8)
- 2번 스테이지에는 총 7명의 사용자가 도전했으며, 이 중 3명의 사용자가 아직 클리어하지 못했다. (2번 스테이지 실패율 : 3/7)
- N = 5 / stages = {2, 1, 2, 6, 2, 4, 3, 3} / result = {3,4,2,1,5}
-> 전체 스테이지의 개수 5개 / 총 8명의 사용자가 도전 /
-> 1번 스테이지 도전 중인 사용자 : 1명 / 실패율 : 1/8
-> 2번 스테이지 도전 중인 사용자 : 3명 / 실패율 : 3/7
-> 3번 스테이지 도전 중인 사용자 : 2명 / 실패율 : 2/4
-> 4번 스테이지 도전 중인 사용자 : 1명 / 실패율 : 1/2
-> 5번 스테이지 도전 중인 사용자 : 1명 / 실패율 : 0/1
2. 계획
- 실패율 계산 :
-> 숫자 1 개수 / stages 요소의 개수
-> 숫자 2 개수 / stages 요소의 개수 - 숫자 1 개수
-> 숫자 3 개수 / stages 요소의 개수 - 숫자 1 개수 - 숫자 2 개수
-> 숫자 4 개수 / stages 요소의 개수 - 숫자 1 개수 - 숫자 2 개수 - 숫자 3 개수
-> 숫자 5 개수 / stages 요소의 개수 - 숫자 1 개수 - 숫자 2 개수 - 숫자 3 개수 - 숫자 4 개수
- 실패율 내림차순으로 정렬
3. 실행
 */
