package Animal;

public class Animal {

    private String name;

    public Animal(){}

    public Animal(String Name)
    {
        this.name = Name;
        System.out.println(Name);
    }

    public void eat()
    {
        System.out.println(name+ "is Hungry");
    }
    public void makeNoise()
    {
        System.out.println(name+ "is Roaring");
    }
    public void sleep()
    {
        System.out.println(name+ " is Sleeping");
    }
    public void roam()
    {
        System.out.println(name+ " is roaming");
    }

    public void display()
    {
        this.getName();
        this.eat();
        this.sleep();
        this.roam();
        this.makeNoise();
    }

    public void getName() {
        System.out.println(name);
    }

    public void setName(String name) {
        this.name = name;


    }
}
