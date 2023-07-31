package taho.oliokurssi.harjoitustyo;

import java.io.Serializable;

public class Lutemon implements Serializable {
    protected String name;
    protected String color;
    protected int attack;
    protected int defence;
    protected int experience;
    protected int health;
    protected int maxHealth;
    protected int id;
    private int idCounter = 0;
    private Location location;

    public Lutemon (String name, String color) {
        this.name = name;
        this.color = color;

        if (color.equals("Valkoinen")) {
            this.attack = 5;
            this.defence = 4;
            this.experience = 0;
            this.health = 20;
            this.maxHealth = 20;
        }
        else if (color.equals("Vihreä")) {
            this.attack = 6;
            this.defence = 3;
            this.experience = 0;
            this.health = 19;
            this.maxHealth = 19;
        }
        else if (color.equals("Pinkki")) {
            this.attack = 7;
            this.defence = 2;
            this.experience = 0;
            this.health = 18;
            this.maxHealth = 18;
        }
        else if (color.equals("Oranssi")) {
            this.attack = 8;
            this.defence = 1;
            this.experience = 0;
            this.health = 17;
            this.maxHealth = 17;
        }
        else {
            this.attack = 9;
            this.defence = 0;
            this.experience = 0;
            this.health = 16;
            this.maxHealth = 16;
        }


        this.id = (int)(Math.random() * 90000 + 1000);
        idCounter++;

        this.location = Location.HOME;

    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefence() {
        return defence;
    }

    public int getExperience() {
        return experience;
    }

    public int getHealth() {
        return health;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public Location getLocation() {
        return location;
    }

    public int getId() {
        return id;
    }

    public int healToMaxHealth() {
        this.health = maxHealth;
        return health;
    }

    public void addExperience() {
        this.experience++;
    }

    public void setLocation(Location location) {
        this.location = location;

    }

    public void setHealth(int health) {
        this.health = health;
    }

}
