import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[] solution(int[] array) {
        int[] answer = {};
        List<Integer> result = new ArrayList<Integer>();
        int number = 10;

        for (int i = 0; i < array.length; i += 1) {
            if (array[i] != number) {
                result.add(array[i]);
                number = array[i];
            }
        }

        answer = new int[result.size()];
        for (int i = 0; i < answer.length; i += 1) {
            answer[i] = result.get(i);
        }
        return answer;
    }
}

/*
1. 이해
- 배열 array의 각 원소는 숫자 0부터 9까지로 이루어져 있다.
이때, 배열 array에서 연속적으로 나타나는 숫자는 하나만 남기고 전부 제거하려고 한다.
단, 제거 된 후 남은 수들을 반환할 때는 배열 array의 원소들의 순서를 유지해야 한다.
배열 array에서 연속적으로 나타나는 숫자는 제거하고 남은 수들을 return 하는 solution 함수를 완성하라.
2. 계획
- 리스트를 하나 만들어준다.
- number라는 변수를 하나 만들어주고 10의 값으로 초기화해준다.
- number와 array의 원소를 하나하나 비교해주고 비교한 값이 다르면 number의 값을 array 원소의 값으로 바꿔준다.
- 리스트의 원소를 다시 배열에 추가해준다.
3. 실행
 */
