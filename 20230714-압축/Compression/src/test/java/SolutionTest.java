import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void Simple() {
        Solution solution = new Solution();
        assertArrayEquals(new int[]{11, 1, 27, 15}, solution.solution("KAKAO"));
        assertArrayEquals(new int[]{20, 15, 2, 5, 15, 18, 14, 15, 20, 27, 29, 31, 36, 30, 32, 34}, solution.solution("TOBEORNOTTOBEORTOBEORNOT"));
        assertArrayEquals(new int[]{1, 2, 27, 29, 28, 31, 30}, solution.solution("ABABABABABABABAB"));
    }
}
