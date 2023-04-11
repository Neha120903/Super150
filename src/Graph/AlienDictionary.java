package Graph;

import java.util.*;

public class AlienDictionary {
    public String alienOrder(String []words)
    {
        HashMap<Character, List<Character>> map = new HashMap<>();
        //graph ko initalize kiya h kyuki uski hme vertex nhi pta
        for (int i = 0; i <words.length ; i++) {
            String s=words[i];
            for (int j = 0; j <s.length() ; j++) {
                if(!map.containsKey(s.charAt(j)))
                    map.put(s.charAt(j), new ArrayList<>());
            }
        }

        for(int i=0;i<words.length-1;i++)
        {
            String s1= words[i];
            String s2= words[i+1];
            if(s1.startsWith(s2) && s1.length() > s2.length())
                return "";
            for (int j = 0; j <Math.min(s1.length(),s2.length()) ; j++) {
                if(s1.charAt(j)!=s2.charAt(j))
                    map.get(s1.charAt(j)).add(s2.charAt(j));
            }
        }
        return TopologicalSort(map);
    }

    public String TopologicalSort(HashMap<Character,List<Character>> map)
    {
        int [] indegree= Indegree(map);
        StringBuilder sb = new StringBuilder();
        Queue<Character> q= new LinkedList<>();
        for( char ch: map.keySet())
        {
            if(indegree[ch-'a']==0)
                q.add(ch);
        }
        int c=0;
        while(!q.isEmpty())
        {
            char ch=q.poll();
            c++;
            sb.append(ch);
            for(char nbr:map.get(ch))
            {
                indegree[nbr-'a']--;
                if(indegree[nbr-'a']==0)
                    q.add(nbr);
            }
        }
        return map.size()==c?sb.toString():"";
    }
    public int[] Indegree(HashMap<Character,List<Character>> map)
    {
        int []in = new int[26];
        for (char key : map.keySet())
        {
            for(char nbr: map.get(key))
                in[nbr-'a']++;
        }
        return in;
    }
}
