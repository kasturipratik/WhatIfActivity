package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        String custName,taxCode;
        double salesAmount,totalAmount;
        double salesTax =0.0;
        int custNumber;


        System.out.println("*******************Sales Record**************** " +
                "\n::::::::::::::::::::::::::::::::::::::::::::");
        System.out.println("Please Enter Customer Name: " );
        custName = scan.nextLine();

        System.out.println("Please Enter Customer Number: ");
        custNumber = scan.nextInt();
        scan.nextLine();

        System.out.println("Please Enter Sales Amount: ");
        salesAmount= scan.nextDouble();
        scan.nextLine();

        System.out.println("Please Enter Tax Code (NRM, NPF, BIZ) :");
        taxCode = scan.nextLine();
        String upper =taxCode.toUpperCase();


        if(upper.equals("NRM"))
        {
            salesTax = (salesAmount * 6)/100;
        }
        else if(upper.equals("NPF"))
        {
            salesTax =(salesAmount*0)/100;
        }
        else if (upper.equals("BIZ"))
        {
            salesTax=(salesAmount*4.5)/100;
        }
        else
        {
          salesTax =0;
        }

        totalAmount = salesAmount + salesTax;
        System.out.println("::::::::::::::::::::::::::::::::");
        System.out.println("Customer ID: "+ custNumber
                             +"\nCustomer Name: "+ custName+
                              "\nSales Amount: "+ salesAmount+
                              "\nTax Code: "+ upper+
                                "\nTotal Amount Due: "+ totalAmount);

    }
}
