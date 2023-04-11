import java.util.Arrays;

public class Solution {

    public int solution(int[] department, int budget) {
        int answer = 0;
        int money = 0;

        Arrays.sort(department);

        for (int i = 0; i < department.length; i += 1) {
            money += department[i];

            if (money > budget) {
                answer = i;
                break;
            }

            if (money <= budget) {
                answer = department.length;
            }
        }
        return answer;
    }
}

/*
1. 이해
- 각 부서가 신청한 금액들이 있는데 예산에 맞게 금액을 지원하려면 최대 몇 개의 부서를 지원해줄 수 있는가?
- d의 각 원소는 부서별로 신청한 금액을 나타낸다.
2. 계획
- d의 배열 원소를 작은 순서대로 정렬한다.
- 첫번째 원소부터 더하기 시작한다.
- 더한 수가 예산보다 크게 되는 순간 더하기를 멈춘다. 그리고 이때 answer는 i가 된다.
- 만약 더한 수가 예산보다 작거나 같다면 answer는 department의 length가 된다.
3. 실행
 */
