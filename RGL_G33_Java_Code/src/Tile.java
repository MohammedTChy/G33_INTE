public class Tile {

    private boolean fire ;
    private boolean hills;
    private boolean jangle;
    private Position coordinate;
    private boolean enemy;
    private boolean empty;
    private boolean level;
    private boolean life;

    public Tile(Position coordinate, boolean fire, boolean hills, boolean jangle, boolean enemy, boolean empty, boolean level, boolean life) {
        this.fire=fire;
        this.hills=hills;
        this.jangle=jangle;
        this.enemy=enemy;
        this.empty=empty;
        this.level=level;
        this.life=life;
        this.coordinate=coordinate;
        if(!checkIfOnlyIsTrue())
            throw new IllegalArgumentException("Cant place two item in same tiles");
    }
    public Tile(Position position)
    {
        this(position,false,false,false,false,true,false,false);
    }

    boolean checkIfOnlyIsTrue() {
        if(fire && !hills && !jangle && !enemy && !empty && !level && !life) return true;
        if(!fire && hills && !jangle && !enemy && !empty && !level && !life) return true;
        if(!fire && !hills && jangle && !enemy && !empty && !level && !life) return true;
        if(!fire && !hills && !jangle && enemy && !empty && !level && !life) return true;
        if(!fire && !hills && !jangle && !enemy && empty && !level && !life) return true;
        if(!fire && !hills && !jangle && !enemy && !empty && level && !life) return true;
        return !fire && !hills && !jangle && !enemy && !empty && !level && life;
    }

    public boolean isFire() {
        return fire;
    }

    public boolean isHills() {
        return hills;
    }

    public boolean isJangle() {
        return jangle;
    }

    public Position getCoordinate() {
        return coordinate;
    }

    public boolean isEnemy() {
        return enemy;
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isLevel() {
        return level;
    }

    public boolean isLife() {
        return life;
    }
}
