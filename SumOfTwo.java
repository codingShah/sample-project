import java.util.Scanner;
public class SumOfTwo{
public static void main(String[] args){
Scanner sc = new Scanner(System.in); //creating an object
System.out.println("Enter first number");
int a = sc.nextInt();

System.out.println("Enter second number");
int b = sc.nextInt();
int sum = a+b;
System.out.println("Sum of two numbers is " +sum);

}
}