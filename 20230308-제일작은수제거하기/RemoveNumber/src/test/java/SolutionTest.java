import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void simple(){
        Solution solution = new Solution();

        int[] expected = {4, 3, 2};
        int[] real = solution.solution(new int[]{4, 3, 2, 1});

        assertArrayEquals(expected, real);

        int[] expected2 = {-1};
        int[] real2 = solution.solution(new int[]{10});

        assertArrayEquals(expected2,real2);

    }
}
