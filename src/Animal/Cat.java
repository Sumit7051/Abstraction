package Animal;

public class Cat extends Animal{

    public Cat(String Name) {
        super(Name);
    }

    public void talk(Animal animal)
    {
        System.out.println(getName()+ "Meow Meow");
    }

    @Override
    public void eat() {
        System.out.println();
    }

    @Override
    public void makeNoise() {

    }

    @Override
    public void roam() {

    }

}
