package Graph;

import java.util.*;

/*Given n nodes labeled from 0 to n - 1 and a list of undirected edges (each edge is a pair of nodes), write a function
 to check whether these edges make up a valid tree.
 Input: n = 5 edges = [[0, 1], [0, 2], [0, 3], [1, 4]]
Output: true.
 */
public class GraphValidTree {
    public static void main(String[] args) {

    }
    public boolean validTree(int n, int[][] edges) {
        // write your code here
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(i,new ArrayList<>());
        }
        for (int i = 0; i <edges.length ; i++) {
            int v1=edges[i][0];
            int v2=edges[i][1];
            map.get(v1).add(v2);
            map.get(v2).add(v1);
        }
        return isValid(map);

    }
    public boolean isValid(HashMap<Integer, List<Integer>> map)
    {
        HashSet<Integer> visited =new HashSet<>();
        Stack<Integer> q=new Stack<>();
        int count=0;
        for(int source: map.keySet()) {
            if(visited.contains(source))
                continue;
            q.push(source);
            while (!q.isEmpty()) {
                //step 1- remove
                int rv = q.pop();
                //step2-if alrdy visited then ignore  --> this shows the cycle in the graph
                if (visited.contains(rv))
                    continue;
                count++;
                //step3- visited
                visited.add(rv);
                //4-self work
                System.out.print(rv + " ");
                //step5-add neighbour
                for (int nbr : map.get(rv)) {
                    if (!visited.contains(nbr))
                        q.push(nbr);
                }
            }
        }
        return false;
    }
}
