package BackTracking;

public class Queen_Combination {
    public static void main(String[] args) {
        int n=4;
        int tq=2;
        boolean[] board= new boolean[n];
        printAns(board,tq,0,0,"");
    }
    public static void printAns(boolean[] board, int tq,int index,int qpsf,String ans)
    {
        if(qpsf == tq)
        {
            System.out.println(ans);
            return;
        }
        for (int i = index; i < board.length ; i++) {

            if(board[i] == false)
            {
                board[i] = true;
                printAns(board,tq,i+1,qpsf+1,ans+"b"+i+"q"+qpsf+"  ");

                board[i]=false;
            }


        }
    }
}
