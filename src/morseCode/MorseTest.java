package morseCode;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class MorseTest {

    @Test
    public void testTranslation() {
        MorseLogic logic = new MorseLogic();
        String inData = "A";
        String expected = "*-";

        String actual = logic.translation(inData);

        assertEquals(expected, actual);

}
    @Test
    public void testSplit(){
        MorseLogic logic = new MorseLogic();
        String inData = "I AM A SENTENCE";
        int expected = 4;

        int actual = logic.textSplit(inData).length;

        assertEquals(expected, actual);
    }
    @Test
    public void testChangeUpperCase(){
        MorseLogic logic = new MorseLogic();
        String inData = "a";
        String expected = "A";

        String actual = logic.changeToUpperCase(inData);

        assertEquals(expected, actual);
    }
    @Test
    public void testIsValidInput(){
        MorseLogic logic = new MorseLogic();
        String inData = "!";
        boolean expected = false;

        boolean actual = logic.checkValidInput(inData);

        assertEquals(expected,actual);
    }
}
