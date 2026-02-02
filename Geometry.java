package org.javaturk.ipj.ch01;

public class Geometry{

    class Circle {
        double pi = 3.14;
        double pi2 = 3;

        public double areaCalculatorCircle(double radius) {
            double area = (radius * radius) * pi;
            return area;

        }

        public double circumferenceCalculatorCircle(double radius) {
            double circumference = (2 * pi * radius);
            return circumference;


        }
    }
    class Rectangle{
        int length;
        int width;

        public int areaCalculatorRectangle (int length, int width){

            return length * width;

        }


        public int circumferenceCaclulatorRectangle(int length, int width){
            return (length + width) * 2;

        }


    }



    }

















