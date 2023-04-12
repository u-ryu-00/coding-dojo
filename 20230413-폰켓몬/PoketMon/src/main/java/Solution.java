import java.util.HashSet;

public class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        HashSet<Integer> numbersSet = new HashSet<>();
        for (int number : numbers) {
            numbersSet.add(number);
        }
        if (numbers.length / 2 >= numbersSet.size()) {
            answer = numbersSet.size();
        }
        if (numbers.length / 2 < numbersSet.size()) {
            answer = numbers.length / 2;
        }
        return answer;
    }
}

/*
1. 이해
- 연구실에 있는 총 N마리의 폰켓몬 중에서 N/2마리를 가져간다.
- 같은 종류의 폰켓몬은 같은 번호를 가지고 있다.
- 최대한 많은 종류의 폰켓몬을 포함해서 N/2마리를 선택하려 한다.
- N/2가 폰켓몬 종류의 수보다 크면 폰켓몬 종류의 수를 return
- N/2가 폰켓몬 종류의 수보다 작으면 N/2를 return
- 생각보다 간단하다.
2. 계획
- N/2의 수는 아주 쉽게 구할 수 있다. numbers의 크기를 구해서 2로 나누면 끝.
- 폰켓몬 종류의 수는 배열의 요소 중 중복되는 것들을 모두 제거한 후
그 배열의 크기를 구해주면 될 것 같다. 중복 제거는 HashSet을 이용!
- 그 후 if문으로 경우에 맞게 처리해주면 된다.
3. 실행
 */
