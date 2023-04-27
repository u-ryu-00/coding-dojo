import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[] solution(int[] answers) {
        int[] answer;

        int[] firstPerson = {1, 2, 3, 4, 5};
        int[] secondPerson = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] thirdPerson = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] score = {0, 0, 0};

        for (int i = 0; i < answers.length; i += 1) {
            if (answers[i] == firstPerson[i % 5]) score[0] += 1;
            if (answers[i] == secondPerson[i % 8]) score[1] += 1;
            if (answers[i] == thirdPerson[i % 10]) score[2] += 1;
        }

        int max = Math.max(score[0], Math.max(score[1], score[2]));

        List<Integer> list = new ArrayList<>();

        if (max == score[0]) list.add(1);
        if (max == score[1]) list.add(2);
        if (max == score[2]) list.add(3);

        answer = new int[list.size()];
        for (int i = 0; i < list.size(); i += 1) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}

/*
1. 이해
- 1번 문제부터 마지막 문제까지의 정답이 순서대로 들은 배열 answers가 주어졌을 때,
가장 많은 문제를 맞힌 사람이 누구인지 배열에 담아 return 하도록 solution 함수를 작성하라.
-- 찍는 방식 --
1번 수포자 : 1,2,3,4,5를 계속 반복
2번 수포자 : 2,1,2,3,2,4,2,5를 계속 반복
3번 수포자 : 3,3,1,1,2,2,4,4,5,5를 계속 반복

2. 계획
입력받은 answers 배열과 1번, 2번, 3번 수포자의 답안을 비교해서 몇 개가 일치하는지 score로 센다.
그리고 score가 제일 높은 사람을 구한다.
만약 1번 수포자의 score가 제일 높다면 리스트에 1을 더하고,
2번 수포자의 score가 제일 높다면 2를, 3번 수포자의 score가 제일 높다면 3을 더한다.
 */
