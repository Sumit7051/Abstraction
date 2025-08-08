package entity.Animal;

public class Lion extends Animal{
    public Lion(String name) {
        super(name);
    }

    public void jump()
    {
        System.out.println(getName()+ " is jumping on the floor....");
    }

    @Override
    public void eat() {

    }

    @Override
    public void makeNoise() {

    }

    @Override
    public void roam() {

    }
}
