class Solution {
    int max = -1;
    int maxResult[];

    public void cal(int now, int arrowNum, int[] info, int n, int[] result) {
        if (now == 10) {
            result[10] = arrowNum;
            int apeach = 0;
            int lion = 0;
            for (int i = 0; i <= 10; i += 1) {
                if (info[i] == 0 && result[i] == 0) continue;
                if (info[i] < result[i]) lion += 10 - i;
                else apeach += 10 - i;
            }
            int score = lion - apeach;
            if (score > max) {
                max = score;
                for (int i = 0; i <= 10; i += 1) {
                    maxResult[i] = result[i];
                }
            }
            if (score == max) {
                boolean isLow = false;
                for (int j = 10; j >= 0; j -= 1) {
                    if (maxResult[j] == result[j]) continue;
                    if (maxResult[j] < result[j]) {
                        isLow = true;
                    } else break;
                }
                if (isLow) {
                    for (int i = 0; i <= 10; i += 1) {
                        maxResult[i] = result[i];
                    }
                }
            }
            return;
        }

        // 이기는경우
        // 어피치 과녁보다 남은 arrowNum이 더 커야 가능
        if (info[now] < arrowNum) {
            result[now] = info[now] + 1;
            cal(now + 1, arrowNum - (info[now] + 1), info, n, result);
            result[now] = 0;
        }
        // 지는 경우
        // arrowNum 0개 쓸것
        // 현재 스코어에서 10-now만큼 어피치가 이길것{
        cal(now + 1, arrowNum, info, n, result);
    }

    public int[] solution(int n, int[] info) {

        int[] result = new int[11];
        maxResult = new int[11];

        cal(0, n, info, n, result);

        if (max <= 0) {
            int[] answer = {-1};
            return answer;
        }
        int[] answer = new int[11];
        for (int i = 0; i <= 10; i += 1) {
            answer[i] = maxResult[i];
        }
        return answer;
    }
}

