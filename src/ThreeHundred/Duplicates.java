package ThreeHundred;

import java.util.HashMap;
import java.util.Map;

public class Duplicates {
    public static void main(String[] args) {
        int arr[]={1,1,1,2,2,2,2,3,3,4};
        HashMap<Integer,Integer> m = new HashMap<>();
        for(int i:arr)
            m.put(i,m.getOrDefault(i,0)+1);
        //System.out.println(m);
        int i=0;
        for(Map.Entry<Integer,Integer> e:m.entrySet())
        {

            if(e.getValue() >=2)
            {
                for (int j = 0; j <2 ; j++) {
                    arr[i++] = e.getKey();
                    //System.out.println(arr[i]);
                }
            }
            else
                arr[i++]=e.getKey();
        }
        for (int j = 0; j <arr.length; j++) {
          System.out.println(arr[j]);
       }
    }
}
