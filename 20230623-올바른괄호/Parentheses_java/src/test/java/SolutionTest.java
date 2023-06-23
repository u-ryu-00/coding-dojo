import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void Simple(){
        Solution solution = new Solution();
        assertTrue(solution.solution("()()"));
        assertTrue(solution.solution("(())()"));
        assertFalse(solution.solution(")()("));
        assertFalse(solution.solution("(()("));
    }
}
