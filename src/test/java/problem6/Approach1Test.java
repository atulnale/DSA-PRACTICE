package problem6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Approach1Test {
    Approach1 approach1 = new Approach1();
    @Test
    void PAYPALISHIRING() {
        String result = approach1.convert("PAYPALISHIRING", 3);
        assertEquals("PAHNAPLSIIGYIR", result);
    }

    @Test
    void PAYPALISHIRING4() {
        String result = approach1.convert("PAYPALISHIRING", 4);
        assertEquals("PINALSIGYAHRPI", result);
    }
    @Test
    void A() {
        String result = approach1.convert("A", 1);
        assertEquals("A", result);
    }
    @Test
    void A2() {
        String result = approach1.convert("A", 2);
        assertEquals("A", result);
    }
}