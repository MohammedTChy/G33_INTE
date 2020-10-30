import java.util.Objects;

public class Position {

    private int x;
    private int y;

    protected Position(int x, int y) {//made protected
        this.x = x;
        this.y = y;
    }

    protected int getX() {
        return x;
    }//made protected

    protected int getY() {
        return y;
    }//made protected

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position = (Position) o;
        return x == position.x &&
                y == position.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
