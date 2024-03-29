import java.util.Arrays;

public class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);

        int index = 0;
        for (int i = people.length - 1; i >= index; i -= 1) {
            if (people[i] + people[index] <= limit) {
                answer += 1;
                index += 1;
                continue;
            }
            answer += 1;
        }
        return answer;
    }
}

/*
1. 이해
- 무인도에 갇힌 사람들을 구명보트를 이용하여 구출하려고 한다. 구명보트는 작아서 한 번에 최대 2명씩 밖에 탈 수 없고, 무게 제한도 있다.
- 예를 들어, 사람들의 몸무게가 [70kg, 50kg, 80kg, 50kg]이고 구명보트의 무게 제한이 100kg이라면 2번째 사람과 4번째 사람은 같이 탈 수 있지만
  1번째 사람과 3번째 사람의 무게의 합은 150kg이므로 구명보트의 무게 제한을 초과하여 같이 탈 수 없다.
- 구명보트를 최대한 적게 사용하여 모든 사람을 구출하려고 한다.
- 사람들의 몸무게를 담은 배열 people과 구명보트의 무게 제한 limit가 매개변수로 주어질 때,
  모든 사람을 구출하기 위해 필요한 구명보트 개수의 최솟값을 return 하도록 solution 함수를 작성하라.
2. 계획
- 일단 사람들끼리의 가능한 조합(2명씩 조합해야 함.)을 모두 생각해본다.
[70kg, 50kg, 80kg, 50kg]인 경우
-> 70 + 50 / 70 + 80 / 70 + 50 // 50 + 80 / 50 + 50 // 80 + 50
-> 120 / 150 / 120 // 130 / 100 / 130
-> 차례대로 limit값(100)과 비교해서 100보다 작거나 같으면 count를 1 늘려준다.
-> people 배열의 길이에서 count값을 빼주면 그것이 정답이 되겠다.
-------------------------------------------------------------------
- 무게 순으로 배열을 정렬하고 가장 무거운 사람과 가장 가벼운 사람이 함께 탈 수 있는지를 확인한다.
- 만약 가장 무거운 사람과 가장 가벼운 사람의 무게의 합이 제한을 넘어간다면 가장 무거운 사람은 어차피 혼자서 보트를 타야만하므로 정답 카운트를 증가시키고 가장 무거운 사람의 위치를 한 칸 당긴다.
- 반대로 두 사람이 보트에 함께 탑승할 수 있다면 정답 카운트를 증가시키고 가장 가벼운 사람의 위치와 가장 무거운 사람의 위치를 모두 한 칸씩 당겨 다음을 비교한다.
3. 실행
 */
