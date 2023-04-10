class Solution {
    public int solution(int[][] sizes) {
        int max_row = 0;
        int max_col = 0;

        for (int i = 0; i < sizes.length; i += 1) {
            if (sizes[i][0] < sizes[i][1]) {
                int tmp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = tmp;
            }
            if (max_row < sizes[i][0]) max_row = sizes[i][0];
            if (max_col < sizes[i][1]) max_col = sizes[i][1];
        }
        return max_col * max_row; //결과
    }
}

/*
1. 이해
- 모든 명함의 가로 길이와 세로 길이를 나타내는 2차원 배열 sizes가 매개변수로 주어진다.
- 모든 명함을 수납할 수 있는 가장 작은 지갑을 만들 때, 지갑의 크기를 return 하도록 solution 함수를 완성하라.
2. 계획
- [w, h] 형식으로 sizes의 원소가 나타나게 될텐데, w와 h의 크기를 비교한다.
- 둘 중 큰 수를 w로, 작은 수를 h로 정한다.
- 모든 w들 중 가장 큰 수를 지갑의 w로 정하고, 모든 h들 중 가장 큰 수를 지갑의 h로 정한다.
- answer = 지갑의 w * 지갑의 h
** 아니면 그냥 요소 싹 다 꺼내서 1차원 배열에 넣고 (이게 가능하다면) 제일 큰 수 * 제일 작은 수 해도 될 듯
3. 실행
 */
