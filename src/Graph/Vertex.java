package Graph;


import java.util.ArrayList;

/**
 * Created by BuiAnhVu on 7/4/2017.
 */
public class Vertex {
    int vertexNum;
    String name;
    boolean visited = false;
    ArrayList<Vertex> adjacentList = new ArrayList<Vertex>();
    public Vertex(String name){
        this.name = name;
    }

    public int getVertexNum() {
        return vertexNum;
    }

    public void setVertexNum(int vertexNum) {
        this.vertexNum = vertexNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void addAdjacentVertex(Vertex node){
        adjacentList.add(node);
    }
    public ArrayList<Vertex> getAdjacentList(){
        return this.adjacentList;
    }
}
