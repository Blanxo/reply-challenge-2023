package main.java.model;

public class Game {
    public int totalTurns;
    public int currentTurn;
    public int totalEnemies;
    public int currentEnemy;

    public Game(int totalTurns, int currentTurn, int totalEnemies, int currentEnemy) {
        this.totalTurns = totalTurns;
        this.currentTurn = currentTurn;
        this.totalEnemies = totalEnemies;
        this.currentEnemy = currentEnemy;
    }

    @Override
    public String toString() {
        return "Game{" +
                "totalTurns=" + totalTurns +
                ", currentTurn=" + currentTurn +
                ", totalEnemies=" + totalEnemies +
                ", currentEnemy=" + currentEnemy +
                '}';
    }
}
