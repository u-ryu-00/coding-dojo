public class Solution {
    public int solution(int number) {
        int answer = 0;

        String binary = Integer.toBinaryString(number);

        int numberOfOne = 0;

        for (int i = 0; i < binary.length(); i += 1) {
            if (Integer.toBinaryString(number).charAt(i) == '1') {
                numberOfOne += 1;
            }
        }

        for (int j = number + 1; j <= 1000000; j += 1) {
            int bigNumberOfOne = 0;

            String binaryBigNumber = Integer.toBinaryString(j);

            for (int k = 0; k < binaryBigNumber.length(); k += 1) {
                if (binaryBigNumber.charAt(k) == '1') {
                    bigNumberOfOne += 1;
                }
            }

            if (numberOfOne == bigNumberOfOne) {
                answer = j;
                break;
            }
        }
        return answer;
    }
}

/*
1. 이해
- 자연수 number가 주어졌을 때, number의 다음 큰 숫자는 다음과 같이 정의한다.
  1) number의 다음 큰 숫자는 number보다 큰 자연수이다.
  2) number의 다음 큰 숫자의 n은 2진수로 변환했을 때 1의 갯수가 같다.
  3) number의 다음 큰 숫자는 조건 1과 2를 만족하는 수중 가장 작은 수이다.
- 예를 들어서 78(1001110)의 다음 큰 숫자는 83(1010011)이다.
- 자연수 number가 매개변수로 주어질 때, number의 다음 큰 숫자를 return 하는 solution 함수를 완성하라.
2. 계획
- 입력받은 number라는 숫자를 2진수로 변환한다.
- 변환한 2진수의 1의 개수를 구한다.
- 반복문을 돌려서 입력받은 number에서 1씩 더해가면서 이진수로 바꾸고 1의 개수를 체크한다.
- number의 1의 개수와 같은 숫자가 나오면 그 숫자를 return 한다.
3. 실행
*/
