package PolymorphismMethodOverloading;

public class Figures {

// Polymorphism Method Overloading
    public void calculateSurface() {
    System.out.println("Find Surface ");
}
    public void calculateSurface(int r) {
        System.out.println("Circle Surface = "+3.14*r*r);
    }

    public void calculateSurface(double b, double h) {
        System.out.println("Triangle Surface="+0.5*b*h);
    }
    public void calculateSurface(int l, int b) {
        System.out.println("Rectangle Surface="+l*b);
    }


}

class Main {
    public static void main(String[] args) {
        Figures myShape = new Figures();  // Create a Shapes object

        myShape.calculateSurface();
        myShape.calculateSurface(5);
        myShape.calculateSurface(6.0,1.2);
        myShape.calculateSurface(6,2);

    }
}

