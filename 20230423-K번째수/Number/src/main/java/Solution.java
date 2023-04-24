import java.util.Arrays;

public class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for (int i = 0; i < commands.length; i += 1) {
            int start = commands[i][0] - 1;
            int end = commands[i][1];
            int select = commands[i][2] - 1;

            int[] copyArray = Arrays.copyOfRange(array, start, end);
            Arrays.sort(copyArray);
            answer[i] = copyArray[select];
        }
        return answer;
    }
}

/*
1. 이해
- 배열 array의 i번째 숫자부터 j번째 숫자까지 자르고 정렬했을 때, k번째에 있는 수를 구하려 한다.
- 예를 들어 array가 [1,5,2,6,3,7,4], i = 2, j = 5,k = 3이라면
1) array의 2번째부터 5번째까지 자르면 [5,2,6,3]이다.
2) 1)에서 나온 배열을 정렬하면 [2,3,5,6]이다.
3) 2)에서 나온 배열의 3번째 숫자는 5이다.
2. 계획
- i번째 숫자부터 j번째 숫자까지 배열 자르기 -> 배열 자르기와 관련된 메서드가 있나..?
  메서드 잘 모르겠으면 그냥 for문 돌려서 잘라도 되고, 오늘은 Arrays 클래스의 copyOfRange 메서드가 있어서 이걸로 풀어보겠다.
- 배열 요소 오름차순 정렬하기
- array[k-1]의 값 구하면 그것이 answer!
 */
