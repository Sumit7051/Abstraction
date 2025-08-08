package entity.Animal;

public class Cat extends Animal{

    public Cat(String Name) {
        super(Name);
    }

    public void talk(Animal animal)
    {
        System.out.println(getName()+ "Meow Meow");
    }

    @Override
    public void eat() {
        System.out.println();
    }

    @Override
    public void makeNoise() {

    }

    @Override
    public void roam() {

    }

//    public void Sum(int... args)
//    {
//        int sum = 0;
//        for (int i = 0; i < args.length; i++) {
//            sum = Integer.parseInt(String.valueOf(args[i]));
//            sum+= sum;
//        }
//        System.out.println("Sum: " +sum);
//    }

    public void Sum(String[] args) {
        int sum = 0;
        for (int i = 0; i < args.length; i++) {
            sum = Integer.parseInt(String.valueOf(args[i]));
            sum+= sum;
        }
        System.out.println("Sum: " +sum);
    }

    public void add(int... a)
    {
        int sum =0;
        for(int Num: a)
        {
            sum+= Num;
        }
        System.out.println("Sum: " +sum);
    }
}
