import java.util.Random;
import java.util.Scanner;

public class Main {
    private static final int numGames = 5; // determines number of games
    public static void printAlpha(char alpha[]) {
        int index = 0;
        for (char alphabets = 'A'; alphabets <= 'Z'; alphabets++) {
            alpha[index++] = alphabets;
            }
        }

    public static char randomAlphabet(char alpha[]){
        Random randNum = new Random(); //random() method returns a random number between 0.0 and 0.9999
        int R = randNum.nextInt(26);
        /*Returns a pseudorandom, uniformly distributed int value between 0
        (inclusive) and the specified value (exclusive), drawn from this random number generator's sequence.*/
        char randAlpha = alpha[R]; // chooses a random letter
        System.out.println(randAlpha);
        return randAlpha; // this randAlpha is local to function
    }

    public static char[] userInput(){
        Scanner Reading = new Scanner(System.in);//reading from input
        System.out.println("What was the letter?");
        String strUpper = Reading.nextLine();
        String strLower = strUpper.toUpperCase(); // allows for lower and upper case
        char genAlphaUpper = strUpper.charAt(0); char genAlphaLower = strLower.charAt(0); // since input is read as string, I convert these to characters
        char[] upperAndLower = {genAlphaUpper, genAlphaLower};
        return upperAndLower;
    }

    public static void main(String[] args) {
        char alpha[] = new char[26]; // can also write char[] alpha

        printAlpha(alpha);

        for(int i = 0; i <= numGames; i++){ // Does five rounds of game
            char randAlpha = randomAlphabet(alpha);
            char[] upperAndLower = userInput(); // index 0 contains upper AND index 1 contains lower case
            if(upperAndLower[0] == randAlpha || upperAndLower[1] == randAlpha){
                System.out.println("CORRECT\n");
            }
            else {
                System.out.println("WRONG! The correct choice is: " + randAlpha + "\n");
            }
        }

    } // end main
} // end main class
