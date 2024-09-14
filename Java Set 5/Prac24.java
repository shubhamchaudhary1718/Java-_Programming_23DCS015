import java.util.Scanner;

public class Prac24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
          
            System.out.print("Enter the value of x: ");
            int x = Integer.parseInt(scanner.nextLine());

            
            System.out.print("Enter the value of y: ");
            int y = Integer.parseInt(scanner.nextLine());
            
          
            int result = x / y;
            
           
            System.out.println("The result of " + x + " / " + y + " = " + result);
        } 
        catch (NumberFormatException e) {
            System.out.println("Input is not a valid integer.");
        } 
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        } 
        finally {
            scanner.close();  
        }
    }
}
