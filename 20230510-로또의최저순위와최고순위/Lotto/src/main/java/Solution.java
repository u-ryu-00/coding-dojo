public class Solution {
    public int[] solution(int[] lottos, int[] win_numbers) {
        int[] answer = {0, 0}; // 당첨가능한 최고순위, 최저순위
        int countWinNumber = 0; // 0 제외 당첨번호개수
        int countZero = 0; // 0 개수

        for (int i : win_numbers) {
            for (int j = 0; j < lottos.length; j++) {
                if (i == lottos[j]) {
                    countWinNumber += 1;
                    break;
                }
            }
        }

        for (int i : lottos) {
            if (i == 0) countZero += 1;
        }

        answer[0] = 7 - (countWinNumber + countZero);
        answer[1] = (countWinNumber == 0) ? 6 : 7 - countWinNumber;

        return answer;
    }
}

/*
1. 이해
- 배열 lottos : 민우가 구매한 로또 번호를 담은 배열
- 배열 win_numbers : 당첨 번호를 담은 배열
- 당첨 가능한 최고 순위와 최저 순위를 차례대로 배열에 담아서 return 하도록 solution 함수를 작성하라.
- 알아볼 수 없는 번호를 0으로 표기하기로 하고, 민우가 구매한 로또 번호 6개가 44, 1, 0, 0, 31, 25라고 하자.
- 당첨 번호 6개가 31, 10, 45, 1, 6, 19라면 당첨 가능한 최고 순위와 최저 순위의 한 예는
최고 순위 번호 : 31, 10, 44, 1, 6, 19 => 4개 번호 일치, 3등
최저 순위 번호 : 31, 11, 44, 1, 7, 25 => 2개 번호 일치, 5등
2. 계획

3. 실행
 */
