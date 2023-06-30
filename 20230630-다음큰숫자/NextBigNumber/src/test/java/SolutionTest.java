import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void simple(){
        Solution solution = new Solution();
        assertEquals(solution.solution(78),83);
        assertEquals(solution.solution(15),23);
    }
}
