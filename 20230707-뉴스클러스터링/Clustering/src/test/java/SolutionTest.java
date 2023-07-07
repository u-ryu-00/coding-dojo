import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void Simple(){
        Solution solution = new Solution();
        assertEquals(16384, solution.solution("FRANCE", "french"));
        assertEquals(65536, solution.solution("handshake", "shake hands"));
        assertEquals(43690, solution.solution("aa1+aa2", "AAAA12"));
        assertEquals(65536, solution.solution("E=M*C^2", "e=m*c^2"));
    }
}
