import java.util.Random;
import java.util.Scanner;

public class Game {
    private char[] alpha;
    private char randAlpha;
    private char[] upperAndLower;
    private long elapsedTime;

    public void printAlpha(char array[]) {
        int index = 0;
        for (char alphabets = 'A'; alphabets <= 'Z'; alphabets++) {
            array[index++] = alphabets;
        }
        this.alpha = array;
    }

    public void randomAlphabet(char array[]){
        Random randNum = new Random(); //random() method returns a random number between 0.0 and 0.9999
        int R = randNum.nextInt(26);
        /*Returns a pseudorandom, uniformly distributed int value between 0
        (inclusive) and the specified value (exclusive), drawn from this random number generator's sequence.*/
        char randAlpha = array[R]; // chooses a random letter
        System.out.println(randAlpha);
        this.randAlpha = randAlpha;

    }

    public void userInput(){
        Scanner Reading = new Scanner(System.in);//reading from input
        System.out.println("What was the letter?");
        long startTime = System.currentTimeMillis();
        String strUpper = Reading.nextLine(); // waits for user input
        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;

        String strLower = strUpper.toUpperCase(); // allows for lower and upper case
        char genAlphaUpper = strUpper.charAt(0); char genAlphaLower = strLower.charAt(0); // since input is read as string, I convert these to characters
        char[] upperAndLower = {genAlphaUpper, genAlphaLower};
        this.upperAndLower = upperAndLower;
        this.elapsedTime = elapsedTime;
    }
    /*----------------------------------------------Getters-------------------------------------------------------*/
    public char[] getAlpha() {
        return alpha;
    }

    public char getRandAlpha() {
        return randAlpha;
    }

    public char[] getUpperAndLower() {
        return upperAndLower;
    }

    public long getElapsedTime() {
        return elapsedTime;
    }

/*------------------------------------------------------------------------------------------------------------*/
}
