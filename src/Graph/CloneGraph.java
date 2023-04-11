package Graph;
import java.util.*;
public class CloneGraph {
    class Node {
        public int val;
        public List<Node> neighbors;

        public Node() {
            val = 0;
            neighbors = new ArrayList<Node>();
        }

        public Node(int _val) {
            val = _val;
            neighbors = new ArrayList<Node>();
        }

        public Node(int _val, ArrayList<Node> _neighbors) {
            val = _val;
            neighbors = _neighbors;
        }

        public Node cloneGraph(Node node) {
            if (node == null)
                return node;
            HashMap<Node, Node> visited = new HashMap<>();
            Queue<Node> q = new LinkedList<>();
            q.add(node);
            visited.put(node, new Node(node.val));  //isme hmne ek clone add kr diya h
            while (!q.isEmpty()) {
                Node p = q.poll();
                for (Node nbr : p.neighbors) {
                    if (!visited.containsKey(nbr)) {
                        visited.put(nbr, new Node(nbr.val));
                        q.add(nbr);
                    }
                    visited.get(p).neighbors.add(visited.get(nbr));
                }
            }
            return visited.get(node);
        }
    }
}
