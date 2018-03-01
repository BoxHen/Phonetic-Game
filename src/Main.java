public class Main {
    private static final int numGames = 5; // determines number of games

    public static void main(String[] args) {
        char alpha[] = new char[26]; // can also write char[] alpha
        char randAlpha;
        char[] upperAndLower;

        Game phoneticGame = new Game();

        for(int i = 0; i <= numGames; i++){ // Does five rounds of game
            phoneticGame.printAlpha(alpha);
            alpha = phoneticGame.getAlpha();

            phoneticGame.randomAlphabet(alpha);
            randAlpha = phoneticGame.getRandAlpha();

            phoneticGame.userInput();
            upperAndLower = phoneticGame.getUpperAndLower();
            if(upperAndLower[0] == randAlpha || upperAndLower[1] == randAlpha){
                System.out.println("CORRECT\n");
            }
            else {
                System.out.println("WRONG! The correct choice is: " + randAlpha + "\n");
            }
        }

    } // end main
} // end main class
