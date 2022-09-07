import java.util.Scanner;

public class RotateImage {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};

        int n = arr.length;
        //first find the transpose of the array

        for(int i=0; i<n;i++) {
            for (int j = i; j < n; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        for(int i=0; i<n;i++)
        {
            for(int j=0; j<n/2 ;j++)
            {
                int temp = arr[i][j];
                arr[i][j] = arr[i][n-1-j];
                arr[i][n-1-j] = temp;
            }
        }

        for (int i = 0; i < n; i++) {
            for(int j=0; j<n; j++)
            System.out.print(arr[i][j]+" ");
        }
    }
}
