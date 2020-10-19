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
        if (fire == true){
            this.fire=true;
            this.hills=this.jangle=this.enemy=this.empty=this.level=this.life=false;
        } else if(hills==true) {
            this.hills=true;
            this.fire=this.jangle=this.enemy=this.empty=this.level=this.life=false;
        }else if(jangle==true){
            this.jangle=true;
            this.fire=this.hills=this.enemy=this.empty=this.level=this.life=false;
        }else if(enemy==true){
            this.enemy=true;
            this.fire=this.hills=this.jangle=this.empty=this.level=this.life=false;
        } else if(empty==true){
            this.empty=true;
            this.fire=this.hills=this.jangle=this.enemy=this.level=this.life=false;
        }  else if(level==true){
            this.level=true;
            this.fire=this.hills=this.jangle=this.enemy=this.empty=this.life=false;
        }else if(life==true){
            this.life=true;
            this.fire=this.hills=this.jangle=this.enemy=this.empty=this.level=false;
        }
        this.coordinate=coordinate;
    }
    public Tile(Position position)
    {
        this(position,false,false,false,false,true,false,false);
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
