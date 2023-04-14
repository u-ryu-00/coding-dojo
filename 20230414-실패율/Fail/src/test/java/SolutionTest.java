import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void Simple() {
        Solution solution = new Solution();
        assertArrayEquals(new int[]{3, 4, 2, 1, 5}, solution.solution(5, new int[]{2, 1, 2, 6, 2, 4, 3, 3}));
    }
}
