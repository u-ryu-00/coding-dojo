class Solution {
    private static int[] board;
    private static int answer;

    public static int solution(int n) {
        // 배열의 값은 해당 행의 queen이 있는 '열(column)'을 의미함
        board = new int[n];

        backTracking(0, n);

        return answer;
    }

    private static void backTracking(int depth, int n) {
        if (depth == n) {
            answer++;
            return;
        }
        for (int i = 0; i < n; i++) {
            board[depth] = i;
            if (valid(depth)) {
                backTracking(depth + 1, n);
            }
        }
    }

    private static boolean valid(int i) {
        for (int j = 0; j < i; j++) {
            if (board[i] == board[j]) return false;
            if (Math.abs(i - j) == Math.abs(board[i] - board[j])) return false;
        }
        return true;
    }
}

/*
1. 이해
- 가로, 세로 길이가 n인 정사각형으로 된 체스판이 있다. 체스판 위의 n개의 퀸이 서로를 공격할 수 없도록 배치하고 싶다.
- 체스판의 가로 세로의 길이 n이 매개변수로 주어질 때, n개의 퀸이 조건에 만족하도록 배치할 수 있는 방법의 수를 return 하는 solution 함수를 완성하라.
- 퀸은 가로, 세로, 대각선으로 이동할 수 있다. (칸 수에 관계 없이)
-> 하나의 퀸이 놓여진 직선에는 다른 퀸이 놓여질 수 없다.
-> 하나의 퀸이 놓여진 대각선에는 다른 퀸이 놓여질 수 없다.
-> 퀸은 각 행과 열에서 오직 하나만 존재할 수 있다.
2. 계획
3. 실행
 */
