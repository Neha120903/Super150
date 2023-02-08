package ThreeHundred;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class RemoveLL {
    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<>();
        l.add(1);
        l.add(2);
        l.add(2);
        l.add(3);
        l.add(2);
        l.add(4);
        HashMap<Integer,Integer> mp = new HashMap<>();
        for (int i = 0; i < l.size(); i++) {
            mp.put(l.get(i), mp.getOrDefault(l.get(i),0)+1);
        }
        LinkedList<Integer> ans = new LinkedList<>();
        for(Map.Entry<Integer,Integer> e:mp.entrySet())
        {
            if(e.getValue() <=1)
                ans.add(e.getKey());
        }
        for (int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i));
        }
    }
}
