package inUppgift;

public class myTextMain {
    public static void main(String[] args) {

        System.out.println("Write a text and type stop if you want to end the program:");

        /* Creates a new myTextLogic object called inputTracker. */
        myTextLogic inputTracker = new myTextLogic();
        /* Runs the method runUntilStop with the inputTracker. */
        inputTracker.runUntilStop(inputTracker);
        /* Prints out the inputTracker updated information. */
        System.out.println("Number of rows: " + inputTracker.getTextRows() +
                "\n" + "Number of words: " + inputTracker.getAmountOfWords() +
                "\n" + "Number of characters: " + inputTracker.getTextChar() +
                "\n" + "Longest word: " + inputTracker.getLongestWord());
    }
}
