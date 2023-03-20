import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void Simple() {
        Solution solution = new Solution();
        assertEquals("수박수", solution.solution(3));
        assertEquals("수박수박", solution.solution(4));
    }
}
