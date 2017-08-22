package Graph;
import Linear.Queue;
import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by BuiAnhVu on 7/4/2017.
 */
public class Graph {
    ArrayList<Vertex> vertices = new ArrayList<Vertex>();
    Vertex root;
//    ArrayList<Edge> edges = new ArrayList<Edge>();

    // add an vertex with an arbitrary name
    public boolean addVertice(String name) {
        for (Vertex item : vertices) {
            if (item.getName().equals(name))
                return false;
        }
        vertices.add(new Vertex(name));
        return true;
    }
    //add an Edge from vertex 1 to vertex2 ( directed )
//    public boolean addEdge(String name1, String name2){
//        boolean found1 = false;
//        boolean found2 = false;
//        Vertex start;
//        Vertex end;
//        // check if there are two vertices with name1 and name2
//        for(Vertex item : vertices ){
//            if(item.getName().equals(name1)) {
//                found1 = true;
//                start = item;
//            }
//            if(item.getName().equals(name2)) {
//                found2 = true;
//                end = item;
//            }
//        }
//        // check if Edge from v1 to v2 has already existed
//        if(found1 && found2){
////            for(Edge item : edges){
////                if(item.getStart().getName().equals(name1) && item.getEnd().getName().equals(name2)){
////                    return true;
////                }
//
//            }
//            edges.add(new Edge(new Vertex(name1), new Vertex(name2)));
//            return true;
//        }
//        else
//            return false;
//    }

    public boolean addEdge(String name1, String name2){
        if(isInGraph(name1) && isInGraph(name2)){
            Vertex item1 = getVertexByName(name1);
            Vertex item2 = getVertexByName(name2);
            item1.getAdjacentList().add(item2);
            item2.getAdjacentList().add(item1);
            return true;
        }
        else
            return false;
    }

    public ArrayList<Vertex> getAdjacentVertices(String name){
        for(Vertex item : vertices){
            if(item.getName().equals(name)){
                return item.getAdjacentList();
            }
        }
        return null;
    }
    public void printAll(){
        for (Vertex item : vertices){
            System.out.print(item.getName() + " : ");
            for(Vertex item1 : item.getAdjacentList()){
                System.out.print(item1.getName() + " ");
            }
            System.out.println("\n");
        }
    }
    public boolean isInGraph(String name){
        for(Vertex item : vertices){
            if(name.equals(item.getName())){
                return true;
            }
        }
        return false;
    }
    public Vertex getVertexByName(String name){
        for(Vertex item : vertices){
            if(item.getName().equals(name))
                return item;
        }
        return null;
    }
    // set root first before using dfs
    public void DFS(){
        Stack<Vertex> stack = new Stack<Vertex>();
        stack.push(root);
        while(!stack.isEmpty()){
            Vertex node = stack.peek();
            node.visited = true;
            printNode(node);
            Vertex childNode = getNotVisitedNode(node);
            if(childNode != null){
                childNode.visited = true;
                printNode(childNode);
                stack.push(childNode);
            }
            else{
                stack.pop();
            }
        }
    }
    // set root first before using bfs
    public void BFS(){
        Queue<Vertex> queue = new Queue<Vertex>(100);
    }

    public Vertex getNotVisitedNode(Vertex vertex){
        int i = 0;
        ArrayList<Vertex> adjacentList = vertex.getAdjacentList();
        while(i < adjacentList.size()){
            if(adjacentList.get(i).visited == false)
                return adjacentList.get(i);
        }
        return null;
    }
    public void setRootNode(Vertex vertex){
        root = vertex;
    }
    public void printNode(Vertex vertex){
        System.out.print(vertex.getName() + " ");
    }
}
