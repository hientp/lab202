import org.junit.jupiter.api.Test;

import java.util.List;

class OddTest {
    @Test
    public void testOddNum(){
        Odd oddnum = new Odd();

        assertEquals(1, 3, 5, 7, 9, oddnum.oddNum(10));
    }
    private void assertEquals(int i, int i1, int i2, int i3, int i4, List<Integer> oddNum) {
    }

}

// Ich komm nicht drauf es testen zu lassen ob die Nummern ungerade sind.....
// Ich hab erstmal nur getestet ob der Test theoretisch laufen würde und deshalb die Zahlen erstmal händisch eingetippt.
