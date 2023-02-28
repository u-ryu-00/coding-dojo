public class RemoveNumber {
    /*
    1. 이해
    - 정수를 저장한 배열 array에서 가장 작은 수를 제거한 배열을 리턴하는 함수 solution을 만든다.
    - 단, 리턴하려는 배열이 빈 배열인 경우에는 배열에 -1을 채워 리턴한다.
    -
    2. 계획
    3. 실행
     */

    public int[] solution(int[] arr) {

        //배열 길이가 1인 경우 -1 반환
        if (arr.length == 1) {
            int[] answer = {-1};
            return answer;
        }

        //배열길이가 1보다 클 때 가장 작은 수를 뺀 길이의 배열로
        int[] answer = new int[arr.length - 1];

        int min = arr[0]; //하나의 값을 기준으로 잡음.

        //가장 작은 수 구하기
        for (int i = 0; i < arr.length; i++) {
            min = Math.min(min, arr[i]);
        }

        int index = 0;  //반복문용 변수. 가장 작은 수가 여러개 일 수 있기 때문에 사용

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == min) {
                continue;
            }

            answer[index++] = arr[i];
        }

        return answer;

    }
}
