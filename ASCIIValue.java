//print the ASCII value of the character 
import java.util.Scanner;
public class ASCIIValue
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the character:");

        char ch=sc.next().charAt(0);
        int asciivalue=ch;
        System.out.println("ASCII value "+ ch + " is:"+asciivalue);
    }
}