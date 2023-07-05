import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void Simple() {
        Solution solution = new Solution();
        assertEquals(solution.solution("baabaa"), 1);
        assertEquals(solution.solution("cdcd"), 0);
    }
}
