import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void Simple() {
        Solution solution = new Solution();
        assertEquals("BC", solution.solution("AB", 1));
    }
}
