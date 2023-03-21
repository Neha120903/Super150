package PriorityQueue;

public class MinHeapClient {
    public static void main(String[] args) {
        MinHeap hp = new MinHeap();
        hp.add(10);
        hp.add(2);
        hp.add(30);
        hp.add(12);
        hp.add(32);
        hp.add(43);
        System.out.println(hp.getMin());
        hp.dis();
        System.out.println(hp.remove());
        hp.dis();

    }
}
