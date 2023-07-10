import java.util.HashSet;

public class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0, 0};
        char end = words[0].charAt(words[0].length() - 1);
        char start;
        HashSet<String> set = new HashSet<>();
        set.add(words[0]);

        for (int i = 1; i < words.length; i += 1) {
            start = words[i].charAt(0);
            set.add(words[i]);
            if (end != start || set.size() != i + 1) {
                answer[0] = (i % n) + 1;
                answer[1] = (i / n) + 1;
                break;
            }
            end = words[i].charAt(words[i].length() - 1);
        }
        return answer;
    }
}

/*
1. 이해
- 1부터 n까지 번호가 붙어있는 n명의 사람이 영어 끝말잇기를 하고 있다. 영어 끝말잇기는 다음과 같은 규칙으로 진행된다.
  1) 1번부터 번호 순서대로 한 사람씩 차례대로 단어를 말한다.
  2) 마지막 사람이 단어를 말한 다음에는 다시 1번부터 시작한다.
  3) 앞사람이 말한 단어의 마지막 문자로 시작하는 단어를 말해야 한다.
  4) 이전에 등장했던 단어는 사용할 수 없다.
  5) 한 글자인 단어는 인정되지 않는다.
- 사람의 수 n과 사람들이 순서대로 말한 단어 words가 매개변수로 주어질 때, 가장 먼저 탈락하는 사람의 번호와
그 사람이 자신의 몇 번째 차례에 탈락하는지를 구해서 return 하도록 solution 함수를 완성하라.
2. 계획
- words 배열을 탐색하면서 탐색한 문자열을 Set에 계속 저장한 뒤, 탐색할 때마다 Set에 저장이 되어있는지를 검사해 중복된 단어를 걸러주었다.
3. 실행
 */
