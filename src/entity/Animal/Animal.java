package entity.Animal;

public abstract class Animal {

    private String name;

    public Animal(){}

    public Animal(String Name)
    {
        this.name = Name;
    }

//    public void eat()
//    {
//        System.out.println(name+ " is Hungry");
//    }

    public abstract void eat();

//    public void makeNoise()
//    {
//        System.out.println(name+ " is Roaring");
//    }

    public abstract void makeNoise();
    public void sleep()
    {
        System.out.println(name+ " is Sleeping....😴");
    }
//    public void roam()
//    {
//        System.out.println(name+ " is roaming");
//    }

    public abstract void roam();

    public void display()
    {
        this.getName();
        this.eat();
        this.sleep();
        this.roam();
        this.makeNoise();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
