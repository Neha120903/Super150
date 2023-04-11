package Graph;

import java.util.HashMap;

public class DisjointSet {
    public class Node{
        int val;
        int rank;
        Node parent;
    }

    HashMap<Integer,Node> map = new HashMap<>();

    public void createSet(int val)
    {
        Node n = new Node();
        n.val=val;
        n.parent=n;
        n.rank=0;
        map.put(val,n);
    }
    public int find(int v){  //to get the representive element of that node
        Node n = map.get(v);
        return findParent(n).val;
    }

    private Node findParent(Node n)
    {
        if(n.parent == n)
            return n;
        return findParent(n.parent);
    }
    public void union(int v1, int v2)
    {
        Node n1 = map.get(v1);
        Node n2=map.get(v2);
        Node rp1=findParent(n1);
        Node rp2 =findParent(n2);

        if(rp1.rank == rp2.rank)  //i both have same rank
        {
            rp1.parent =rp2;
            rp2.rank=rp2.rank+1; //kyuki hmne rp2 ko re bnaya h
        }
        else if(rp1.rank > rp2.rank)
        {
            rp2.parent=rp1;
        }
        else
            rp1.parent=rp2;
    }

}
