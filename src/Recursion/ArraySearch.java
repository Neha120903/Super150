package Recursion;
public class ArraySearch {
    public static void main(String[] args) {
        int [] arr= {2,3,5,4,1,3,7,3,6};
        int k=3;
        System.out.println(searchK(arr,k,arr.length-1));
    }

    private static int searchK(int[] arr, int k, int i) {
        if(i <0)
            return -1;
        if(arr[i] == k)
            return i;

        return searchK(arr,k,i-1);
    }

}
