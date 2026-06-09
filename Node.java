public class Node implements Comparable<Node> {

    String city;
    int distance;

    public Node(String city, int distance) {
        this.city = city;
        this.distance = distance;
    }

    @Override
    public int compareTo(Node other) {
        return this.distance - other.distance;
    }
}