public class GuessRealWord {
    public void WordGuessReal(int numGames){
        char[] alpha = new char[26];
        String randWord;
        String strUpper;
        String strLower;
        long elapsedTime;

        Game wordGameReal = new Game();
        wordGameReal.readyGame();

        for (int i = 0; i < numGames; i++) { // Does specified rounds of game
            wordGameReal.readFile(); // gets word from dictionary (attached txt file)
            randWord = wordGameReal.getRandomStringWord();
            System.out.println(randWord);

            wordGameReal.userInput();
            strLower = wordGameReal.getStrLower();
            strUpper = wordGameReal.getStrUpper();
            //System.out.println(strLower); System.out.println(strUpper);
            elapsedTime = wordGameReal.getElapsedTime();
            if (elapsedTime >= 10000) { // waits for specified time in ms (1000ms = 1s)
                System.out.println("TOO SLOW!!! You answered in: " + elapsedTime / 1000 + " seconds\n");
            } else if (strLower.equals(randWord) || strUpper.equals(randWord)) {
                // NOTE: have to use .equals instead of  == since == will see if it refers to the same object and not the same value
                System.out.println("CORRECT! You answered in: " + elapsedTime / 1000 + " seconds\n");
            } else {
                LevenshteinDistance correction = new LevenshteinDistance(); SoundEx correctionImproved = new SoundEx();

                correction.LD(strLower, randWord);
                correctionImproved.Encode(strLower);
                String c1 = correctionImproved.getCode();

                correctionImproved.Encode(randWord);
                String c2 = correctionImproved.getCode();

                if(correction.getFinalCost() <= 1 || c1.equals(c2)){ // if you are one letter off
                    System.out.println("Did you mean: " + randWord + "\n");
                }else{
                    System.out.println("WRONG! \n");
                }
            }
        }
    }
}
