public class Solution {
    boolean[] visited;
    int[] pick; //뽑은 위치를 저장. 0번 인덱스는 첫 번째 줄에서 퀸의 위치를 의미한다.
    int count;

    public int solution(int n) {
        visited = new boolean[n];
        pick = new int[n];
        count = 0;

        permutation(n, 0);
        return count;
    }

    public void permutation(int n, int index) {
        if (n == index) {
            count += 1;
            return;
        }

        for (int i = 0; i < n; i += 1) {
            if (!visited[i]) {
                visited[i] = true;
                pick[index] = i;
                if (check(index)) permutation(n, index + 1);
                visited[i] = false;
            }
        }
    }

    public boolean check(int index) {
        for (int i = 0; i < index; i += 1) {
            if (pick[i] == pick[index]) return false; //같은 행에 퀸이 존재하면 false
            if (Math.abs(index - i) == Math.abs(pick[index] - pick[i])) return false; //대각선에 퀸이 존재한다면 false
        }
        return true;
    }
}

/*
1. 이해
- 가로, 세로 길이가 n인 정사각형으로 된 체스판이 있다.
- 체스판 위의 n개의 퀸이 서로를 공격할 수 없도록 배치하고 싶다.
- 퀸은 가로, 세로, 대각선으로 이동할 수 있다.
- 체스판의 가로 세로의 길이 n이 매개변수로 주어질 때,
n개의 퀸이 조건에 만족하도록 배치할 수 있는 방법의 수를 return하는 solution 함수를 완성하라.
2. 계획
- 한 줄에 퀸이 하나밖에 못들어간다.
3. 실행
- 순열로 퀸의 순서를 뽑아준 후, 뽑은 퀸을 이전의 뽑았던 퀸의 위치와 비교하여
뽑을 수 있는 위치라면 재귀함수를 사용해 순환적으로 호출해주었고, 뽑을 수 없는 위치라면
(행이 같거나 대각선 위치에 존재하거나) 퀸을 뽑지 않았다.
뽑을 때는 1차원 배열을 이용해 각 인덱스가 하나의 열을 나타내도록 하였다.
0번 인덱스는 첫 번째 열에서의 퀸 위치를 저장하도록
1번 인덱스는 두 번째 열에서의 퀸 위치를 저장하도록
n-1번 인덱스는 n번째 열에서의 퀸의 위치를 저장하도록 하였다.

행이 같은지 확인할 때에는 배열의 요소를 비교해주었고, 대각선 위치에 존재하는지 확인하기 위해서
Math.abs() 함수를 사용하였다.
두 개의 퀸의 위치가 서로 행의 차이와 열의 차이가 같다면 대각선에 존재하는 것이므로 아래와 같이 작성하였다.
Math(i-index) == Math(pick[i]-pick[index])
 */
