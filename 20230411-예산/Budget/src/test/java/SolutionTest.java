import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void Simple() {
        Solution solution = new Solution();
        assertEquals(3, solution.solution(new int[]{1, 3, 2, 5, 4}, 9));
    }
}
