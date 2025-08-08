package entity.Animal;

import entity.Birds.Parrot;

import static java.lang.Character.getName;

public class FlyMain {
    public static void main(String[] args) {
        Flyable chirp = (name,add) -> System.out.println(name + " is a Software Developer...  and is from " +add);
        chirp.chirp("Sumit","Jammu");

    }
}
