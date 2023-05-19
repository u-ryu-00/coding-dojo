import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void Simple() {
        Solution solution = new Solution();
        assertArrayEquals(new int[]{0, 2, 2, 0, 1, 0, 0, 0, 0, 0, 0}, solution.solution(5, new int[]{2, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0}));
    }
}
