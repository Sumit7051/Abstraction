package entity.Animal;

public class Fish extends Animal implements Swim{


    public Fish(String Name) {
        super(Name);
    }

    public void swim()
    {
        System.out.println(getName()+ "is swimming 🏊");
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

    @Override
    public void swimming() {
        System.out.println(getName()+ " is swimming....");
    }
}
