package ru.stqa.pft.sandbox;

import org.testng.annotations.ITestAnnotation;

public class SquareTests {

    @ITestAnnotation
    public void testArea() {
        Square s = new Square(5);
        assert s.area() ==25
    }
}
