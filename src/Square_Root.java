public class Square_Root {
    public static void main(String[] args) {
        int n =25;
        System.out.print(root(n));
    }
    public static int root(int n)
    {
        int low =0;
        int high =n;
        int ans =0;
        int k=2;
        while(low <=high)
        {
            int mid =(low+high)/2;
            if(Math.pow(mid,k) <= n)
            {
                 ans = mid;
                 low = mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return ans;
    }
}
