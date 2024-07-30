public class String1 {
    public static void main(String[] args) {
        System.out.println(frontTimes("Chocolate", 2)); 
        System.out.println(frontTimes("Chocolate", 3)); 
        System.out.println(frontTimes("Abc", 3)); 
System.out.println("23DCS015 SHUBHAM CHAUDHARY");
    }
    public static String frontTimes(String str, int n) {
         String front;
        if (str.length() >= 3) {
            front = str.substring(0, 3);
        } else {
            front = str;

         }
         String result = "";
        for (int i = 0; i < n; i++) {
            result += front;
          
        }
      
        return result;
    }
}
