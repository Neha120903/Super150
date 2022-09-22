package Array;

public class Array_Demo
{
    public static void main(String[] args) {
        int[] arr = new int[2]; //store in heap because it is non-primitive data type  arr variable is store with its address in stack
        System.out.println(arr);
        //base address+type size*index => getting the address to be updated
        arr[1] = 4;

        int a[] = new int[5] , b=10 ; //c type declaration here b is integer type value
        int arr1[] = {5,3,2,4,1,7};
       // Swap(arr1,0,1);
       // System.out.println(arr1[0]+" "+arr1[1]);

        int other[] = {-5,-3,7,8,9};
        Swap1(arr1,other);
        System.out.println(arr1[0]+" "+other[0]);

    }
    public static void Swap(int[] arr1, int i , int j)    //changes are occured at location thats why the arr1 is updated
    {
        int temp = arr1[i];
        arr1[i] = arr1[j];
        arr1[j] = temp;
    }

    public static void Swap1(int[] arr1, int[] other)    //changes not occured this is example of java is a call by value
    {
        int temp[] = arr1;
        arr1 = other;
        other= temp;
    }

}
