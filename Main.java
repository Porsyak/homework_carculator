package Homework_1;

public class Main {
    public static void main(String[] args) {

        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1,2);
        System.out.println(a);
        int b = calc.minus.apply(1, 1);
        System.out.println(b);
        int c = calc.divide.apply(a, b);
        calc.println.accept(c);


    }
}
