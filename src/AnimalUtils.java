import Animal.Animal;
import Animal.Dog;
import Animal.Lion;
public class AnimalUtils  {

    public void addAnimal(Animal animal)
    {
        System.out.println("Animal added: " +animal.getName());
        if(animal instanceof Lion)
        {
            Lion l = (Lion)animal;
            l.jump();
            l.eat();
        } else if (animal instanceof Dog) {
            Dog dog = (Dog)animal;
            dog.roam();
            dog.makeNoise();
        }
    }

}
