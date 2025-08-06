package Birds;

public class Ostrich extends Bird {

    public Ostrich(String Name) {
        super(Name);
    }

    @Override
    public void fly() {
        System.out.println(getName()+ " is flying.....🪰");
    }

    @Override
    public void eat() {
        System.out.println(getName()+ " is eating.....🍽️");
    }

    @Override
    public void makeNoise() {
        System.out.println(getName()+ " is chirping....🐣");
    }

    @Override
    public void roam() {
        System.out.println(getName()+ "is roaming....🏝️");
    }
}
