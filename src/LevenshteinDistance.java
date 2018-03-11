public class LevenshteinDistance {
    private int min;
    private int finalCost;

    public void Minimum (int a, int b, int c){ // find min between left, top, and diagonal(top-left)
        int min = a;
        if (b < min) {
            min = b;
        }else if (c < min) {
            min = c;
        }
        this.min = min;
    }

    public void LD (String s, String t){
        int n, m; // length of s and t respectively
        int i, j; // iterates through s and t respectively
        char s_i, t_j; // ith character of s AND jth character of t
        int cost; // cost

        n = s.length();
        m = t.length();
        if (n == 0) {
            this.finalCost = m;
        } // if string s does not exist then cost of m is needed to replicate the word
        if (m == 0) {
            this.finalCost = n;
        }

        int[][] d = new int[n + 1][m + 1]; // matrix

        for (i = 0; i <= n; i++) {
            d[i][0] = i;
        } // set up rows based off length of n
        for (j = 0; j <= m; j++) {
            d[0][j] = j;
        } // set up rows based off length of m

        for (i = 1; i <= n; i++) {
            s_i = s.charAt(i - 1);
            for (j = 1; j <= m; j++) {
                t_j = s.charAt(j - 1);

                if (s_i == t_j){
                    cost = 0;
                } else {
                    cost = 1;
                }

                Minimum(d[i - 1][j], d[i - 1][j - 1], d[i][j - 1]);
                // cell is based off of cell above,left,and  diagonally above and to the left
                d[i][j] = (getMin()) + cost;
            }
        }
        this.finalCost = d[n][m];
    }
/*----------------------------------------GETTERS--------------------------------------------*/
    public int getMin() {return min;}
    public int getFinalCost() {return finalCost;}
}
