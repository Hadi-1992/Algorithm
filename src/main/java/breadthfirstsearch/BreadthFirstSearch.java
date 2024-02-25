package breadthfirstsearch;

import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;

public class BreadthFirstSearch {
    public static void main(String[] args) {
        Map<String, List<String>> bfsSearchHashMap = new HashMap<>();
        List<String> myList = new ArrayList<>();
        myList.add("Claire");
        myList.add("Alice");
        myList.add("Bob");
        String key01 = "Me";

        List<String> claireList = new ArrayList<>();
        claireList.add("Johny");
        claireList.add("Tom");
        String key02 = "Claire";

        List<String> aliceList = new ArrayList<>();
        aliceList.add("Peggi");
        String key03 = "Alice";

        List<String> bobList = new ArrayList<>();
        bobList.add("Peggi");
        bobList.add("Anuj");
        String key04 = "Bob";

        bfsSearchHashMap.put(key04, bobList);
        bfsSearchHashMap.put(key03, aliceList);
        bfsSearchHashMap.put(key02, claireList);
        bfsSearchHashMap.put(key01, myList);

        bfsFindName(bfsSearchHashMap, key01);
    }

    private static void bfsFindName(Map<String, List<String>> graph, String startNode) {
        Queue<String> queue = new LinkedBlockingQueue<>();
        Set<String> visited = new HashSet<>();
        boolean found = false;

        queue.add(startNode);
        visited.add(startNode);

        while (!queue.isEmpty() && !found) {
            String node = queue.poll();
            List<String> names = graph.get(node);

            if (names != null) {
                for (String name : names) {
                    if (name.length() > 1 && name.charAt(5) == 'e') {
                        System.out.println(name + " found in key: " + node);
                        found = true;
                        break;
                    }
                }
            }

            List<String> neighbors = graph.get(node);
            if (neighbors != null) {
                for (String neighbor : neighbors) {
                    if (!visited.contains(neighbor)) {
                        queue.add(neighbor);
                        visited.add(neighbor);
                    }
                }
            }
        }
    }
}
