package BackTracking;

import java.util.Scanner;

public class RatChaseCheese {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        char [][] maze= new char[n][m];
        for (int i = 0; i < n; i++) {
            String s=sc.next();
            for (int j = 0; j < s.length(); j++) {
                maze[i][j] = s.charAt(j);
            }
        }
        int [][]ans = new int[n][m];
        hasPath(maze,0,0,ans);

    }

    public static void hasPath(char[][]maze, int cc, int cr, int [][]ans)
    {
        if(cr==maze.length-1 && cc==maze[0].length-1 && maze[cr][cc]!='X')
        {
            ans[cr][cc] =1;
            for (int i = 0; i < ans.length; i++) {
                for (int j = 0; j < ans[0].length; j++) {
                    System.out.print(ans[i][j]+" ");
                }
                System.out.println();
            }
            return;
        }
        if (cr<0 || cc<0 || cr>=maze.length || cc>=maze[0].length|| maze[cr][cc]=='X')
        {
            return;
        }
        maze[cr][cc] ='X';
        ans[cr][cc] =1;
        hasPath(maze,cc,cr-1,ans);//up
        hasPath(maze,cc,cr+1,ans);//down
        hasPath(maze,cc-1,cr,ans);//left
        hasPath(maze, cc+1, cr,ans);//right
        maze[cr][cc]='O';
        ans[cr][cc] =0;
    }
}
