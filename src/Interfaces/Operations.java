package Interfaces;

public class Operations implements MathOperation{
    @Override
    public int operate(int a, int b) {
        return 0;
    }


    /*    @Override
    public int operate(int a, int b) {
        try{
            if(b == 0)
            {
                System.out.println("Divide by zero");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return a/b;
    }
    @Override
    public int addition(int a , int b)
    {
        return a+b;
    }
    @Override
    public int subtraction(int a , int b)
    {
        return a-b;
    }
    @Override
    public int multiply(int a , int b)
    {
        return a*b;
    }
    @Override
    public void display()
    {
        System.out.println("Division: " +operate(90,5) +" | Addition: "+addition(1250,5432) +" | Subtraction: "+subtraction(2698,785) + " | Multiplication: "+multiply(27,27));
    }
     */
}
