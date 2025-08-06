import Animal.Animal;
import Animal.*;
import Animal.Lion;
import Birds.*;
public class Main {

    public static void main(String[] args) {

     /*
       Animal animal = new Animal("Simba");
       animal.makeNoise();

       Lion lion = new Lion("Simba");
       lion.makeNoise();

       Animal an = new Lion("Mufasa");
       an.makeNoise();

       Lion l = (Lion)an;
       l.jump();
       l.roam();
       */

//        Animal an = new Animal("Mufasa");
//        Dog d = new Dog("Honey");
//        Lion l = new Lion("Mufasa");

/*
        AnimalUtils u = new AnimalUtils();
        u.addAnimal(l);
        u.addAnimal(d);
        Animal n = new Bat("Virat Kohli ");
        n.makeNoise();
 */

        // Alternate Method
     /*    Animal a = new Dog();
        a.setName("Billu");
        a.display();
        */
        System.out.println("---------Animals------");
    Dog d = new Dog("Dogesh");
    d.display();
    System.out.println("---------Birds------");
    Bird b = new Ostrich("Sunil");
    b.fly();
    b.display();
    }
}