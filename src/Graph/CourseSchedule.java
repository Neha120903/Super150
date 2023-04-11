package Graph;
import jdk.nashorn.internal.ir.GetSplitState;

import java.util.*;
public class CourseSchedule {

    //cs1
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        HashMap<Integer, List<Integer>> map= new HashMap<>();

        for(int i=0;i< numCourses;i++)
        {
            map.put(i, new ArrayList<>());
        }
        for (int i = 0; i < prerequisites.length ; i++) {
            map.get(prerequisites[i][1]).add(prerequisites[i][0]);
        }

        return topologicalSort(map);
    }

    public boolean topologicalSort(HashMap<Integer,List<Integer>> map)
    {
        int in[]= indegree(map);

        Queue<Integer> q= new LinkedList<>();
        for (int i = 0; i <in.length ; i++) {
            if(in[i]==0)
                q.add(i);
        }
        int c=0;
        while(!q.isEmpty())
        {
            int rv=q.poll();
            c++;
            for (int nbr:map.get(rv))
            {
                in[nbr]--;
                if(in[nbr]==0)
                    q.add(nbr);
            }
        }
        return c==map.size();
    }

    public int[] indegree(HashMap<Integer, List<Integer>> map)
    {
        int []in= new int[map.size()];
        for(int key: map.keySet())
        {
            for(int nbr:map.get(key))
            {
                in[nbr]++;
            }
        }
        return in;
    }

    //cs2
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        HashMap<Integer, List<Integer>> map= new HashMap<>();

        for(int i=0;i< numCourses;i++)
        {
            map.put(i, new ArrayList<>());
        }
        for (int i = 0; i < prerequisites.length ; i++) {
            map.get(prerequisites[i][1]).add(prerequisites[i][0]);
        }

        return topologicalSort1(map);
    }

    public int[] topologicalSort1(HashMap<Integer,List<Integer>> map)
    {
        int in[]= indegree(map);
        int ans[]= new int[map.size()];
        int idx=0;
        StringBuilder sb = new StringBuilder();
        Queue<Integer> q= new LinkedList<>();
        for (int i = 0; i <in.length ; i++) {
            if(in[i]==0)
                q.add(i);
        }
        int c=0;
        while(!q.isEmpty())
        {
            int rv=q.poll();
            ans[idx++]=rv;
            c++;
            sb.append(rv);
            for (int nbr:map.get(rv))
            {
                in[nbr]--;
                if(in[nbr]==0)
                    q.add(nbr);
            }
        }
        return c== map.size()?ans:new int[0];
    }
}
