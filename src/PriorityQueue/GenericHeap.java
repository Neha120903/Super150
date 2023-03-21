package PriorityQueue;

import java.util.ArrayList;

public class GenericHeap<T extends Comparable<T>> {
    private ArrayList<T> list = new ArrayList<>();

    public void add(T item)   //O(logN)
    {
        list.add(item);
        upHeapify(list.size()-1);
    }

    private void upHeapify(int ci) //child index is given to check    //circular doubly linked list m ky th
    {
        int pi=(ci-1)/2;
        if(isLarger(list.get(pi),list.get(ci)) >0)  //pi ki priority km h
        {
            Swap(pi,ci);
            upHeapify(pi);  //again for above nodes having parent
        }
    }

    public void Swap(int p, int c)
    {
        T t=list.get(p);
        T j= list.get(c);
        list.set(p,j);
        list.set(c,t);
    }

    public T remove()
    {
        Swap(0,list.size()-1);
        T rv=list.remove(list.size()-1);
        downHeapify(0); //bcz the node which we want to delete is replaced by rightmost and removed in o(1)
        return rv;
    }

    private void downHeapify(int pi)
    {
        int lci=2*pi+1;
        int rci=2*pi+2; //right child index
        int min=pi;
        if(lci<list.size() && isLarger(list.get(min) ,list.get(lci)) >0)
            min=lci;
        if(rci<list.size() && isLarger(list.get(min) ,list.get(rci)) >0)
            min=rci;
        if(min!=pi)
        {
            Swap(min,pi);
            upHeapify(min);
        }
    }
    public T getMin(){
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
    public int isLarger(T o1,T o2)
    {
        return o1.compareTo(o2 );
    }
}
