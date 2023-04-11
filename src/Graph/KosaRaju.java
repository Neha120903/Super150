package Graph;
/*The first step is to know, from which node we should start the DFS call.
The second step is to make adjacent SCCs unreachable and to limit the DFS traversal in such a way, that in each DFS call, all the nodes of a particular SCC get visited.
The third step is to get the numbers of the SCCs. In this step, we can also store the nodes of each SCC if we want to do so.*/
import java.util.*;

public class KosaRaju {
    HashMap<Integer, HashMap<Integer, Integer>> map = new HashMap<>();

    public KosaRaju(int v) {
        // TODO Auto-generated constructor stub
        for (int i = 0; i < v; i++) {
            map.put(i, new HashMap<>());

        }
    }

    public void addedge(int v1, int v2) {
        map.get(v1).put(v2, 5);

    }
    public int kosaraju(){
        Stack<Integer> st = new Stack();
        HashSet<Integer> visited= new HashSet<>();
        dfs(visited,st,0); //is shme dfs milega jo stack m finishing time s store krega
        HashMap<Integer,HashMap<Integer,Integer>> map1=new HashMap<>();
        TransposeGraph(map1);
        visited= new HashSet<>();
        int count=0;
        while (!st.isEmpty())
        {
            int item=st.pop();
            if(!visited.contains(item)){
                dfs(map1,visited,item);
                count++;
            }
        }
        return count;
    }

    public void dfs(HashSet<Integer> visited,Stack<Integer>st, int i){
        visited.add(i);
        for (int nbr:map.get(i).keySet())
        {
            if(!visited.contains(nbr))
                dfs(visited,st,nbr);
        }
        st.push(i);
    }

    public void dfs(HashMap<Integer,HashMap<Integer,Integer>> map1,HashSet<Integer> visited,int item)
    {
        visited.add(item);
        for(int nbr: map1.get(item).keySet())
        {
            if(!visited.contains(nbr))
                dfs(map1,visited,nbr);
        }
    }
    public void TransposeGraph(HashMap<Integer,HashMap<Integer,Integer>> map1)
    {
        //isko hm sari edges reverse krnge kyuki ssc m vo koi affect nhi dega but agr koi alg s h to usme vo detetct hojyga
        for(int key:map.keySet())
        {
            for(int nbr: map.get(key).keySet())
            {
                if(!map1.containsKey(nbr))
                    map1.put(nbr,new HashMap<>());
                map1.get(nbr).put(key,2);
            }
        }
        for(int key:map.keySet())
        {
            if(!map1.containsKey(key)){
                map1.put(key,new HashMap<>());
            }
        }
        System.out.println(map1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        KosaRaju ks = new KosaRaju(n);
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            int e1 = sc.nextInt();
            int e2 = sc.nextInt();
            ks.addedge(e1, e2);

        }
        System.out.println(ks.kosaraju());
    }

}
