package by.htp.patterns.entity;

import java.util.Objects;

public class Treasure {
    private int id;
    private int cost;
    private String name;

    public Treasure() {
    }

    public Treasure(int id, String name, int cost) {
        this.id = id;
        this.name = name;
        this.cost = cost;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Treasure treasure = (Treasure) o;
        return id == treasure.id &&
                cost == treasure.cost &&
                Objects.equals(name, treasure.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, cost, name);
    }

    @Override
    public String toString() {
        return "Treasure{" +
                "id=" + id +
                ", cost=" + cost +
                ", name='" + name + '\'' +
                '}';
    }
}
