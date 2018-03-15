public class SoundEx {
    private char[] x;
    private char firstLetter;
    private String code;

    public void Encode(String s){
        this.x = s.toUpperCase().toCharArray();
        this.firstLetter = this.x[0];

        for(int i=1; i<this.x.length; i++) {
            switch (this.x[i]) {
                case 'B':
                case 'F':
                case 'P':
                case 'V':
                    this.x[i]='1';
                    break;
                case 'C':
                case 'G':
                case 'J':
                case 'K':
                case 'Q':
                case 'S':
                case 'X':
                case 'Z':
                    this.x[i] = '2';
                    break;
                case 'D':
                case 'T':
                    this.x[i] = '3';
                    break;
                case 'L':
                    this.x[i] = '4';
                    break;
                case 'M':
                case 'N':
                    this.x[i] = '5';
                    break;
                case 'R':
                    this.x[i] = '6';
                    break;
                default:
                    this.x[i] = '0'; // contains 'A', E', 'I', 'O', 'U', 'H', 'W', 'Y'
                    break;
            }
            this.code = "" + this.firstLetter; // added "" since code is a string but firstLetter is char
            for(int j= 1; j<this.x.length; j++){
                if(x[j] != x[j-1] && x[j] != '0'){ // delete repeated number if it occurs consecutively and delete zeros
                    this.code += x[j];
                }
            }
            this.code += "000"; // append 0 in case too short
            this.code = this.code.substring(0,4); // 0 to 4 where 4 is exclusive
        }
    }
/*------------------------------------Getter--------------------------------------*/
    public String getCode() {
        return code;
    }
}
/*reference: http://www.genealogyintime.com/GenealogyResources/Articles/what_is_soundex_and_how_does_soundex_work_page2.html*/
