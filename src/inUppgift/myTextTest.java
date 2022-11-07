package inUppgift;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class myTextTest {


        @Test
        public void testTextLength(){
            myTextLogic inputTracker = new myTextLogic();
            inputTracker.setTextChar("Celebrate every tiny victory.");
            int expected = 29;

            int actual = inputTracker.getTextChar();

            assertEquals(expected, actual);
        }
        @Test
        public void testLongestWord() {
            myTextLogic inputTracker = new myTextLogic();

            inputTracker.setLongestWord("Celebrate every tiny victory.");
            String expected = "Celebrate";

            String actual = inputTracker.getLongestWord();

            assertEquals(expected, actual);
        }
        @Test
        public void testAmountWords(){
            myTextLogic inputTracker = new myTextLogic();
            inputTracker.setAmountOfWords("Celebrate every tiny victory:");
            int expected = 4;

            int actual = inputTracker.getAmountOfWords();

            assertEquals(expected, actual);
        }
}
