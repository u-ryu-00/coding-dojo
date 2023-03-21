public class Solution {
    public int solution(long number) {
        int answer = 0;

        if (number == 1) {
            return 0;
        }

        while (number != 1) {
            if (number % 2 == 0) {
                number /= 2;
                answer += 1;
            }

            if (number == 1) {
                break;
            }

            if (number % 2 == 1) {
                number = number * 3 + 1;
                answer += 1;
            }

            if (answer == 499) {
                return -1;
            }
        }
        return answer;
    }
}
