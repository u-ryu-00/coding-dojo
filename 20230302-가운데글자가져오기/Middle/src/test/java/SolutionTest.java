import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void Odd(){
        Solution solution = new Solution();
        assertEquals("c",solution.solution("abcde"));
    }

    @Test
    void Even(){
        Solution solution = new Solution();
        assertEquals("we",solution.solution("qwer"));
    }
}
