import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void Simple(){
        Solution solution = new Solution();
        assertEquals(3, solution.solution(10));
        assertEquals(11, solution.solution(12));
    }

}
