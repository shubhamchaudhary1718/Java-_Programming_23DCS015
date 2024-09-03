interface AdvancedArithmetic {
    int divisor_sum(int n);
}
class MyCalculator implements AdvancedArithmetic {

    public int divisor_sum(int n) {
        int sum = 0;
        
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {  
               sum += i;
            }
        }
        return sum;
    }
}


public class Prac22 {
    public static void main(String[] args) {
        MyCalculator calculator = new MyCalculator();
        
        
        int number = 5; 
        int result = calculator.divisor_sum(number);
        System.out.println("The sum of divisors of " + number + " is: " + result);
    }
}
