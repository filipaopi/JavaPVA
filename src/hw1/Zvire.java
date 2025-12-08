package hw1;

public class Zvire {
    private String name;
    private int legCount;

    public Zvire(String name, int legCount) {
        this.name = name;
        this.legCount = legCount;
    }

    public String getName() {
        return name;
    }

    public int getLegCount() {
        return legCount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLegCount(int legCount) {
        this.legCount = legCount;
    }
}
