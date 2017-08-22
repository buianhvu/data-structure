import Graph.Graph;
/**
 * Created by BuiAnhVu on 7/4/2017.
 */
public class Main3 {
    public static void main(String arg[]) {
        Graph g = new Graph();
        g.addVertice("Sara");
        g.addVertice("Sam");
        g.addVertice("Sean");
        g.addVertice("Ajay");
        g.addVertice("Mira");
        g.addVertice("Jane");
        g.addVertice("Maria");
        g.addVertice("Rahul");
        g.addVertice("Sapna");
        g.addVertice("Rohit");
        g.addEdge("Sara", "Sam");
        g.addEdge("Sara", "Ajay");
        g.addEdge("Sam", "Sean");
        g.addEdge("Sam", "Mira");
        g.addEdge("Mira", "Jane");
        g.addEdge("Jane", "Maria");
        g.addEdge("Rahul", "Sapna");
        g.addEdge("Sapna","Rohit");

//        Sara Sam
//        Sara Ajay
//        Sam Sean
//        Sam Mira
//        Mira Jane
//        Jane Maria
//        Rahul Sapna
//        Sapna Rohit
        g.printAll();
    }
}
