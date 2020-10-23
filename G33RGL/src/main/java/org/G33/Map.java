package org.G33;

import java.util.ArrayList;
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
        if(tile.getCoordinate().getX()>width) throw new IllegalArgumentException("Tile out of boundary in x");
        if(tile.getCoordinate().getY()>breadth) throw new IllegalArgumentException("Tile out of boundary in y");
        if(tile.getCoordinate().getX()<0) throw new IllegalArgumentException("x cant be negetive");
        if(tile.getCoordinate().getY()<0) throw new IllegalArgumentException("y cant be negetive");
        //if(checkIfOnlyIsTrue(tile)==false)
        if(checkPosition.contains(tile.getCoordinate())==true){
            throw new IllegalArgumentException("This position is occupied");
        }
        checkPosition.add(tile.getCoordinate());
        tiles.add(tile);
    }
}