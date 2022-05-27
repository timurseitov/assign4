import java.util.*;

public class WeightedGraph<V> {
    private final Map<Vertex<V>, ArrayList<Vertex<V>>> adjLists;

    public WeightedGraph() {
        this.adjLists = new HashMap<Vertex<V>, ArrayList<Vertex<V>>>();
    }

    public void addVertex(Vertex<V> vertex) {
        if (!this.hasVertex(vertex)) {
            this.adjLists.put(vertex, new ArrayList<Vertex<V>>());
            System.out.printf("Vertex added");
        }
    }

    private boolean hasVertex(Vertex<V> vertex) {
        for (Vertex<V> v : this.adjLists.keySet())
            if (vertex.equals(v))
                return true;
        return false;
    }

    public void removeVertex(Vertex<V> vertex) {
        if (this.hasVertex(vertex)) {
            this.adjLists.remove(vertex);
            for (Vertex<V> v : this.getVertices()) {
                ArrayList<Vertex<V>> vAdjList = this.getAdjacencyListOf(v);
                vAdjList.remove(vertex);
            }
            System.out.printf("Removed vertex: ", vertex);
        }
    }

    private Set<Vertex<V>> getVertices() {
        return this.adjLists.keySet();
    }

    private ArrayList<Vertex<V>> getAdjacencyListOf(Vertex<V> vertex) {
        for (Vertex<V> v : this.getVertices())
            if (vertex.equals(v)) {
                return this.adjLists.get(v);
            }

        return null;
    }

    public void addEdge(Vertex<V> source, Vertex<V> destination, double weight) {
        if (!this.hasVertex(source) || !this.hasVertex(destination))
            return;

        if (!this.hasEdge(source, destination, weight)) {
            ArrayList<Vertex<V>> srcAdjacencyList = this.getAdjacencyListOf(source);
            srcAdjacencyList.add(destination);
            if (!source.equals(destination)) {
                ArrayList<Vertex<V>> destAdjacencyList = this.getAdjacencyListOf(destination);
                destAdjacencyList.add(source);
            }
            System.out.printf("Added edge between vertices");
        }
    }

    public boolean hasEdge(Vertex<V> source, Vertex<V> destination, double weight) {
        return this.hasVertex(source) && this.hasVertex(destination) && this.getAdjacencyListOf(source).contains(destination);
    }
}
