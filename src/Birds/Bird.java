package Birds;

import Animal.Animal;

public abstract class Bird extends Animal {

    public Bird(String Name) {
        super(Name);
    }

    public abstract void fly();
}
