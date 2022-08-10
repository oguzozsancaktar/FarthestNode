public class Main {

    public static void main(String[] args) {

        String[] t1 = new String[] {"b-e","b-c","c-d","a-b","e-f"};
        String[] t2 = new String[] {"b-a","c-e","b-c","d-c"};
        String[] t3 = new String[] {"a-b"};
        String[] t4 = new String[] {"a-b", "b-c", "c-e", "a-d"};
        String[] t5 = new String[] {"a-b", "b-c", "c-e", "a-d", "g-f", "f-d"};
        String[] t6 = new String[] {"a-b", "b-c", "c-e", "a-d", "g-f", "f-d", "h-i", "f-h"};
        String[] t7 = new String[] {"b-a", "a-c", "c-d", "e-d", "e-f", "f-g", "g-h", "i-h", "i-j"};


        Graph graph = new Graph();
        String[] parts;

        for (String s:t7) {
            parts = s.split("-");

            graph.addNode(parts[0]);
            graph.addNode(parts[1]);

            graph.addEdge(parts[0], parts[1]);
        }

        System.out.println(graph.findLongestPath());
    }
}
