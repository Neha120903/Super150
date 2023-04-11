package Graph;

import java.util.*;

public class DijkstraAlgo {
    private HashMap<Integer, HashMap<Integer,Integer>> map = new HashMap<>();
    public DijkstraAlgo(int v){
        for (int i = 1; i <=v ; i++) {
            map.put(i,new HashMap<>());
        }
    }
    public void AddEdge(int v1, int v2, int cost)
    {
        map.get(v1).put(v2,cost);  //v1-->v2
        map.get(v2).put(v1,cost);  //v2-->v1
    }
    class DijkstraPair{
        int vtx;
        String acqvtx;
        int cost;
        DijkstraPair(int vtx, String acqvtx,int cost)
        {
            this.vtx=vtx;
            this.acqvtx=acqvtx;
            this.cost=cost;
        }
        @Override
        public String toString(){
            return this.vtx+" via "+this.acqvtx+"@ cost"+this.cost;
        }
    }
    public void Dijkstra(){
        PriorityQueue<DijkstraPair> pq= new PriorityQueue<>(new Comparator<DijkstraPair>() {
            @Override
            public int compare(DijkstraPair o1, DijkstraPair o2) {
                return o1.cost-o2.cost;
            }
        });
        HashSet<Integer> visited= new HashSet<>();
        pq.add(new DijkstraPair(1,"1",0));
        while (!pq.isEmpty())
        {
            DijkstraPair dp= pq.poll();
            if(visited.contains(dp.vtx))
                continue;
            visited.add(dp.vtx);
            System.out.println(dp);
            for(int nbr: map.get(dp.vtx).keySet())
            {
                if(!visited.contains(nbr))
                {
                    int newcost= dp.cost+map.get(dp.vtx).get(nbr);
                    pq.add(new DijkstraPair(nbr,dp.acqvtx+nbr,newcost));
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        DijkstraAlgo g = new DijkstraAlgo(7);

        g.AddEdge(1, 4, 6);
        g.AddEdge(1, 2, 10);
        g.AddEdge(2, 3, 7);
        g.AddEdge(3, 4, 5);
        g.AddEdge(4, 5, 1);
        g.AddEdge(5, 6, 4);
        g.AddEdge(7, 5, 2);
        g.AddEdge(6, 7, 3);
        g.Dijkstra();

    }
}
