package main.java.model;

public class Pandora {
    public int startingStamina;
    public int currentStamina;
    public int maxStamina;

    public Pandora(int startingStamina, int currentStamina, int maxStamina) {
        this.startingStamina = startingStamina;
        this.currentStamina = currentStamina;
        this.maxStamina = maxStamina;
    }

    @Override
    public String toString() {
        return "Pandora{" +
                "startingStamina=" + startingStamina +
                ", currentStamina=" + currentStamina +
                ", maxStamina=" + maxStamina +
                '}';
    }
}
