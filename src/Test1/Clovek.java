package Test1;

public class Clovek {
    private String name;
    private int age;
    public Clovek(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setNameAndAge(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public int getAge() {
        return age;
    }
}
