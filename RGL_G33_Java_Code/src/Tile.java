public class Tile {
    private boolean fire ;
    private boolean hills;
    private boolean jangle;
    private Position coordinate;
    private boolean enemy;
    private boolean empty;
    private boolean level;
    private boolean life;

    public Tile(boolean fire, boolean hills, boolean jangle, Position coordinate, boolean enemy, boolean empty, boolean level, boolean life) {
        this.fire = fire;
        this.hills = hills;
        this.jangle = jangle;
        this.coordinate = coordinate;
        this.enemy = enemy;
        this.empty = empty;
        this.level = level;
        this.life = life;
    }
    public Tile()
    {
        this(false,false,false,new Position(0,0),false,true,false,false);
    }
}
