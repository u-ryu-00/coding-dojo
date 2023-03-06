import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void simpleTest(){
        Solution solution = new Solution();
        assertEquals(4,solution.solution(10));
        assertEquals(3,solution.solution(5));
    }

}
