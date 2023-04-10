import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void Simple() {
        Solution solution = new Solution();
        assertEquals(4000, solution.solution(new int[][]{{60, 50}, {30, 70}, {60, 30}, {80, 40}}));
    }
}
