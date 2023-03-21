package Recursion;

import java.util.*;

/**Given an undirected graph and an integer M. The task is to determine if the graph can be colored with at most M colors
 * such that no two adjacent vertices of the graph are colored with the same color. Here coloring of a graph means the assignment
 * of colors to all vertices. Print 1 if it is possible to colour vertices and 0 otherwise.
 * Example 1:
 Input:
 N = 4
 M = 3
 E = 5
 Edges[] = {
 (0, 1),
 (1, 2),
 (2, 3),
 (3, 0),
 (0, 2)
 }

 Output: 1

 Explanation: It is possible to colour the given graph using 3 colours.
 * */
public class MColoring {
    public static boolean graphColoring(List < Integer > [] G, int[] color, int i, int C) {
        // Your code here
        int n = G.length;
        if (solve(i, G, color, n, C) == true) return true;
        return false;
    }
    private static boolean isSafe(int node, List < Integer > [] G, int[] color, int n, int col) {
        for (int it: G[node]) {
            if (color[it] == col) return false;
        }
        return true;
    }
    private static boolean solve(int node, List < Integer > [] G, int[] color, int n, int m) {
        if (node == n) return true;

        for (int i = 1; i <= m; i++) {
            if (isSafe(node, G, color, n, i)) {
                color[node] = i;
                if (solve(node + 1, G, color, n, m) == true) return true;
                color[node] = 0;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int N = 4, M = 3;
        List < Integer > [] G = new ArrayList[N];

        Scanner s = new Scanner(System.in);
        for (int i = 0; i <4 ; i++) {
            G[i]=new ArrayList<>();
            G[i].add(s.nextInt());
        }
        int[] color = new int[N];
        boolean ans = graphColoring(G, color, 0, M);
        if (ans == true)
            System.out.println("1");
        else
            System.out.println("0");
    }
}
