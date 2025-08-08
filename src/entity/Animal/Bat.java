package entity.Animal;

public class Bat extends Animal{

    public Bat(String Name, String name) {
        super(Name);
    }

    public void fly(Animal animal)
    {
        System.out.println(getName()+ "is flying 🚀");
    }

    @Override
    public void eat() {

    }

    @Override
    public void makeNoise() {
        System.out.println(getName()+ " is screeshing...");
    }

    @Override
    public void roam() {

    }
}
