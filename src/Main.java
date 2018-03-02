public class Main {
    private static final int numGames = 5; // determines number of games

    public static void main(String[] args) {
        char[] alpha = new char[26];
        char randAlpha;
        char[] upperAndLower;
        long elapsedTime;

        Game phoneticGame = new Game();
        phoneticGame.readyGame();
        phoneticGame.printAlpha(alpha);
        alpha = phoneticGame.getAlpha();

        for(int i = 0; i < numGames; i++){ // Does five rounds of game
            phoneticGame.randomAlphabet(alpha);
            randAlpha = phoneticGame.getRandAlpha();

            phoneticGame.userInput();
            upperAndLower = phoneticGame.getUpperAndLower();
            elapsedTime = phoneticGame.getElapsedTime();
            if(elapsedTime >= 3000){ // waits for specified time in ms (1000ms = 1s)
                System.out.println("TOO SLOW!!! You answered in: " + elapsedTime/1000 + " seconds\n");
            }
            else if(upperAndLower[0] == randAlpha || upperAndLower[1] == randAlpha){
                System.out.println("CORRECT! You answered in: " + elapsedTime/1000 + " seconds\n");
            }
            else {
                System.out.println("WRONG! The correct choice is: " + randAlpha + "\n");
            }
        }

    } // end main
} // end main class
