public class String2 {
    public static int count9(int[] arr){
         int c=0;
        for(int i=0;i<arr.length;i++)
        {
        if(arr[i]==9) {
        c++;
            }
        }
        return c;
        }
        public static void main(String[] args)
        {
        int[] arr1 = {1,9,2,5};
        int p = count9(arr1);
        System.out.println(p);
System.out.println("23DCS015 SHUBHAM CHAUDHARY");
        }
    }
