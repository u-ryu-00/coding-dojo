import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void Simple() {
        Solution solution = new Solution();
        assertEquals(solution.solution("1 2 3 4"), "1 4");
        assertEquals(solution.solution("-1 -2 -3 -4"), "-4 -1");
        assertEquals(solution.solution("-1 -1"), "-1 -1");
    }
}
