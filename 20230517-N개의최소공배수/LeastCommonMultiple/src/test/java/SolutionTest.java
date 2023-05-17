import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void Simple() {
        Solution solution = new Solution();
        assertEquals(168, solution.solution(new int[]{2, 6, 8, 14}));
        assertEquals(6, solution.solution(new int[]{1, 2, 3}));
    }
}
