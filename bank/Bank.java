package bank;

import java.util.Scanner;

public class Bank {

    static int customerId = 1040;
    static int bankId = 1050;
    static int customerBalance = 1000; // use for customer check balance. ISME ABHI CUSTOMER KI LIMIT SET KI HAI 1000
    // KI YEH USKA BALANCE HAI

    static int bankBalance = customerBalance;// use for bank check balance

    public static void bankBalance() // yeh function hai isme bank balance check kar sakte hai

    {
        System.out.print("Bank Balance =  " + bankBalance);
    }

    public static void customerBalance() // yeh function hai isme customer balance check kar sakte hai
    {
        System.out.print("Customer Balance =  " + customerBalance);
    }

    static public void deposit() // is function se customer deposit kar sakta hai bank me
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a amount for deposit in bank ! ");
        int input = scan.nextInt();

        System.out.println("Customer deposit the fund =  " + input);
        customerBalance += input;
        bankBalance += input;

        System.out.println("Current Balance in your account = " + customerBalance);

    }

    static public void withdraw() // is function se customer withdraw kar sakta hai bank me
    {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a amount to withdraw from Bank: ");
        int input = scan.nextInt();

        if (input < customerBalance) {
            System.out.println("Customer withdrawed the fund = " + input);
            customerBalance -= input;
            bankBalance -= input;

            System.out.println("Current Balance in your account = " + customerBalance);
        } else
            System.out.println("Insufficient Fund ");

    }

    public void show() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a customer id or bank id: ");
        int input = scan.nextInt();

        if (input == customerId || input == bankId) {
            int choice;

            do {
                System.out.println(" Welcome To Saksham Jain Bank ");
                System.out.println("1. Check Bank Balance (Only For Bank Employee). ");
                System.out.println("2. Check Customer Balance. ");
                System.out.println("3. Deposit Balance. ");
                System.out.println("4. Withdrawn Balance. ");
                System.out.println("5. EXIT. ");
                choice = scan.nextInt();

                switch (choice) {
                    case 1:
                        Bank.bankBalance();
                        break;
                    case 2:
                        Bank.customerBalance();
                        break;
                    case 3:
                        Bank.deposit();
                        break;
                    case 4:
                        Bank.withdraw();
                        break;
                    case 5:
                        System.out.println("You have exited the program");
                        break;
                    default:
                        System.out.println("Invalid Choice ");
                }
            } while (choice != 5);
        } else
            System.out.println("Invalid Id");
    }
}
