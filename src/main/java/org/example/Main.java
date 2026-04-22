package org.example;
public class Main {
    int sum(int a, int b)
    {
        return a+b;
    }
    int diff(int a, int b)
    {
        return a-b;
    }
    int multi(int a, int b)
    {
        return a*b;
    }
    int div(int a, int b)
    {
        return a/b;
    }
    public static void main(String[] args) {
        Main calc = new Main();
        System.out.println("Sum is "+calc.sum(20, 10));
        System.out.println("Sum is "+calc.diff(20, 10));
        System.out.println("Sum is "+calc.multi(20, 10));
        System.out.println("Sum is "+calc.div(20, 10));
    }
}
