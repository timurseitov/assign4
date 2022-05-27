public class Main {
    public static void main(String[] args) {
        WeightedGraph<String> stringGraph = new WeightedGraph<>();

        Vertex<String> u1 = new Vertex<String>("A");
        Vertex<String> u2 = new Vertex<String>("B");
        Vertex<String> v1 = new Vertex<String>("C");
        Vertex<String> v2 = new Vertex<String>("D");
        Vertex<String> w1 = new Vertex<String>("E");
        Vertex<String> w2 = new Vertex<String>("F");

        stringGraph.addVertex(u1);
        stringGraph.addVertex(u2);
        stringGraph.addVertex(v1);
        stringGraph.addVertex(v2);
        stringGraph.addVertex(w1);
        stringGraph.addVertex(w2);
        stringGraph.addEdge(u1, u2, 1);
        stringGraph.addEdge(v1, v2, 5);
        stringGraph.addEdge(w1, w2, 3);
        stringGraph.addEdge(u1, v1, 7);
        stringGraph.addEdge(u1, w1, 4);
        stringGraph.addEdge(v1, w1, 9);
    }
}
