import java.util.Arrays;

public class Solution {
    public int solution(int[] citations) {
        int answer = 0;

        Arrays.sort(citations);
        for (int i = 0; i < citations.length; i++) {
            int h = citations.length - i;
            if (citations[i] >= h) {
                answer = h;
                break;
            }
        }
        return answer;
    }
}

/*
1. 이해
- H-Index는 과학자의 생산성과 영향력을 나타내는 지표이다.
  어느 과학자의 H-Index를 나타내는 값인 h를 구하려고 한다.
  H-Index는 다음과 같이 구한다.
  어떤 과학자가 발표한 논문 n편 중, h번 이상 인용된 논문이 h편 이상이고
  나머지 논문이 h번 이하 인용되었다면 h의 최댓값이 이 과학자의 H-Index이다.
2. 계획
3. 실행
 */
