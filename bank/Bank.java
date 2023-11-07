package bank;

import java.util.Scanner;

public class Bank {
    Scanner so = new Scanner(System.in); // use for taking user input "so" object banaya hai
    static int customerId = 1040;
    static int bankId = 1050;
    static int cbal = 1000; // use for customer check balance // ISME ABHI CUSTOMER KI LIMIT SET KI HAI 1000
                            // KI YEH USKA BALANCE HAI

    static int bbal = cbal;// use for bank check balance

    public static void bankbalance() // yeh function hai isme bank balance check kar sakte hai

    {
        System.out.println("Enter a bank id for access a bank balance ");
        Scanner sp = new Scanner(System.in);
        int bankid = 9753;
        int bchoi = sp.nextInt();
        if (bchoi == bankid) {
            System.out.print("Bank Balance =  " + bbal);
        } else {
            System.out.println("Invalid Bank Id ");
        }
    }

    public static void customerbalance() // yeh function hai isme customer balance check kar sakte hai
    {
        System.out.println("Enter a customer id for access a bank balance ");
        Scanner si = new Scanner(System.in);
        int custid = 8839;
        int custchoi = si.nextInt();
        if (custchoi == custid) {
            System.out.print("Customer Balance =  " + cbal);
        } else {
            System.out.println("Invalid Customer Id");
        }
    }

    static public void deposit() // is function se customer deposit kar sakta hai bank me
    {
        Scanner su = new Scanner(System.in);
        int custidchoi = su.nextInt();

        if (custidchoi == customerId) {
            System.out.println("Enter a amount for deposit in bank ! ");
            int d = su.nextInt();
            System.out.println("Customer deposit the fund =  " + d);
            cbal = cbal + d;
            bbal = bbal + d;
            System.out.println("Current Balance in your account = " + cbal);
        } else {
            System.out.println("Invalid Customer Id");
        }
    }

    static public void withdrawn() // is function se customer withdrawn kar sakta hai bank me
    {

        Scanner sy = new Scanner(System.in);
        int wchoicustid = sy.nextInt();

        if (wchoicustid == customerId) {
            System.out.println("Enter a amount for withdrawn in bank ! ");
            int wchoi = sy.nextInt();

            if (wchoi < cbal) {
                System.out.println("Customer Withdrawn the fund = " + wchoi);
                cbal = cbal - wchoi;
                bbal = bbal - wchoi;
                System.out.println("Current Balance in your account = " + cbal);
            } else
                System.out.println("Insufficient Fund ");

        } else
            System.out.println("Invalid Customer Id");

    }

    public void show() {
        int buid = 1050;
        int cuid = 1040;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a customer id or bank id: ");
        int cid = sc.nextInt();

        if (cid == cuid || cid == buid) {
            int choice;

            do {
                System.out.println(
                        "                                                        Welcome To Saksham Jain Bank            ");
                System.out.println("1. Check Bank Balance (Only For Bank Employee). ");
                System.out.println("2. Check Customer Balance. ");
                System.out.println("3. Deposit Balance. ");
                System.out.println("4. Withdrawn Balance. ");
                System.out.println("5. EXIT. ");
                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        Bank.bankbalance();
                        break;
                    case 2:
                        Bank.customerbalance();
                        break;
                    case 3:
                        Bank.deposit();
                        break;
                    case 4:
                        Bank.withdrawn();
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
