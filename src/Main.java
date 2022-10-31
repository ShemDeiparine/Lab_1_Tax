//Shem Deiparine
//sdeipar1@umbc.edu

import java.util.*;


public class Main {
    public static void main(String[] args) {
       System.out.println("Welcome to the IS147 Payroll System in JAVA");
        System.out.println("Please follow the instructions provided on the screen");


        System.out.println("----------------------------------------------------");

        float taxrate = 0.10f;

        Scanner input = new Scanner(System.in);
        System.out.println("What is your name?:");
        String name = input.nextLine();
        System.out.println("What is you age?");
        int x = input.nextInt();
        System.out.println("Are you Full time(F) or Part time(P)?:");
        char pf = input.next().charAt(0);
        System.out.println("How many hours did you work this week?:");
        float hours = input.nextFloat();
        System.out.println("What is your hourly pay rate?:");
        float payrate = input.nextFloat();
        System.out.println("Vacation Request: True or False?:");
        boolean needvacation = input.nextBoolean();


        System.out.println("****************************************************");

        System.out.println("Hello " + name + " You are: " + x + " years old");
        System.out.println("Your employment status is:  " + pf);
        System.out.println("Vacation Request: " + needvacation);
        System.out.printf("Your tax rate: " + "%.2f" , taxrate);
        System.out.println();
        System.out.printf("You pay rate per hour is $" + "%.2f", payrate);
        System.out.println();
        System.out.printf("Hours Worked: " + "%.2f" , hours);
        System.out.println();
        System.out.printf("Gross Pay: $" + "%.2f" , payrate*hours);
        System.out.println();
        System.out.printf("Tax Paid: $" + "%.2f" , (payrate*hours)*taxrate);
        System.out.println();

        System.out.println("----------------------------------------------------");

        System.out.printf("Net Pay: $" + "%.2f" , (payrate*hours)-(payrate*hours)*taxrate);
        System.out.println();
        System.out.println("****************************************************");










    }
}