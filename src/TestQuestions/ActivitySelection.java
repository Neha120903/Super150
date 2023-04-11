package TestQuestions;

import sun.reflect.generics.tree.ArrayTypeSignature;

import java.util.*;
class Pair{
    int start;
    int finish;

    public Pair(int start, int finish)
    {
        this.start=start;
        this.finish=finish;
    }


}
public class ActivitySelection {

    public static void main(String[] args) {
        Pair []arr= new Pair[7];
        arr[0] = new Pair(8,9);
        arr[1] = new Pair(9,11);
        arr[2] = new Pair(9,10);
        arr[3] = new Pair(12,14);
        arr[4] = new Pair(11,12);
        arr[5] = new Pair(12,14);
        arr[6] = new Pair(14,15);
        Arrays.sort(arr, new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                return o1.finish- o2.finish;
            }
        });
        System.out.print(countActivity(arr));
    }

    public static int countActivity(Pair[]arr)
    {
        int c=1;
        int m=0;
        for(int i=1;i<arr.length;i++ )
        {
            if(arr[i].start >= arr[m].finish)
            {
                c++;
                m=i;
            }
        }
        return c;
    }


}
