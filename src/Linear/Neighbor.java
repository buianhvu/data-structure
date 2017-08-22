package Linear;

/**
 * Created by BuiAnhVu on 7/4/2017.
 */
public class Neighbor {
    int verNum;
    Neighbor next;
    public Neighbor(int verNum, Neighbor next){
        this.verNum = verNum;
        this.next = next;
    }
}
