import Graph.Graph;

/**
 * Created by BuiAnhVu on 7/12/2017.
 */
public class TestBfsDfs {
    public static void main (String arg[]){
        Graph g = new Graph();
        g.addVertice("A");
        g.addVertice("B");
        g.addVertice("C");
        g.addVertice("D");
        g.addVertice("E");
        g.addVertice("F");
        g.addEdge("A", "B");
        g.addEdge("A", "C");
        g.addEdge("A", "D");
        g.addEdge("B", "E");
        g.addEdge("B", "F");
        g.setRootNode(g.getVertexByName("A"));
        g.DFS();
    }
}
