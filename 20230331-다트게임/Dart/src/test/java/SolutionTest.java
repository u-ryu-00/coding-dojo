import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void Simple() {
        Solution solution = new Solution();
        assertEquals(37, solution.solution(("1S2D*3T\t")));
        assertEquals(9, solution.solution(("1D2S#10S\t")));
        assertEquals(3, solution.solution(("1D2S0T\t")));
        assertEquals(23, solution.solution(("1S*2T*3S")));
        assertEquals(5, solution.solution(("1D#2S*3S")));
        assertEquals(-4, solution.solution(("1T2D3D#")));
        assertEquals(59, solution.solution(("1D2S3T*")));

    }

}
