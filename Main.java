import java.util.Random;
import java.util.Scanner;

public class Main {
    private static void printAlpha(char alpha[]){
        int index = 0;
        for (char alphabets = 'A'; alphabets <= 'Z'; alphabets++) {
            alpha[index++] = alphabets;
        }
    }
    public static void main(String[] args) {
        char alpha[] = new char[26]; // can also write char[] alpha
        printAlpha(alpha);
        /*for(int i=0; i<=25; i++){
            System.out.println(alpha[i]);
        } testing purposes */

        Random randNum = new Random(); //random() method returns a random number between 0.0 and 0.9999
        int R = randNum.nextInt(26);
        /*Returns a pseudorandom, uniformly distributed int value between 0
        (inclusive) and the specified value (exclusive), drawn from this random number generator's sequence.*/
        char randAlpha = alpha[R]; // chooses a random letter
        System.out.println(randAlpha);

        Scanner Reading = new Scanner(System.in);//reading from input
        System.out.println("What was the letter?");
        String str = Reading.nextLine();
        char genAlpha = str.charAt(0);
        if(genAlpha == randAlpha){
            System.out.println("Win");
        }
        else {
            System.out.println("Lose");
        }
    }
}
