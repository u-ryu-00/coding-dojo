import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {

        int count = 0;
        int number = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                count += 1;
            }
        }

        if (count == 0) {
            int[] answer = {-1};
            return answer;
        }

        int[] answer = new int[count];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                answer[number] = arr[i];
                number += 1;
            }
        }
        Arrays.sort(answer);
        return answer;
    }
}

/*
1. 이해
- array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수 solution을 작성하라.
- divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환
2. 계획
- for문을 돌려서 입력받은 배열의 첫 번째 원소부터 divisor로 나눠준다.
- 나누어떨어지는 경우에만 새로운 배열에 담아준다.
- 새로운 배열의 원소들을 오름차순으로 정렬해준다.
3. 실행
 */
