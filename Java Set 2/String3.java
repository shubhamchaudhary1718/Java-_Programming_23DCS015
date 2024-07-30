public class String3
{
static String double_char(String s)
{
String s2 = new String();
int n = s.length();
for(int i = 0;i<n;i++)
{
s2 += s.substring(i,i+1) + s.substring(i,i+1);
}
return s2;
}
public static void main(String[] args)
{
String s = "There";
System.out.println(s);
String s2 = new String();
s2 = double_char(s);
System.out.println(s2);
System.out.println("23DCS015 SHUBHAM CHAUDHARY");
}
}
