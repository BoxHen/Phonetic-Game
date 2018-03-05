import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.io.*;

public class Game {
    private char[] alpha;
    private char randAlpha;
    private char[] upperAndLower;
    private long elapsedTime;
    private String[] randomStrings;
    private String randomStringWord;
    private String strUpper;
    private String strLower;

    public void readyGame(){ // wait for user to press key to start
        System.out.println("Press the Enter key to start the game");
        try
        {
            System.in.read();
        }
        catch(Exception e)
        {}
    }

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
        //System.out.println(randAlpha);
        this.randAlpha = randAlpha;
    }

    public void randomWord(int numberOfWords, char array[])
    {
        String[] randomStrings = new String[numberOfWords];
        Random random = new Random();
        for(int i = 0; i < numberOfWords; i++)
        {
            char[] word = new char[random.nextInt(8)+3]; // words of length 3 through 10. (1 and 2 letter words are boring.)
            for(int j = 0; j < word.length; j++)
            {
                randomAlphabet(array);
                word[j] = getRandAlpha();
                //word[j] = (char)('a' + random.nextInt(26));
            }
            randomStrings[i] = new String(word);
        }
        this.randomStrings = randomStrings;
    }

    public void readFile(){
        Random random = new Random();
        try{ // might not be needed delim
            BufferedReader inFile1 = new BufferedReader(new FileReader("Dictionary.txt"));
            List<String> temps = new ArrayList<String>();

            String line;
            while((line = inFile1.readLine()) != null) { // while there is more in the file to read from
                temps.add(line);
            }
            inFile1.close();
            String[] wordArray = temps.toArray(new String[0]); // convert the array list to an array
            //NOTE: new String[0] is needed for types cast into string
            this.randomStringWord = wordArray[random.nextInt((wordArray.length)+1)];
        } catch (IOException e){
            System.out.println("exception thrown");
        }

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
        this.strLower = strLower; // used for word game
        this.strUpper = strUpper;
        this.upperAndLower = upperAndLower; // used for letter game
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

    public String[] getRandomStrings() { return randomStrings; }

    public String getRandomStringWord() { return randomStringWord; }

    public String getStrUpper() { return strUpper; }

    public String getStrLower() { return strLower; }

    public long getElapsedTime() {
        return elapsedTime;
    }

/*------------------------------------------------------------------------------------------------------------*/
}
