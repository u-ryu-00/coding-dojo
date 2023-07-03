public class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int sum = brown + yellow;

        for (int i = 3; i < sum; i += 1) {
            int j = sum / i;

            if(sum % i == 0 && j >= 3){
                int column = Math.max(i, j);
                int row = Math.min(i, j);
                int center = (column - 2) * (row -2);

                if(center == yellow){
                    answer[0] = column;
                    answer[1] = row;

                    return answer;
                }
            }
        }
        return answer;
    }
}

/*
1. 이해
- 레오는 카펫을 사러 갔다가 중앙에는 노란색으로 칠해져있고 테두리 1줄은 갈색으로 칠해져 있는 격자 모양 카펫을 봤다.
- 레오는 집으로 돌아와서 아까 본 카펫의 노란색과 갈색으로 색칠된 격자의 개수는 기억했지만, 전체 카펫의 크기는 기억하지 못했다.
- 레오가 본 카펫에서 갈색 격자의 수 brown, 노란색 격자의 수 yellow가 매개변수로 주어질 때 카펫의 가로, 세로 크기를 순서대로 배열에 담아 return 하도록 solution 함수를 작성하라.
2. 계획
- 가운데에 노란색 격자가 위치하기 위해서는 가로 세로가 3이상이어야 한다.
- 카펫 사이즈의 경우의 수를 구해야 한다.
- 카펫 사이즈의 경우의 수를 구하기 위해서 brown 격자 수 + yellow 격자 수의 약수를 구한다.
>> 예를 들어, brown = 10, yellow = 2라고 가정할 때, 12의 약수를 구한다.
(1, 12), (2, 6), (3, 4), (4, 3), (6, 2), (12, 1)
이렇게 구한 경우의 수 중에서 정답을 골라야 한다.
일단 가로의 길이가 세로보다 길거나 같다고 제한사항에 있으므로 경우의 수가 (4, 3), (6, 2), (12, 1)로 줄어든다.
또한, 가운데에 노란색 격자가 위치하기 위해서는 가로, 세로 길이가 모두 3 이상이어야 하므로 (6, 2), (12, 1)은 걸러진다.
마지막으로 해당 카펫이 입력으로 주어진 yellow의 개수만큼 노란색 격자가 가운데에 위치할 수 있는지 구해야 한다.
(가로 - 2) * (세로 - 2) = yellow의 개수 이므로 (4 - 2) * (3 - 2) = 2 이다. 그러므로 정답.
3. 실행
 */
