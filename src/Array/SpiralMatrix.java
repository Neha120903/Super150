package Array;

import java.util.Scanner;

public class SpiralMatrix {
    public static void main(String[] args) {
        int [][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int minr =0;
        int maxr=arr.length-1;
        int minc=0;
        int maxc=arr[0].length-1;
        int count =0;
        int b = arr.length * arr[0].length;
        while (count<b) {
            for (int i = minc; i <= maxc && count <b; i++)
                System.out.print(arr[minr][i] + " ");
            minr++;

            for (int j = minr; j <= maxr && count <b; j++)
                System.out.print(arr[j][maxc]+" ");
            maxc--;

            for (int i = maxc; i >= minc && count <b; i--)
                System.out.print(arr[maxr][i]+" ");
            maxr--;
            for (int j = maxr; j >= minr && count <b; j--)
                System.out.print(arr[j][minc]+" ");
            minc++;

        }
    }
}
