import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public int solution(String dartResult){
        int answer = 0;
        Pattern pattern = Pattern.compile("([0-9]+)([SDT])([*#]?)");
        Matcher matcher = pattern.matcher(dartResult);
        Stack<Integer> stack = new Stack<>();
        while(matcher.find()){
            int num = Integer.parseInt(matcher.group(1));

            if(matcher.group(2).equals("D")){
                num *= num;
            }

            if(matcher.group(2).equals("T")){
                num *= (num * num);
            }

            if(matcher.group(3).equals("*")){
                if(!stack.isEmpty()){
                   int top = stack.pop();
                   stack.push(top * 2);
                }
                num *= 2;
            }

            if(matcher.group(3).equals("#")){
                num *= -1;
            }
            stack.push(num);
        }

        while(!stack.isEmpty())
            answer += stack.pop();

        return answer;
    }
}
