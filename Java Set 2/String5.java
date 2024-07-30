public class String5 {
    public static void main(String[] args) {
        String str = "CHARUSAT UNIVERSITY";

        int length = str.length();
        System.out.println("Length of the string: " + length);
        
        char firstLetterOfYourName = 'S';
        String replacedStr = str.replace('H', firstLetterOfYourName);
        System.out.println("String after replacing 'H' with '" + firstLetterOfYourName + "': " + replacedStr);

        String lowerCaseStr = str.toLowerCase();
        System.out.println("Lowercase of the string: " + lowerCaseStr);
        System.out.println("23DCS015 SHUBHAM CHAUDHARY");
    }
}
