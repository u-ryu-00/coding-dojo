public class Solution {
    public int[] solution(int[] array) {

        // 배열의 길이가 1인 경우 -1을 반환
        if (array.length == 1) {
            int[] answer = {-1};
            return answer;
        }

        // 배열의 길이가 1보다 클 때 가장 작은 수를 뺀 길이의 배열로 answer배열의 크기를 잡아준다.
        int[] answer = new int[array.length - 1];

        int min = array[0];

        // 배열에서 가장 작은 수 구하는 로직
        for (int i = 0; i < array.length; i += 1) {
            if (min > array[i]) {
                min = array[i];
            }
        }

        //반복문용 변수. 가장 작은 수가 여러개 일 수 있기 때문에 사용
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == min) {
                continue;
            }
            answer[index++] = array[i];
        }
        return answer;
    }
}

/*
1. 이해
- 정수를 저장한 배열 array에서 가장 작은 수를 제거한 배열을 리턴하는 함수 solution을 완성하라.
- 단 리턴하려는 배열이 빈 배열인 경우에는 배열에 -1을 채워 리턴하라.
2. 계획
- 배열에서 가장 작은 값 찾는 법?
    - 배열의 첫번째 원소를 min으로 저장한다.
    - 배열의 크기만큼 반복문을 돌면서 초기 min값과 비교하면서 현재 min 값보다 작은 값이면 min에 재할당 한다.
    - 위와 같은 과정을 통해 배열의 min 값을 찾아주고 이를 배열에서 삭제해준다.
3. 실행
 */
