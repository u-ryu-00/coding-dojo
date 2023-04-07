public class Solution {
    public String[] solution(int n, int[] array1, int[] array2) {
        String[] answer = new String[n];
        for (int i = 0; i < n; i += 1) {
            answer[i] = Integer.toBinaryString(array1[i] | array2[i]);
        }

        for (int i = 0; i < n; i += 1) {
            answer[i] = String.format("%" + n + "s", answer[i]);
            answer[i] = answer[i].replace("1", "#");
            answer[i] = answer[i].replace("0", " ");
        }
        return answer;
    }
}

/*
1. 이해
- 지도는 한 변의 길이가 n인 정사각형 배열 형태로, 각 칸은 공백(" ") 또는 벽("#") 두 종류로 이루어져 있다.
- 전체 지도는 두 장의 지도를 겹쳐서 얻을 수 있다.
  지도 1 또는 지도 2 중 어느 하나라도 벽인 부분은 전체 지도에서도 벽이다.
  지도 1과 지도 2에서 모두 공백인 부분은 전체 지도에서도 공백이다.
- 지도 1과 지도 2는 각각 정수 배열로 암호화되어 있다.
2. 계획
- 첫번째 정수 배열 array1의 원소 각각을 이진수로 변환한다.
- 두번째 정수 배열 array2의 원소 각각을 이진수로 변환한다.
| 으로 처리해서 둘 다 0이면 0, 어느 하나라도 1이면 1으로 처리한다.
- 1을 #으로 바꿔주고 0을 공백으로 바꿔준다.
3. 실행
 */
