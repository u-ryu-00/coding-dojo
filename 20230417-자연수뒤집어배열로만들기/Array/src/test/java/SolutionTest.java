import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void Simple() {
        Solution solution = new Solution();
        assertArrayEquals(new int[]{5, 4, 3, 2, 1}, solution.solution(12345));
    }
}
