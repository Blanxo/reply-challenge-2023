package main.java.model;

public class NormalMove implements Move {

    public int value;
    public String direction;
    public int x;
    public int y;

    public NormalMove(int value, String direction, int x, int y) {
        this.value = value;
        this.direction = direction;
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return direction + " ";
    }
}
