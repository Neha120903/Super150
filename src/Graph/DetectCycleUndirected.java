package Graph;

import java.util.*;

public class DetectCycleUndirected {
    private HashMap<Integer, HashMap<Integer,Integer>> map = new HashMap<>();
    public DetectCycleUndirected(int v){
        for (int i = 1; i <=v ; i++) {
            map.put(i,new HashMap<>());
        }
    }
    public void AddEdge(int v1, int v2, int cost)
    {
        map.get(v1).put(v2,cost);  //v1-->v2
        map.get(v2).put(v1,cost);  //v2-->v1
    }

    class Pair{
        int vertex;
        int parent;
        Pair(int vertex, int parent)
        {
            this.vertex=vertex;
            this.parent=parent;
        }
    }

    public  boolean hasCycle()
    {
        Queue<Pair> q= new LinkedList<>();
        HashSet<Integer> visited= new HashSet<>();
        q.add(new Pair(1,-1));
        while(!q.isEmpty())
        {
            Pair rv=q.poll();
            if(visited.contains(rv.vertex))
                continue;
            visited.add(rv.vertex);
            for(int nbr:map.get(rv.vertex).keySet())
            {
                if(!visited.contains(nbr))
                {
                    q.add(new Pair(nbr,rv.vertex));
                }
                else if(visited.contains(nbr) && nbr!= rv.parent)
                    return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        DetectCycleUndirected g = new DetectCycleUndirected(7);

        g.AddEdge(1, 4, 6);
        g.AddEdge(1, 2, 10);
        g.AddEdge(2, 3, 7);
        g.AddEdge(3, 4, 5);
        g.AddEdge(4, 5, 1);
        g.AddEdge(5, 6, 4);
        g.AddEdge(7, 5, 2);
        g.AddEdge(6, 7, 3);
        System.out.println(g.hasCycle());

    }
}
