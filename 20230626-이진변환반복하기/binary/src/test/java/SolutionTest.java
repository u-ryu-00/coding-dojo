import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void Simple() {
        Solution solution = new Solution();
        assertArrayEquals(solution.solution("110010101001"), new int[]{3, 8});
        assertArrayEquals(solution.solution("01110"), new int[]{3, 3});
        assertArrayEquals(solution.solution("1111111"), new int[]{4, 1});
    }
}
