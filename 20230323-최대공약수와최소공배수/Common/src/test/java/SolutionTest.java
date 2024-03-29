import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void Simple() {
        Solution solution = new Solution();
        assertArrayEquals(new int[]{3, 12}, solution.solution(3, 12));
        assertArrayEquals(new int[]{1, 10}, solution.solution(2, 5));
    }
}
