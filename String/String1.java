import java.util.Scanner;

class String1
{
    public static void main(String args[])
    {
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter the first name");
      String F=sc.nextLine();
      System.out.println("Enter the Last name");
      String S=sc.nextLine();
      String a = F.substring(0, 1);
      String b = F.substring(1, F.length());
      a=a.toUpperCase();
      b=b.toLowerCase();
      String First=a+b;
      
      String c=S.toUpperCase();
      String name=First+c;
      System.out.println(name);
    }
}