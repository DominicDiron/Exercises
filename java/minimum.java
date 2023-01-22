/*
Problem:
John has to travel to another place. For this, he can book any one of two cab services.

The first cab service charges X rupees.
The second cab service charges Y rupees.
Chef wants to spend the minimum amount of money. Which cab service should Chef take?

*/

import java.util.Scanner;
class minimum
{
    public static void main(String []args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the cost for First Cab : ");
        Double First_Cab = input.nextDouble();

        System.out.print("Enter the cost for Second Cab : ");
        Double Second_Cab = input.nextDouble();

        if(First_Cab == Second_Cab)
        {
            System.out.print("You can select any one of those two cabs the costs are same for your destination");
        }
        else if(First_Cab < Second_Cab)
        {
            System.out.print("You can Choose FIRST CAB");
        }
        else
        {
            System.out.print("You can Choose SECOND CAB");
        }
    }
}