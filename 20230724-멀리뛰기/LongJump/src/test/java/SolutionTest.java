import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void Simple(){
        Solution solution = new Solution();
        assertEquals(5, solution.solution(4));
        assertEquals(3, solution.solution(3));
    }
}
