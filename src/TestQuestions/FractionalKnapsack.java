package TestQuestions;
import java.util.*;
class Pair1{
    int profit;
    int weight;
    public Pair1(int profit, int weight)
    {
        this.profit=profit;
        this.weight=weight;
    }
}
class newPair{
    int w;
    int p1;
    int p2;
    int p3;

    public newPair(int w,int p1, int p2, int p3)
    {
        this.w=w;
        this.p1=p1;
        this.p2=p2;
        this.p3=p3;
    }
}
public class FractionalKnapsack {
    public static void main(String[] args) {
       Pair1 a[]= new Pair1[5];
//        arr[0]= new Pair1(20,10);
//        arr[1]=new Pair1(30,5);
//        arr[2]=new Pair1(40,20);
//        arr[3]=new Pair1(50,30);
//        arr[4]=new Pair1(60,30);
        newPair arr[]=  new newPair[5];
        arr[0]= new newPair(3,3,2,1);
        arr[1]= new newPair(2,2,2,3);
        arr[2]= new newPair(1,4,2,2);
        arr[3]= new newPair(5,1,3,5);
        arr[4]= new newPair(7,6,2,1);

        for (int i=0;i< arr.length;i++)
        {
            int netProfit=arr[i].p1*1+arr[i].p2*3+arr[i].p3*5;
            a[i]= new Pair1(arr[i].w,netProfit);
        }
        int m=50;
        Arrays.sort(a, new Comparator<Pair1>() {
            @Override
            public int compare(Pair1 o1, Pair1 o2) {
                return (o2.profit/ o2.weight)-(o1.profit/ o1.weight);
            }
        });
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i].profit+" "+arr[i].weight);
//        }
        System.out.println(solve(a,m));
    }

    public static int solve(Pair1[] arr, int capacity)
    {
        float x[]= new float[arr.length];
        int i=0;
        for (i = 0; i < arr.length ; i++) {
            if(arr[i].weight > capacity)
                break;
            if(arr[i].weight <= capacity)
            {
                x[i]= 1.0f;
                capacity-=arr[i].weight;
            }
        }
        if(i<=arr.length)
        {
            x[i]=(float) capacity/arr[i].weight;
        }
        int profit =0;
        for (int j = 0; j <x.length ; j++) {
            //System.out.println(x[j]);
            profit+=x[j]*arr[j].profit;
        }
        return profit;
    }
}
