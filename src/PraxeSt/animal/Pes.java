package PraxeSt.animal;

public class Pes extends Animal{
    String Breed;

    public Pes(int age, String name,  String Breed) {
        super(age, name);
        this.Breed = Breed;
    }

    @Override
    public void zvuk() {
        System.out.println("haf haf");
    }


}
