package morseCode;

import java.util.ArrayList;
import java.util.Scanner;

public class MorseMain {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        MorseLogic logic = new MorseLogic();
        System.out.println("Write something in English or in Morse Code and get it translated:");

        String userInput = scan.nextLine();
        String output = logic.runLogic(userInput);

        System.out.println(output);
    }
}