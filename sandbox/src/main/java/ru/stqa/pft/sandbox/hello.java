package ru.stqa.pft.sandbox;

public class hello {
    public static void main(String[] args)

{System.out.println("Hello, world!");
    System.out.println(2*2);
    System.out.println(1.0/2);

    Square s = new Square(5);
    System.out.println("Площадь квадрата со стороной " + s.l + " = " + area(s));


}

public static double area(Square s){
        return s.l * s.l;
}
}
