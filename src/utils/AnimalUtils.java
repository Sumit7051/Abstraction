package utils;

import entity.Animal.*;
import entity.Birds.Parrot;

public class AnimalUtils {

    public void addAnimal(Animal animal)
    {
//        System.out.println("Animal" +animal.getName());
        if(animal instanceof Lion)
        {
            Lion l = (Lion)animal;
            l.jump();
            l.eat();
        } else if (animal instanceof Dog) {
            Dog dog = (Dog)animal;
            dog.roam();
            dog.makeNoise();
        } else if (animal instanceof Parrot) {
            Parrot p = (Parrot)animal;
            p.chirp();
        } else if (animal instanceof Fish) {
            Fish f = (Fish)animal;
            f.swimming();
        }
    }
}
