package Homework_1;

import java.util.function.*;

public class Calculator {

    static Supplier<Calculator> instance = Calculator::new;


    BinaryOperator<Integer> plus = (x, y) -> x + y;

    BinaryOperator<Integer> minus = (x, y) -> x - y;

    BinaryOperator<Integer> multiply = (x, y) -> x * y;

    BinaryOperator<Integer> divide = (x, y) -> {
        int z = 0;
        try {z = x / y;}
        catch (ArithmeticException a){
            System.out.println("На ноль делить нельзя");
        }
        return z;
    };



    UnaryOperator<Integer> pow = x -> x * x;

    UnaryOperator<Integer> abc = x -> x > 0 ? x : x * -1;

    Predicate<Integer> isPositive = x -> x > 0;

    Consumer<Integer> println = System.out::println;



}
