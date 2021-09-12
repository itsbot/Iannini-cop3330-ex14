/*
 *  UCF COP3330 Fall 2021 Exercise 14 Solution
 *  Copyright 2021 Patrick Iannini
 */
package Exercise14;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise14 {
    public static void main(String[] args) {
        System.out.println("What is the order amount? ");
        Scanner sc = new Scanner(System.in);
        double amount = Double.parseDouble(sc.next());

        System.out.println("What is the state?");
        String stateIn = sc.next();

        String[] stateTax = {"WI", "WISCONSIN"};
        DecimalFormat df = new DecimalFormat("0.00");
        df.setRoundingMode(RoundingMode.HALF_UP);
        double total = amount;

        if (Arrays.asList(stateTax).contains(stateIn.toUpperCase())) {
            double wiTax = 0.055;
            double tax = amount*wiTax;
            total = amount+tax;
            System.out.println("The subtotal is $"+df.format(amount)+"\n"+"The tax is $"+df.format(tax));
        }
        System.out.println("The total is $"+df.format(total));
    }
}
