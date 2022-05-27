import java.util.Map;

public class Vertex<V> {
    private V data;
    private Map<Vertex<V>, Double> adjacentVertices;

    public Vertex(V data) {
        this.data = data;
    }

    public void addAdjacentVertex(Vertex<V> destination, double weight) {
        adjacentVertices.put(destination, weight);
    }

    public V getData() {
        return this.data;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        else if (obj == null || !(obj instanceof Vertex))
            return false;

        return this.data.equals(((Vertex<?>) obj).getData());
    }

    @Override
    public String toString() {
        return data.toString();
    }
}
