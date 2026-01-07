package PraxeSt.animal;

public class Animal {
    int age;
    String name;

    public Animal(int age, String name){
        this.age = age;
        this.name = name;
    }

    public void zvuk(){
        System.out.println("Animal zvuk");
    }

}
