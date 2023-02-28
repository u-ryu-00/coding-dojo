import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveNumberTest {
    @Test
    void simple() {
        RemoveNumber removeNumber = new RemoveNumber();

        // 숫자,문자 => new 를 안해줬는데?
        int[] expected = {4, 3, 2};
        int[] actual = removeNumber.solution(new int[]{4, 3, 2, 1});

        assertArrayEquals(expected, actual);


    }

}
