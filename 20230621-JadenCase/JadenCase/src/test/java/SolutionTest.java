import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void Simple() {
        Solution solution = new Solution();
        assertEquals(solution.solution("3people unFollowed me"), "3people Unfollowed Me");
        assertEquals(solution.solution("for the last week"), "For The Last Week");
    }
}
