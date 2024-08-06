class Rectangle {
    
    protected double length;
    protected double breadth;

    
    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }


    public void printArea() {
        double area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }


    public void printPerimeter() {
        double perimeter = 2 * (length + breadth);
        System.out.println("Perimeter of Rectangle: " + perimeter);
    }
}

class Square extends Rectangle {
    
    public Square(double side) {
        super(side, side);
    }
}

public class Prac19 {
    public static void main(String[] args) {
      
        Rectangle[] shapes = new Rectangle[2];
        shapes[0] = new Rectangle(1, 3);
        shapes[1] = new Square(4);
        

        for (Rectangle shape : shapes) {
            shape.printArea();
            shape.printPerimeter();
            System.out.println(); 
        }
    }
}
