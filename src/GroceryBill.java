import java.util.Arrays;
import java.util.Scanner;
public class GroceryBill {

    private static String sum;

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double[] weeklyBills = new double[4];
        double[] monthlyTotal = new double[]{0.0};
        double[] weeklyAverage =  new double[]{0.0};


        //Prompt for coupon amount
        System.out.print("Enter coupon amount as a decimal: ");
        double coupon = scnr.nextDouble();

        //Validate coupon amount
        if (coupon <= 0 || coupon > 1) {
            System.out.println("Invalid coupon amount. Default to 10%.");
            coupon = .10;
        }
        //Prompt for weekly grocery bills and calculate total
        for (int i = 0; i < weeklyBills.length; i++) {
            System.out.print("Enter weekly bill amount: ");
            weeklyBills[i] = scnr.nextDouble();
        }
        //Calculate weekly average
        weeklyAverage[0] = (weeklyBills [0] + weeklyBills[1] + weeklyBills[2] + weeklyBills[3]) / weeklyBills.length;
        double total = 0.0;

        for (int i = 0; i < weeklyBills.length; i++) {
            total += weeklyBills[i]; // Add each bill to the total
        }
        double average = total / 4;
            // Divide total by number of bills
            System.out.println("Weekly Average is $" + average); // prints the actual number

        //Display results without coupon
        monthlyTotal = new double[]{weeklyBills[0] + weeklyBills[1] + weeklyBills[2] + weeklyBills[3]};
        weeklyAverage = monthlyTotal;
            System.out.println("Average Total weekly bill without coupon: $" + weeklyAverage[0]/4);
            System.out.println("Total weekly bills this month without coupon: $" + weeklyAverage[0]);

            //Apply coupon
            double[] difference = new double[weeklyBills.length];
        int i;
        for (i = 0; i < weeklyBills.length; i++) {

            }

            // Display results with coupon
            //Assuming coupon is a percentage discount (e.g., 0.10 for 10%)
        monthlyTotal[0] = monthlyTotal[0] * (1 - coupon);
            System.out.println("Discount Applied: " + (coupon * 100) + "%");
            System.out.println("Discounted Monthly Total: $" + monthlyTotal[0]);
        weeklyAverage[0] = monthlyTotal[0]/weeklyBills.length;
            System.out.println("Discounted Weekly Average: $" + weeklyAverage[0]);
        }
    }
