package Animal;

import javax.lang.model.element.Name;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName()+ " is eating..🥣");
    }

    @Override
    public void makeNoise() {
        System.out.println(getName()+ " is barking...🐶");
    }

    @Override
    public void roam() {
        System.out.println(getName()+ " is roaming...🚗");
    }
}
