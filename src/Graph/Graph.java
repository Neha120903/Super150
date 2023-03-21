package Graph;

import java.util.*;

public class Graph {
    private HashMap<Integer,HashMap<Integer,Integer>> map = new HashMap<>();
    public Graph(int v){
        for (int i = 1; i <=v ; i++) {
            map.put(i,new HashMap<>());
        }
    }
    public void AddEdge(int v1, int v2, int cost)
    {
        map.get(v1).put(v2,cost);  //v1-->v2
        map.get(v2).put(v1,cost);  //v2-->v1
    }

    public boolean ContainsEdge(int v1, int v2)
    {
        return map.get(v1).containsKey(v2);
    }

    public boolean ContainsVertex(int v1)
    {
        return map.containsKey(v1);
    }

    public int noOfEdges(){
        int sum=0;
        for(int key: map.keySet())
        {
            sum=sum+map.get(key).size();
        }
        return sum/2;
    }
    public void removeEdge(int v1, int v2)
    {
        if(ContainsEdge(v1,v2))
        {
            map.get(v1).remove(v2);
            map.get(v2).remove(v1);
        }
    }

    public void removeVertex(int v1)
    {
        for(int key :map.get(v1).keySet())
        {
            map.get(key).remove(v1);
        }
        map.remove(v1);
    }
    public void display(){
        for(int key: map.keySet())
        {
            System.out.println(key+" "+map.get(key));
        }
    }

    public boolean hasPath(int source, int destination, HashSet<Integer> visited)
    {
        if(source==destination)
            return true;
        visited.add(source);
        for(int nbr:map.get(source).keySet())
        {
            if(!visited.contains(nbr)) {
                boolean ans = hasPath(nbr, destination, visited);
                if (ans)
                    return true;
            }
        }
       // visited.remove(source);
        return false;
    }

    public void allPath(int source, int destination, HashSet<Integer> visited,String ans)
    {
        if(source==destination){
            System.out.println(ans+source);
            return ;
        }

        visited.add(source);
        for(int nbr:map.get(source).keySet())
        {
            if(!visited.contains(nbr)) {
                allPath(nbr, destination, visited,ans+source);
            }
        }
         visited.remove(source);
    }

    public boolean BFS(int source, int des)
    {
        HashSet<Integer> visited =new HashSet<>();
        Queue<Integer> q=new LinkedList<>();
        q.add(source);
        while(!q.isEmpty())
        {
            //step 1- remove
            int rv=q.poll();
            //step2-if alrdy visited then ignore  --> this shows the cycle in the graph
            if(visited.contains(rv))
                continue;
            //step3- visited
            visited.add(rv);
            //4-self work
            if(rv==des)
                return true;
            //step5-add neighbour
            for(int nbr:map.get(rv).keySet())
            {
                if(!visited.contains(nbr))
                    q.add(nbr);
            }
        }
        return false;
    }
    public boolean DFS(int source, int des)
    {
        HashSet<Integer> visited =new HashSet<>();
        Stack<Integer> q=new Stack<>();
        q.push(source);
        while(!q.isEmpty())
        {
            //step 1- remove
            int rv=q.pop();
            //step2-if alrdy visited then ignore  --> this shows the cycle in the graph
            if(visited.contains(rv))
                continue;
            //step3- visited
            visited.add(rv);
            //4-self work
            if(rv==des)
                return true;
            //step5-add neighbour
            for(int nbr:map.get(rv).keySet())
            {
                if(!visited.contains(nbr))
                    q.push(nbr);
            }
        }
        return false;
    }
    //BFT is able to print all the component whihc are not directly connected to the one hence it will print all using for loop
    public void BFT()
    {
        HashSet<Integer> visited =new HashSet<>();
        Queue<Integer> q=new LinkedList<>();
        for(int source: map.keySet()) {
            q.add(source);
            while (!q.isEmpty()) {
                //step 1- remove
                int rv = q.poll();
                //step2-if alrdy visited then ignore  --> this shows the cycle in the graph
                if (visited.contains(rv))
                    continue;
                //step3- visited
                visited.add(rv);
                //4-self work
                System.out.print(rv + " ");
                //step5-add neighbour
                for (int nbr : map.get(rv).keySet()) {
                    if (!visited.contains(nbr))
                        q.add(nbr);
                }
            }
        }
    }

    public void DFT()
    {
        HashSet<Integer> visited =new HashSet<>();
        Stack<Integer> q=new Stack<>();
        for(int source: map.keySet()) {
            if(visited.contains(source))
                continue;
            q.push(source);
            while(!q.isEmpty())
            {
                //step 1- remove
                int rv=q.pop();
                //step2-if alrdy visited then ignore  --> this shows the cycle in the graph
                if(visited.contains(rv))
                    continue;
                //step3- visited
                visited.add(rv);
                //4-self work
                System.out.print(rv+" ");
                //step5-add neighbour
                for(int nbr:map.get(rv).keySet())
                {
                    if(!visited.contains(nbr))
                        q.push(nbr);
                }
            }
        }
    }
}
