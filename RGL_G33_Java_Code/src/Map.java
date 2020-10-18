import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Map {

    private int width;
    private int breadth;
    HashSet<Position>checkPosition=new HashSet<>();
    private ArrayList<Tile> tiles=new ArrayList<>();

    public Map(int width, int breadth) {
        this.width = width;
        this.breadth = breadth;
    }

    public int getWidth() {
        return width;
    }

    public int getBreadth() {
        return breadth;
    }

    void addTile(Tile tile){
        System.out.println(checkPosition.contains(tile.getCoordinate()));
        if(checkPosition.contains(tile.getCoordinate())==true){
            System.out.println("here");
            throw new IllegalArgumentException("This position is occupied");
        }
        checkPosition.add(tile.getCoordinate());
        tiles.add(tile);
    }
}