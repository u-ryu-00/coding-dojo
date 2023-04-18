import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void Simple(){
        Solution solution = new Solution();
        assertEquals(6,solution.solution(123));
        assertEquals(24,solution.solution(987));
    }
}
