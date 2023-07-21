import java.util.LinkedList;

public class Solution {
    static final int CACHE_HIT = 1;
    static final int CACHE_MISS = 5;
    public int solution(int cacheSize, String[] cities) {
        if (cacheSize == 0) return 5 * cities.length;

        int answer = 0;

        LinkedList<String> cache = new LinkedList<>();

        for (int i = 0; i < cities.length; ++i) {
            String city = cities[i].toUpperCase();

            // cache hit
            if (cache.remove(city)) {
                cache.addFirst(city);
                answer += CACHE_HIT;

                // cache miss
            } else {
                int currentSize = cache.size();

                if (currentSize == cacheSize) {
                    cache.pollLast();
                }

                cache.addFirst(city);
                answer += CACHE_MISS;
            }
        }
        return answer;
    }
}

/*
1. 이해
- 지도에서 도시 이름을 검색하면 해당 도시와 관련된 맛집 게시물들을 데이터베이스에서 읽어 보여주는 서비스를 개발하고 있다.
- 데이터베이스에서 게시물을 가져오는 부분의 실행시간이 너무 오래걸린다는 것을 알게 되었다.
- DB 캐시를 적용하여 성능 개선을 시도하고 있지만 캐시 크기를 얼마로 해야 효율적인지 몰라 난감한 상황이다.
- DB 캐시를 적용할 때 캐시 크기에 따른 실행시간 측정 프로그램을 작성하라.
(입력 형식)
- 캐시크기
2. 계획
3. 실행
 */
