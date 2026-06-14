import java.util.*;

public class DijkstraAssignment {
    // GRAPH
    private HashMap<String, List<Edge>> graph;

    // CONSTRUCTOR
    public DijkstraAssignment() {
        graph = new HashMap<>();
    }

    // ADD CITY
    public void addCity(String city) {
        graph.putIfAbsent(city, new ArrayList<>());
    }

    // ADD ROAD
    public void addRoad(String source, String destination, int weight) {
        graph.get(source).add(new Edge(destination, weight));
    }

    // DIJKSTRA ALGORITHM
    public void dijkstra(String start) {
        //Implement dijkstra algorithm
        //Refer to the pseudoCode.md
        Map<String, Integer> distances = new HashMap<>();

        for (String city : graph.keySet()) {
            distances.put(city, Integer.MAX_VALUE);
        }

        distances.put(start, 0);

        PriorityQueue<Node> queue = new PriorityQueue<>();

        queue.add(new Node(start, 0));
        
        // PRINT RESULTS
        // System.out.println(
        //         "Shortest distances from "
        //                 + start + ":");

        // for (String city : distances.keySet()) {

        //     System.out.println(
        //             city + " = "
        //                     + distances.get(city));
        // }
    }

    // MAIN METHOD
    public static void main(String[] args) {
        /*
                  10
        Seattle ------ Bellevue
           |              |
         35|              |5
           |              |
           |              |
         Tacoma         Redmond
           |              |
         20|              |15
           |              |
           |              |
           ------ Everett
        */

        DijkstraAssignment map =
                new DijkstraAssignment();

        // ADD CITIES
        map.addCity("Seattle");
        map.addCity("Bellevue");
        map.addCity("Tacoma");
        map.addCity("Everett");
        map.addCity("Redmond");

        // ADD ROADS
        map.addRoad("Seattle", "Bellevue", 10);
        map.addRoad("Seattle", "Tacoma", 35);
        map.addRoad("Bellevue", "Redmond", 5);
        map.addRoad("Tacoma", "Everett", 20);
        map.addRoad("Redmond", "Everett", 15);

        // RUN DIJKSTRA
        map.dijkstra("Seattle");

        //Expected Output
        /*
        Shortest distances from Seattle:
            Tacoma = 35
            Seattle = 0
            Redmond = 15
            Everett = 30
            Bellevue = 10
        */
    }
}