public class Map {

    private int width;
    private int breadth;
    private Tile rectangle;


    public Map(int width, int breadth,Tile rectangle) {
        this.width = width;
        this.breadth = breadth;
        this.rectangle=rectangle;
    }

    public int getWidth() {
        return width;
    }

    public int getBreadth() {
        return breadth;
    }
}