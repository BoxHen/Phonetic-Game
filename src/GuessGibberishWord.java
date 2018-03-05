public class GuessGibberishWord {
    public void WordGuessGib(int numGames){
        char[] alpha = new char[26];
        String[] randWord;
        String strUpper;
        String strLower;
        long elapsedTime;

        Game wordGame = new Game();
        wordGame.readyGame();
        wordGame.printAlpha(alpha);
        alpha = wordGame.getAlpha(); // gets the alphabet

        for (int i = 0; i < numGames; i++) { // Does specified rounds of game
            wordGame.randomWord(1, alpha);
            randWord = wordGame.getRandomStrings();
            System.out.println(randWord[0]);

            wordGame.userInput();
            strLower = wordGame.getStrLower();
            strUpper = wordGame.getStrUpper();
            System.out.println(strLower); System.out.println(strUpper); // delete later
            elapsedTime = wordGame.getElapsedTime();
            if (elapsedTime >= 10000) {
                System.out.println("TOO SLOW!!! You answered in: " + elapsedTime / 1000 + " seconds\n");
                } else if (strLower.equals(randWord[0]) || strUpper.equals(randWord[0])) {
                // NOTE: have to use .equals instead of  == since == will see if it refers to the same object and not the same value
                System.out.println("CORRECT! You answered in: " + elapsedTime / 1000 + " seconds\n");
            } else {
                System.out.println("WRONG! The correct choice is: " + randWord[0] + "\n");
            }
        }
    }
}
