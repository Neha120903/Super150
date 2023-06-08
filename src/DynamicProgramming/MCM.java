package DynamicProgramming;

public class MCM {
    public static void main(String[] args) {
        int[]arr={4,2,3,5,1};
        System.out.println(mcm(arr,0,arr.length-1));
    }

    public static int mcm(int []arr,int s,int e)
    {
        if(s+1==e)
            return 0;
        int ans=Integer.MAX_VALUE;
        for (int k=s+1;k<e;k++)
        {
            int fs=mcm(arr,s,k);
            int ss=mcm(arr,k,e);
            int rs=arr[s]*arr[k]*arr[e];
            ans=Math.min(ans,fs+ss+rs);
        }
        return ans;
    }
}
