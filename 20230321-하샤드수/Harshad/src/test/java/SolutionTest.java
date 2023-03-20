import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void Simple() {
        Solution solution = new Solution();
        assertTrue(solution.solution(10));
        assertTrue(solution.solution(12));
        assertFalse(solution.solution(11));
        assertFalse(solution.solution(13));
    }
}
