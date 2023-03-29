import java.util.Arrays;
public class Solution {
    public String solution(String s){
        String answer ="";

        char[] array = s.toCharArray();
        Arrays.sort(array);

        answer = new String(array);

        StringBuffer stringBuffer = new StringBuffer(answer);
        String reverse = stringBuffer.reverse().toString();
        return reverse;
    }
}
