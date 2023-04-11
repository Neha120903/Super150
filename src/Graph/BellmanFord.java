package Graph;

import java.util.*;

//agr kisi graph m negative weight h to vo bf s hoga
//but agr kisi graph m cycle h or negative weight arha h total m
//to ese graph ko hm kisi s nhi kr skte
//undirected graph m negative weight ana hi mtlb cycle h
public class BellmanFord {

    private HashMap<Integer, HashMap<Integer,Integer>> map = new HashMap<>();
    public BellmanFord(int v){
        for (int i = 1; i <=v ; i++) {
            map.put(i,new HashMap<>());
        }
    }
    public void AddEdge(int v1, int v2, int cost)
    {
        map.get(v1).put(v2,cost);  //v1-->v1
    }

    public class EdgePair{
        int e1;
        int e2;
        int cost;

        public EdgePair(int e1, int e2, int cost){
            this.e1=e1;
            this.e2=e2;
            this.cost=cost;
        }
        public String toString(){
            return e1+" - "+e2+" @ "+cost;
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

    public void Bellmanford(){
        int v= map.size();
        int []ds= new int[v+1];

        for (int i = 2; i <=v ; i++) {
            ds[i]=100000000; //integer max value will get overflow bcz we are adding the value
        }
        ArrayList<EdgePair> list = getAllEdge();
        for (int i = 1; i <v ; i++) {   // why wwe relax all v-1 vertex
            for (EdgePair eg: list) //
            {
                int e1=eg.e1;
                int e2=eg.e2;
                int oldcost =ds[e2];
                int newcost=eg.cost + ds[e1];
                if(i==v && newcost <oldcost) {
                    System.out.println("-ve weight cycle");
                    return;
                }
                if(oldcost > newcost)
                    ds[e2]=newcost;

            }
        }
        for (int i=1;i< ds.length;i++)
        {
            System.out.println(ds[i]);
        }
    }
}
