# PROJECT TITLE: Phonetic-Game
A game that will test your reaction time based on how fast you enter the corresponding letter or word that appears on screen

GETTING STARTED:

	simply clone/download the project. The files are located in the src folder.The "Main.java" folder will be where 	you call the games. 
		/*------------------------------runs letter guessing game-------------------------------------*/
       		GuessLetter game1 = new GuessLetter();
        	game1.letterGame(5);

		/*------------------------------runs word guessing game--------------------------------------*/
	        GuessGibberishWord game2 = new GuessGibberishWord();
        	game2.WordGuessGib(5);

		/*------------------------------runs real word guessing game----------------------------------*/
        	GuessRealWord game3 = new GuessRealWord();
       	 	game3.WordGuessReal(2); 

	The corresponding section runs the specific game. simply comment out the ones you do not wish to run. 
	The Main is currently set to run the real word. 
PROJECT VISION:

	Part I: the basics
  		When you start a game, the program shows you a random letter from the alphabet
  		There is a textbox for you to type in the correct phonetic word for that letter, and press enter.
  		if you get it right it goes hooray!and takes you to a new letter
  		if you get it wrong it quickly shows you the correct answer before moving to a new letter
  		when a round is complete it shows your score (you can decide the length of a round).
  
	Part II: test for speed
  		You're not truly trained in the phonetic alphabet until you have instantaneous recall. So don't count an                   answer correct unless the 
  		user types in the correct answer quickly enough. I think I set mine to something like 2-3 seconds or                       something like that.

	Part III: Use real words instead of just letters
  		typing appearing letters is way to easy! The should be improved to show a series of letters. A gibberish                   word is first implemented where 
  		the game displays a random series of letters. Improve upon this to show a coherent series of letters.

	Part IV: Levenshtein distance
  		Typing fast with accuracy can be a hard thing to do. Mistakes are easily made but the game should be able                 to guess what you were trying to write

	Part V: SoundEx
  		Using the Levenshtein distance will pick up on certain words but other words that sound the same but are                   spelled differently will not be registered. 
  		Implement soundEx to improve the functionality of our simple spell check.
	Part VI: Implement GUI and perhaps a speed typing game with the GUI

		Work in Progress...

RUNNING THE PROGRAM:

	on linux:
		gcc -o 
		./
		
	on windows:
		cl

Acknowledgement:

	Used this repo's dictonary to generate random words. It contains ~10,000 most used English words
		https://github.com/first20hours/google-10000-english.git
