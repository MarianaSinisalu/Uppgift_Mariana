package morseCode;

import java.util.HashMap;
import java.util.Map;

public class MorseLogic {
    private HashMap<String, String> translator;

    public MorseLogic() {
        translator = new HashMap<String, String>();

        translator.put("A", "*-");
        translator.put("B", "-***");
        translator.put("C", "-*-*");
        translator.put("D", "-**");
        translator.put("E", "*");
        translator.put("F", "**-*");
        translator.put("G", "--*");
        translator.put("H", "****");
        translator.put("I", "**");
        translator.put("J", "*---");
        translator.put("K", "-*-");
        translator.put("L", "*-**");
        translator.put("M", "--");
        translator.put("N", "-*");
        translator.put("O", "---");
        translator.put("P", "*--*");
        translator.put("Q", "--*-");
        translator.put("R", "*-*");
        translator.put("S", "***");
        translator.put("T", "-");
        translator.put("U", "**-");
        translator.put("V", "***-");
        translator.put("W", "*--");
        translator.put("X", "-**-");
        translator.put("Y", "-*--");
        translator.put("Z", "--**");
        translator.put("0", "-----");
        translator.put("1", "*----");
        translator.put("2", "**---");
        translator.put("3", "***--");
        translator.put("4", "****-");
        translator.put("5", "*****");
        translator.put("6", "-****");
        translator.put("7", "--***");
        translator.put("8", "---**");
        translator.put("9", "----*");
        translator.put(".", "*-*-*-");
        translator.put(",", "--**--");
        translator.put("?", "**--**");
        translator.put("*-", "A");
        translator.put("-***", "B");
        translator.put("-*-*", "C");
        translator.put("-**", "D");
        translator.put("*", "E");
        translator.put("**-*", "F");
        translator.put("--*", "G");
        translator.put("****", "H");
        translator.put("**", "I");
        translator.put("*---", "J");
        translator.put("-*-", "K");
        translator.put("*-**", "L");
        translator.put("--", "M");
        translator.put("-*", "N");
        translator.put("---", "O");
        translator.put("*--*", "P");
        translator.put("--*-", "Q");
        translator.put("*-*", "R");
        translator.put("***", "S");
        translator.put("-", "T");
        translator.put("**-", "U");
        translator.put("***-", "V");
        translator.put("*--", "W");
        translator.put("-**-", "X");
        translator.put("-*--", "Y");
        translator.put("--**", "Z");
        translator.put("-----", "0");
        translator.put("*----", "1");
        translator.put("**---", "2");
        translator.put("***--", "3");
        translator.put("****-", "4");
        translator.put("*****", "5");
        translator.put("-****", "6");
        translator.put("--***", "7");
        translator.put("---**", "8");
        translator.put("----*", "9");
        translator.put("*-*-*-", ".");
        translator.put("--**--", ",");
        translator.put("**--**", "?");
        //translator.put(" ", " ");
    }

    //Method returns String in uppercase
    public String changeToUpperCase(String inData) {
        return inData.toUpperCase();
    }

    //Method turns String into Array, by splitting spaces (" ")
    public String[] textSplit(String inData) {
        String[] textArray = inData.split(" ");
        return textArray;
    }

    //Method checks if a character is valid (contained in translator)
    public boolean checkValidInput(String inData) {
        boolean isValid = translator.containsKey(inData);
        return isValid;
    }

    //Method returns a translated character from English or Morse
    public String translation(String inData) {
        return translator.get(inData);
    }

    //Method returns true if the input character is Morse
    public boolean identifyMorse(String character){
        //If the character starts with * or -, it is Morse
        if(character.startsWith("*") || character.startsWith("-")){
            return true;
        }
        else{
            return false;
        }
    }


    public String runLogic (String inData) {
        //Create output String that will be printed
        String output = "";

        //Make all characters uppercase
        inData = changeToUpperCase(inData);

        //Split input and convert to array
        //English will be split into words
        //Morse will be split into characters
        String[] inDataArray = textSplit(inData);

        //Loop the array of words or characters
        for (int i = 0; i < inDataArray.length; i++) {
            //Declare the element (word or character)
            String elementString = inDataArray[i];

            //Loop the element
            for (int j = 0; j < elementString.length(); j++) {
                //Declare translated String, to be built
                String translatedElement = "";
                //Declare character we will translate
                String character = "";
                //Declare translated character
                String translatedCharacter = "";
                //Check if Morse
                if(identifyMorse(elementString)){
                    //If Morse, character is the whole element
                    character = elementString;
                    //Force the loop to end
                    j = elementString.length();
                }
                else{
                    //If English, character is the letter at position J
                    character = String.valueOf(elementString.charAt(j));
                }
                //Check if the character is valid
                if(!checkValidInput(character)){
                    //If character is invalid, return
                    output = character + " is not a valid character.";
                    return output;
                }
                else{
                    //Translate character
                    translatedCharacter = translation(character);
                    //Build the translated word
                    translatedElement += translatedCharacter;
                }
                //Build the translated output String
                output = output + " " + translatedElement;
            }
        }
        //Return output String
        return output.strip();
    }
}