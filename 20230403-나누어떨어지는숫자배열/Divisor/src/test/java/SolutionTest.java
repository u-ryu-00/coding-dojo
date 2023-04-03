import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void Simple() {
        Solution solution = new Solution();
        assertArrayEquals(new int[]{5, 10}, solution.solution(new int[]{5, 9, 7, 10}, 5));
    }
}
