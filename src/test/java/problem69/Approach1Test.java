package problem69;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Approach1Test {
    @Test
    void basic1() {
        long result = Approach1.sumFirstN(3);
        assertEquals(6,result);
    }
}