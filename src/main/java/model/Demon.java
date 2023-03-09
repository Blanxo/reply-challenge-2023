package main.java.model;

import java.util.List;

public class Demon {
    public int stamina;
    public int turnsToRecoverStamina;
    public int staminaRecovered;
    public int turnsWithRewards;
    public List<Integer> rewards;
    public double ratio;
    public Demon(int stamina, int turnsToRecoverStamina, int staminaRecovered, int turnsWithRewards) {
        this.stamina = stamina;
        this.turnsToRecoverStamina = turnsToRecoverStamina;
        this.staminaRecovered = staminaRecovered;
        this.turnsWithRewards = turnsWithRewards;
    }

    @Override
    public String toString() {
        return "Demon{" +
                "stamina=" + stamina +
                ", turnsToRecoverStamina=" + turnsToRecoverStamina +
                ", staminaRecovered=" + staminaRecovered +
                ", turnsWithRewards=" + turnsWithRewards +
                ", rewards=" + rewards +
                '}';
    }
}
