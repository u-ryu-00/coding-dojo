class Solution {
    public String[] solution(int n, int[] array1, int[] array2) {
        String[] answer = new String[n];
        for (int i = 0; i < n; i++) {
            answer[i] = Integer.toBinaryString(array1[i] | array2[i]);
        }

        for (int i = 0; i < n; i++) {
            answer[i] = String.format("%" + n + "s", answer[i]);
            answer[i] = answer[i].replaceAll("1", "#");
            answer[i] = answer[i].replaceAll("0", " ");
        }
        return answer;
    }
}

/*
1. 이해
- 어느 하나라도 벽인 부분은 전체 지도에서 벽이다. (벽이 1)
- 둘 다 공백인 부분은 전체 지도에서 공백이다. (공백이 0)

2. 계획
- 먼저 입력받은 array1과 array2를 이진수로 변환한다.
- array1과 array2의 요소들을 각각 비교해서 둘 중 하나라도 1이면 1로 처리하고 둘 다 0이면 0으로 처리한다.
- 처리한 것을 answer 배열에 저장한다.
- 1이면 #을 출력하고 0이면 공백을 출력한다.
3. 실행
 */
