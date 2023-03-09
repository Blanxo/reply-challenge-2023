package main.java.model;

public class Game {
    public int columns;
    public int rows;
    public int snakes;

    public Game(int columns, int rows, int snakes) {
        this.columns = columns;
        this.rows = rows;
        this.snakes = snakes;
    }

    @Override
    public String toString() {
        return "Game{" +
                "columns=" + columns +
                ", rows=" + rows +
                ", snakes=" + snakes +
                '}';
    }
}
