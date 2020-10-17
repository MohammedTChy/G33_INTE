public abstract class Player {

    private String name;
    private int hitPoints;

    public Player(String name) {
        this.name = name;

    }
    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }
}
