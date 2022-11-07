package inUppgift;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class myTextLogic {

    private int rows;
    private int words;
    private int chars;
    private String longestWord;
    private String inputText;

    public myTextLogic(){
    rows = 0;
    words = 0;
    chars = 0;
    longestWord = "";
    inputText = "";
    }
   /* Boolean is true when input text is stop
   * */
    public boolean checkStop(String text){
        if (text.equalsIgnoreCase("stop")){
            return true;
        }
        else{
            return false;
        }
    }
    /* First the method checks if text is "stop", otherwise it adds
    * the string length to chars.*/
    public void setTextChar(String text) {
        if(!checkStop(text)) {
            chars += text.length();
        }
    }
    public int getTextChar() {

        return chars;
    }
    /* Checks "stop", separates words by space, and appends to words*/
    public void setAmountOfWords(String text) {
        if(!checkStop(text)) {
            String[] textWords = text.split(" ");
            words += textWords.length;
        }
    }
    public int getAmountOfWords() {
        return words;
    }
    /* Checks "stop", adds a new row. */
    public void setTextRows(String text) {
        if(!checkStop(text)) {
            rows++;
        }
    }
    public int getTextRows(){
        return rows;
    }
    /* Separates words by space and gets the longest word
     by comparing them. Checks "stop" and changes
     the longestWord attribute. */
    public void setLongestWord(String text) {
        String longest = Arrays.stream(text.split(" "))
                .max(Comparator.comparingInt(String::length))
                .orElse(null);
        if(!checkStop(longest)){
            if(longest.length() > longestWord.length()){
                longestWord = longest;
        }
        }
    }
    public String getLongestWord() {
        return longestWord;
    }

    public void setInputText(String text){
        inputText = text;
    }
    public String getInputText(){
        return inputText;
    }
    /* This method takes myTextLogic object,
    * appends all input information from all scans,
    * and returns the same object when the user has written "stop". */
    public myTextLogic runUntilStop(myTextLogic inputTracker) {
        Scanner scan = new Scanner(System.in);

        while (!(checkStop(inputTracker.getInputText()))) {
            String inText = scan.nextLine();
            inputTracker.setInputText(inText);
            inputTracker.setTextRows(inText);
            inputTracker.setTextChar(inText);
            inputTracker.setAmountOfWords(inText);
            inputTracker.setLongestWord(inText);
        }
        return inputTracker;
    }
}







