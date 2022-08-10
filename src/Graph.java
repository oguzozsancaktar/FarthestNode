import java.util.*;

public class Graph {
    private Map<Node, List<Node>> nodes;
    private Stack<String> visited;

    public Graph() {
        this.nodes = new HashMap<>();
    }

    public Map<Node, List<Node>> getNodes() {
        return nodes;
    }

    public void addNode(String id) {
        nodes.putIfAbsent(new Node(id), new ArrayList<>());
    }

    public void addEdge(String id1, String id2) {
        Node node1 = new Node(id1);
        Node node2 = new Node(id2);
        nodes.get(node1).add(node2);
        nodes.get(node2).add(node1);
    }

    public int findLongestPath(){

        int maxDistance = 0;

        for (Node node:nodes.keySet()) {
            this.visited = new Stack<>();
            maxDistance = Math.max(maxDistance, DFS(node));
        }

        return maxDistance-1;
    }

    private int DFS(Node node){

        if (visited.contains(node.getId())) return 0;

        visited.add(node.getId());
        int longestPath = 0;
        for(Node n : nodes.get(node)){
            longestPath = Math.max(longestPath, DFS(n) + 1);
        }

        return longestPath;
    }


}
