/*
Problem:
You are given N integers between 1 and 50. Find the count of numbers divisible by K.

Input Format
The input begins with two positive integers N, K. The next N lines contains one positive integer numbers
​
Output Format
Output a single number denoting how many integers are divisible by K.

*/
import java.util.Scanner;

public class DivCount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Total number n : ");
        int n = input.nextInt();

        System.out.print("Divider k : ");
        int k = input.nextInt();

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (i % k == 0) {
                count++;
            }
        }
        System.out.println(count+ " numbers can be devided by "+k);
    }
}
