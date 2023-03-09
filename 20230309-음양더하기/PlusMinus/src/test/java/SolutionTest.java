import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void simple() {
        Solution solution = new Solution();

        assertEquals(solution.solution(new int[] {4, 7, 12},new boolean[] {true, false, true}),9);

        assertEquals(solution.solution(new int[] {1, 2, 3},new boolean[] {false, false, true}),0);

    }

}
