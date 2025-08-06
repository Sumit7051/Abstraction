package Animal;

import javax.lang.model.element.Name;

public class Fish extends Animal{


    public Fish(String Name, String name) {
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
}
