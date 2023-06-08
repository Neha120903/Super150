package DynamicProgramming;

public class DungeonGame {
    public static void main(String[] args) {


    }
    public int solve(int[][]arr,int cr,int cc)
    {
        if(cr==arr.length || cc==arr[0].length)
            return Integer.MAX_VALUE;
        if(cr==arr.length-1 && cc==arr[0].length-1)
            return arr[cr][cc]>0?1:1-arr[cr][cc];
        int r=solve(arr,cr,cc+1);
        int c=solve(arr,cr+1,cc);
        int hp=Math.min(r,c)-arr[cr][cc];
        return hp>0?hp:1;
    }
}
