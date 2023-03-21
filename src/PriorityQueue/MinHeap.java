package PriorityQueue;

import java.util.ArrayList;

//priority queue is simple complete binary tree
public class MinHeap {
    private ArrayList<Integer> list = new ArrayList<>();

    public void add(int item)   //O(logN)
    {
        list.add(item);
        upHeapify(list.size()-1);
    }

    private void upHeapify(int ci) //child index is given to check
    {
        int pi=(ci-1)/2;
        if(list.get(pi) >list.get(ci))
        {
            Swap(pi,ci);
            upHeapify(pi);  //again for above nodes having parent
        }
    }

    public void Swap(int p, int c)
    {
        int t=list.get(p);
        int j= list.get(c);
        list.set(p,j);
        list.set(c,t);
    }

    public int remove()
    {
        Swap(0,list.size()-1);
        int rv=list.remove(list.size()-1);
        downHeapify(0); //bcz the node which we want to delete is replaced by rightmost and removed in o(1)
        return rv;
    }

    private void downHeapify(int pi)
    {
        int lci=2*pi+1;
        int rci=2*pi+2; //right child index
        int min=pi;
        if(lci<list.size() &&list.get(min) >list.get(lci))
            min=lci;
        if(rci<list.size() &&list.get(min) >list.get(rci))
            min=rci;
        if(min!=pi)
        {
            Swap(min,pi);
            upHeapify(min);
        }
    }
    public int getMin(){
        return list.get(0);
    }
    public int size(){
        return list.size();
    }
    public void dis(){
        for (int i = 0; i <list.size() ; i++) {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
    }
}
