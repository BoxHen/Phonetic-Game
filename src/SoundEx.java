public class SoundEx {
    private char[] x;
    private char firstLetter;

    public void Encode(String s){
        this.x = s.toUpperCase().toCharArray();
        this.firstLetter = this.x[0];

        for(int i=1; i<=this.x.length; i++) {
            switch (this.x[i]) {
                case 'B':
                case 'F':
                case 'P':
                case 'V':
                    this.x[i]=1;
                    break;
                case 'C':
                case 'G':
                case 'J':
                case 'K':
                case 'Q':
                case 'S':
                case 'X':
                case 'Z':
                    this.x[i] = 2;
                    break;
                case 'D':
                case 'T':
                    this.x[i] = 3;
                    break;
                case 'L':
                    this.x[i] = 4;
                    break;
                case 'M':
                case 'N':
                    this.x[i] = 5;
                    break;
                case 'R':
                    this.x[i] = 6;
                    break;
                default:
                    this.x[i] = 0; // contains 'A', E', 'I', 'O', 'U', 'H', 'W', 'Y'
                    break;
            }
            /*Capitalize all letters in the word and drop all punctuation marks. Pad the word with rightmost blanks as needed during each procedure step.
            Retain the first letter of the word.
            Change all occurrence of the following letters to '0' (zero):
              'A', E', 'I', 'O', 'U', 'H', 'W', 'Y'.
            Change letters from the following sets into the digit given:
            1 = 'B', 'F', 'P', 'V'
            2 = 'C', 'G', 'J', 'K', 'Q', 'S', 'X', 'Z'
            3 = 'D','T'
            4 = 'L'
            5 = 'M','N'
            6 = 'R'
            Remove all pairs of digits which occur beside each other from the string that resulted after step (4).
            Remove all zeros from the string that results from step 5.0 (placed there in step 3)
            Pad the string that resulted from step (6) with trailing zeros and return only the first four positions, which will be of the form <uppercase letter> <digit> <digit> <digit>.*/
        }
    }
}
