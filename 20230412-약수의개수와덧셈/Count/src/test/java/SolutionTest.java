import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void Simple() {
        Solution solution = new Solution();
        assertEquals(43, solution.solution(13, 17));
        assertEquals(52, solution.solution(24, 27));
    }
}
