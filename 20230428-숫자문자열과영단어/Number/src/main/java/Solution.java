public class Solution {
    public int solution(String string) {
        String[] num = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for (int i = 0; i < 10; i++) {
            string = string.replace(num[i], Integer.toString(i));
        }
        int answer = Integer.parseInt(string);
        return answer;
    }
}
