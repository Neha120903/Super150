package Graph;

import com.sun.javafx.geom.Edge;

import java.util.*;

public class KruskalAlgo {
    private HashMap<Integer, HashMap<Integer,Integer>> map = new HashMap<>();
    public KruskalAlgo(int v){
        for (int i = 1; i <=v ; i++) {
            map.put(i,new HashMap<>());
        }
    }
    public void AddEdge(int v1, int v2, int cost)
    {
        map.get(v1).put(v2,cost);  //v1-->v2
        map.get(v2).put(v1,cost);  //v2-->v1
    }

    public class EdgePair{
        int e1;
        int e2;
        int cost;
        public EdgePair(int e1, int e2, int cost)
        {
            this.e1=e1;
            this.e2=e2;
            this.cost=cost;
        }
    }
    public ArrayList<EdgePair> getAllEdge(){
        ArrayList<EdgePair> a= new ArrayList<>();
        for(int e1: map.keySet())
        {
            for(int e2: map.get(e1).keySet())
            {
                EdgePair e= new EdgePair(e1,e2,map.get(e1).get(e2));
                a.add(e);
            }
        }
        return a;
    }
    public void KruskalAlgo(){
        DisjointSet ds= new DisjointSet();
        int ans=0; //sum of mst
        for(int k: map.keySet())
        {
            ds.createSet(k);
        }

        ArrayList<EdgePair> al = getAllEdge();
        Collections.sort(al, new Comparator<EdgePair>() {
            @Override
            public int compare(EdgePair o1, EdgePair o2) {
                return o1.cost-o2.cost;
            }
        });
        for(EdgePair edge:al)
        {
            int e1=edge.e1;
            int e2=edge.e2;
            int re1= ds.find(e1);
            int re2=ds.find(e2);
            if(re1==re2)
            {
                //nothing bcz of duplicate
            }
            else
            {
                ans+=edge.cost;
                ds.union(re1,re2);
            }
        }
    }
}
