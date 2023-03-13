import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void Simple() {
        Solution solution = new Solution();
        assertEquals("김서방은 1에 있다", solution.solution(new String[]{"Jane", "Kim"}));
    }
}
