import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Map {
    protected int width;
    protected int breadth;
    HashSet<Position>checkPosition=new HashSet<>();
    HashMap<Position,Tile>checkTile=new HashMap<>();
    private ArrayList<Tile> tiles=new ArrayList<>();

    protected Map(int width, int breadth) {
        if(width<=0) throw new IllegalArgumentException("Width ca not be negative or 0 ");
        if(breadth<=0) throw new IllegalArgumentException("Breadth ca not be negative or 0 ");
        this.width = width;
        this.breadth = breadth;
    }

    protected int getWidth() {
        return width;
    }

    protected int getBreadth() {
        return breadth;
    }

    void addTile(Tile tile){
        if(tile.getCoordinate().getX()>width) throw new IllegalArgumentException("Tile out of boundary in x");
        if(tile.getCoordinate().getY()>breadth) throw new IllegalArgumentException("Tile out of boundary in y");
        if(tile.getCoordinate().getX()<0) throw new IllegalArgumentException("x cant be negetive");
        if(tile.getCoordinate().getY()<0) throw new IllegalArgumentException("y cant be negetive");
        //if(checkIfOnlyIsTrue(tile)==false)
        if(checkPosition.contains(tile.getCoordinate())){
            throw new IllegalArgumentException("This position is occupied");
        }
        checkPosition.add(tile.getCoordinate());
        checkTile.put(tile.getCoordinate(),tile);
        tiles.add(tile);
    }

    protected Position movePosition(Position position,int direction){
        Position newPosition;
        if (direction==1){
            newPosition=new Position(position.getX()-1,position.getY());
        }else if (direction==2){
            newPosition=new Position(position.getX(),position.getY()+1);
        }else if (direction==3){
            newPosition=new Position(position.getX()+1,position.getY());
        }else {
            newPosition=new Position(position.getX(),position.getY()-1);
        }
        if(checkPosition(newPosition)){
            return newPosition;
        }else
            return position;
    }

    protected boolean checkPosition(Position position){
        if(position.getX()<=0) return false;
        if(position.getY()<=0) return false;
        if(position.getX()>width) return false;
        if(position.getY()>breadth) return false;
        if(checkTile.containsKey(position)==false) return true;
        Tile tilePosition=checkTile.get(position);
        if(tilePosition.isFire()) return false;
        if(tilePosition.isHills()) return false;
        if(tilePosition.isJangle()) return false;
        if(tilePosition.isEnemy()) return false;
        return true;
    }
}
