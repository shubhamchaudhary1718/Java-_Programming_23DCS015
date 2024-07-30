class Parent {
    void printMessage() {
        System.out.println("This is parent class");
    }
}

class Child extends Parent {
    void printChildMessage() {
        System.out.println("This is child class");
    }
}

public class Prac17 {
    public static void main(String[] args) {
        
        Parent parentObj = new Parent();
        parentObj.printMessage();

        Child childObj = new Child();
        childObj.printChildMessage();
    }
}
