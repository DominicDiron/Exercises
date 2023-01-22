/*
Problem:
Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.

*/
import java.util.Scanner;
class calculator
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number-1 : ");
        double a = input.nextDouble();

        System.out.print("Enter number-2 : ");
        double b = input.nextDouble();

        // Addition
        System.out.println(a+" + "+b+" = "+(a+b));

        //Multiplication
        System.out.println(a+" x "+b+" = "+(a*b));

        //Subtraction
        System.out.println(a+" - "+b+" = "+(a-b));

        //Division
        if(b==0)
        {System.out.println("division can not be performed because number-2 is 0");}
        else
        {System.out.println(a+" / "+b+" = "+(a/b));}
    }
}


