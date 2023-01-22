/*
Problem:
You are given N integers length array by the user. Find the maximum number

*/
import java.util.Arrays;
import java.util.Scanner;
class maximum
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        System.out.print("how many elements do you need in array ? ");
        int length = input.nextInt();
        int array[] = new int[length];

        for(int i=0;i<length;i++)
        {
            array[i] = input.nextInt();
        }

        Arrays.sort(array);
        System.out.println("Maximum is : "+array[length-1]);
    }
}