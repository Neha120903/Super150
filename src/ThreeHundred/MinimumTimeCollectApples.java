package ThreeHundred;
import java.util.*;
//Input: n = 7, edges = [[0,1],[0,2],[1,4],[1,5],[2,3],[2,6]], hasApple = [false,false,true,false,true,true,false]
//        Output: 8
//        Explanation: The figure above represents the given tree where red vertices have an apple. One optimal path to collect
//        all apples is shown by the green arrows.

public class MinimumTimeCollectApples {
    public int minTime(int n, int[][] edges, List<Boolean> hasApple) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        //allocating space for vertices
        for(int i=0;i<n;i++)
            adj.add(new ArrayList<>());

        for(int []edge: edges)
        {
            int u=edge[0];
            int v=edge[1];

            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        boolean visit[] = new boolean[n];
        return dfs(adj,hasApple,visit,0);
    }

    public int dfs(ArrayList<ArrayList<Integer>> adj,List<Boolean> hasApple,boolean []visit, int source)
    {
        visit[source]=true;
        int time=0;

        for(int vertex:adj.get(source))
        {
            if(visit[vertex]==false)
                time+=dfs(adj,hasApple,visit,vertex);
        }

        if(source!=0 &&(hasApple.get(source) || time>0))
            time+=2;
        return time;
    }
}
