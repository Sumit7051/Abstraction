package entity.Birds;

import entity.Animal.Flyable;

public class Parrot extends Bird implements Flyable {
    @Override
    public void chirp(String name, String address) {
//        System.out.println(name+ "| " +address);
    }

    public Parrot(String Name) {
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

//    @Override
    public void chirp() {
        System.out.println(getName()+ " is Chirping...");
    }

}
