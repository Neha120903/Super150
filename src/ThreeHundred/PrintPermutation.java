package ThreeHundred;
import java.sql.Array;
import java.util.*;
public class PrintPermutation {
    public static void main(String[] args) {
        int arr[]={1,2,3};
        boolean f[]= new boolean[arr.length];
        List<Integer>al = new ArrayList<>();
        revur(arr,al,f);
       // generate(arr,0);
    }


    /***** BRUTE FORCE ******/


    public static void revur(int []arr, List<Integer> al,boolean f[])
    {
        if(al.size()==arr.length)
        {
            for (int i = 0; i <al.size() ; i++) {
                System.out.print(al.get(i));
            }
            System.out.println();
            return;
        }

        for (int i = 0; i <arr.length ; i++) {
            if(f[i]==false)
            {
                al.add(arr[i]);
                f[i]=true;
                revur(arr,al,f);
                al.remove(al.size()-1);
                f[i]=false;
            }
        }
    }
    public static void generate(int []arr,int i)
    {
        if(i==arr.length)
        {
            for (int j = 0; j <arr.length ; j++) {
                System.out.print(arr[j]+" ");  //bcz here the values are being swapped
            }
            System.out.println();
            return;
        }
        //ans+=arr[i];
        for (int j = i; j < arr.length ; j++) {
            swap(i, j, arr);
            generate(arr, i+1);
            swap(j, i, arr);
        }
    }

    public static void swap(int i, int j, int []arr)
    {
        int t=arr[i];
        arr[i]=arr[j];
        arr[j]=t;
    }
}
