package main.java.model;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Snake {
    List<Component> components;
    List<Move> moves;
    public int size;
    public int startingX;
    public int startingY;

    public Snake(int size, int startingX, int startingY) {
        this.size = size;
        this.startingX = startingX;
        this.startingY = startingY;
        this.moves = new ArrayList<>();
    }
}
