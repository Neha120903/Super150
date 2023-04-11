package Graph;
//MST K LIYE graph ka connected hona jaruri h
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;

public class Prims {
    private HashMap<Integer, HashMap<Integer,Integer>> map = new HashMap<>();
    public Prims(int v){
        for (int i = 1; i <=v ; i++) {
            map.put(i,new HashMap<>());
        }
    }
    public void AddEdge(int v1, int v2, int cost)
    {
        map.get(v1).put(v2,cost);  //v1-->v2
        map.get(v2).put(v1,cost);  //v2-->v1
    }

    public class PrimsPair{
        int vt;
        int acvtx;
        int cost;
        PrimsPair(int vt, int acvtx, int cost)
        {
            this.vt=vt;
            this.acvtx=acvtx;
            this.cost=cost;
        }
        public String toString(){
            return this.vt+" "+this.acvtx+"@"+this.cost;
        }
    }
    public void PrimsAlgo(){
        int ans=0;//total cost
        PriorityQueue<PrimsPair> p= new PriorityQueue<>(new Comparator<PrimsPair>() {
            @Override
            public int compare(PrimsPair o1, PrimsPair o2) {
                return o1.cost-o2.cost;
            }
        });
        HashSet<Integer> visited= new HashSet<>();
        p.add(new PrimsPair(1,1,0));
        while(!p.isEmpty())
        {
            //remove
            PrimsPair pp=p.remove();
            if(visited.contains(pp.vt))
                continue;
            visited.add(pp.vt);
            System.out.println(pp);
            ans+=pp.cost;
            for (int nbr:map.get(pp.vt).keySet())
            {
                if(!visited.contains(nbr)) {
                    p.add(new PrimsPair(nbr, pp.vt, map.get(pp.vt).get(nbr)));
                }
            }
        }
    }
}
