package BackTracking;

public class NQueen {
    public static void main(String[] args) {
        int n=4;
        boolean [][] board = new boolean[n][n];
        QueenP(board,n,0);


    }

    public static void QueenP(boolean[][]board, int tq, int row)
    {
        if(tq==0)
        {
            Display(board);
            return;
        }
        for (int col = 0; col< board.length; col++) {
            if(isSafe(board,row,col) == true)
            {
                board[row][col]=true;
                QueenP(board,tq-1,row+1);
                board[row][col] =false;
            }
        }
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        int r=row;
        //vertical
        while (r>=0)
        {
            if (board[r][col] == true)
            {
                return false;
            }
            r--;
        }

        //left diagonal
        r=row;
        int c=col;
        while (r>=0 && c>=0)
        {
            if(board[r][c] == true)
                return false;
            r--;c--;
        }

        //right diagonal
        r=row;
        c=col;
        while (r>=0 && c< board.length)
        {
            if(board[r][c] == true)
                return false;
            r--;c++;
        }


        return false;
    }

    public static void Display(boolean[][]board)
    {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
}
