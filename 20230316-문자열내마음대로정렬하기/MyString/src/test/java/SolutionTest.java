import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void Simple() {
        Solution solution = new Solution();
        assertEquals(new String[]{"car", "bed", "sun"}, solution.solution(new String[]{"sun", "bed", "car"}, 1));
    }
}
