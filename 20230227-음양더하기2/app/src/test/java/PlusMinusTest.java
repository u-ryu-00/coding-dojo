import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PlusMinusTest {
    @Test
    void simple() {
        PlusMinus plusMinus = new PlusMinus();

        assertEquals(plusMinus.solution(
                new int[] {4, 7, 12},new boolean[] {true, false, true}),9);

        assertEquals(plusMinus.solution(
                new int[] {1, 2, 3},new boolean[] {false, false, true}),0);

    }


}
