import java.util.Scanner;
public class sign
{
public static void main (String[] args)
{
Scanner s = new Scanner(System.in);
int x;
System.out.println("Enter any number :");
x=s.nextInt();
if(x>0){
System.out.println("The number is (positive)");
}
else{
System.out.println("The number is (negative)");
}
}
}