package Interfaces;

import entity.Animal.FlyMain;
import jdk.dynalink.Operation;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
       MathOperation add = (a,b) -> a + b;
       MathOperation sub = (a,b) -> a - b;
        MathOperation mul = (a,b) -> a * b;
        MathOperation div = (a,b) -> a / b;
        MathOperation a = Integer::sum;
                ;
        Consumer<String> print = (name) -> System.out.println(name);
        print.accept("Welcome");

        Predicate<Integer> EVEN = (n) -> n%2==0;
        System.out.println(EVEN.test(4));
        System.out.println(EVEN.test(7));

        Supplier<Double> getRandom = () -> Math.random();
        System.out.println(getRandom.get());

        Supplier<Double> rand = Math::random;

        System.out.println("Addition: " +a.operate(100,20));
        System.out.println("Subtraction: " +sub.operate(100,20));
        System.out.println("Multiplication: " +mul.operate(10,20));
        System.out.println("Division: " +div.operate(200,80));

    }
}
