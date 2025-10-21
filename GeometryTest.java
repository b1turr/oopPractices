package org.javaturk.ipj.ch01;

public class GeometryTest {
    // the main idea: every student wants to learn how to learn the areas and circumferences of rectangle and circle
    // so the public class is course(geometry), then we have objects as students, then inner objects (circle, rectangle
    // and lastly, we have the methods for making calculations.
    // Note to Dear Akin Hocam, maybe I should've created the Student class after the Geometry class. (just maybe?)
    void main(){
    Geometry student = new Geometry(); // creating object from outer class
    Geometry.Circle circle1 = student.new Circle(); // now we created inner object by using outer object
    double areaCircle1 = circle1.areaCalculatorCircle(4.3);
    System.out.println("The area of first circle is: " + " " + areaCircle1);

    double circumferenceCircle1 = circle1.circumferenceCalculatorCircle(4.3);
    System.out.println("The circumference of first circle is: " + " " + circumferenceCircle1);



    Geometry.Rectangle rectangle1 = student.new Rectangle();
    double areaRectangle1 = rectangle1.areaCalculatorRectangle(25,10);
    System.out.println("The area of first rectangle is: " + " " + areaRectangle1);
    double circumferenceRectangle1 = rectangle1.circumferenceCaclulatorRectangle(25, 10);
    System.out.println("The area of first rectangle is: " + " " + circumferenceRectangle1);

    }




}