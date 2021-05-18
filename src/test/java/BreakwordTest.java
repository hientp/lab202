import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BreakwordTest {
    @Test
    void hasBreakWord() {

        com.java2novice.junit.samples.Breakword breakword1 = new com.java2novice.junit.samples.Breakword();

        String sentence1 = "Don't break my heart";
        String sentence2 = "I love to breakdance";

        assertEquals(true, breakword1.hasBreakWord(sentence1));
        assertEquals(false, breakword1.hasBreakWord(sentence2));

    }

}