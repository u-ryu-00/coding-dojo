import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class solutionTest {
    @Test
    void Simple() {
        Solution solution = new Solution();
        assertArrayEquals(new int[]{3, 5}, solution.solution(new int[]{44, 1, 0, 0, 31, 25}, new int[]{31, 10, 45, 1, 6, 19}));
    }
}
