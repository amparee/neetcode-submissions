class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character>[] rows = new HashSet[9];
        Set<Character>[] cols = new HashSet[9];
        Set<Character>[] square = new HashSet[9];

        for(int i = 0; i < 9; i++) {
            rows[i] = new HashSet();
            cols[i] = new HashSet();
            square[i] = new HashSet();
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char c = board[i][j];
                if(c == '.') continue;
                
                if(rows[i].contains(c)) return false;
                rows[i].add(c);

                if(cols[j].contains(c)) return false;
                cols[j].add(c);

                int box = (i/3) * 3 + (j/3) ;
                if(square[box].contains(c)) return false;
                square[box].add(c);

            }
        }
        return true;
    }
}
