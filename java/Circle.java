/*
Problem:
Write a Java program to print the area and perimeter of a circle

*/
import java.util.Scanner;
class circle
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter radius");
        double radius = input.nextDouble();

        if(radius<0)
        {
            System.out.println("invalid input");
            radius = 0;
        }
        double area = (22*radius*radius)/7;
        double perimeter = (2*22*radius)/7;

        System.out.println("Area = "+area);
        System.out.println("Perimeter = "+perimeter);

    }
}