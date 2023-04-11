package Graph;

import java.util.*;

public class TopologicalSort {
    HashMap<Integer,HashMap<Integer,Integer>> map = new HashMap<>();
    public TopologicalSort(int v){
        for (int i = 0; i < v; i++) {
            map.put(i, new HashMap<>());
        }
    }
    public void addEdge(int v1, int v2)
    {
        map.get(v1).put(v2,0);
    }

    public void TopologicalSort(){
        Queue<Integer> q= new LinkedList<>();
        int []ind= indegree();
        for (int i = 1; i <ind.length ; i++) {
            if(ind[i]==0)
                q.add(i);
        }
        while(!q.isEmpty())
        {
            int front=q.poll();
            System.out.println(front);
            for (int nbr : map.get(front).keySet()) {
                ind[nbr]--;
                if(ind[nbr]==0)
                    q.add(nbr);
            }
        }
    }

    public int[] indegree(){
        int arr[]= new int[map.size()+1];
        for (int key: map.keySet())
        {
            for(int nbr: map.get(key).keySet())
            {
                arr[nbr]++;
            }
        }
        return arr;
    }

    //cycle in directed graph using topological sort

    public boolean isCycle(){
        Queue<Integer> q= new LinkedList<>();
        int []ind= indegree();
        for (int i = 1; i <ind.length ; i++) {
            if(ind[i]==0)
                q.add(i);
        }
        int c=0;
        while(!q.isEmpty())
        {
            int front=q.poll();
           // System.out.println(front);
            c++;
            for (int nbr : map.get(front).keySet()) {
                ind[nbr]--;
                if(ind[nbr]==0)
                    q.add(nbr);
            }
        }
        return c!=map.size();
    }
}
