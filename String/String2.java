import java.util.Scanner;
public class String2 {
    public static void main(String args[])
    {
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter the first player name");
      String F=sc.nextLine();
        String[] a=F.split("\\s");

        System.out.println("Enter the second player name");
        String X=sc.nextLine();
        String[] b=F.split("\\s");
        if(a[1].equals(b[1]))
        {
            System.out.println("Yes");  
        }
        else
        System.out.println("No"); 
    }   
}

