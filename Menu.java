package com.abdibrokhim;

import java.io.IOException;
import static com.abdibrokhim.Main.sc;

public class Menu {
    public static void mainMenu() throws IOException
    {
        while (true) {
            System.out.println("\nYour mission is: \n");
            System.out.println("[1] -> To change pin");
            System.out.println("[2] -> To change your phone number");
            System.out.println("[3] -> To check your balance");
            System.out.println("[4] -> To withdraw cash");
            System.out.println("[5] -> To say goodbye!!!");
            System.out.print("\n[?] -> ");

            option();
        }
    }

    public static void option() throws IOException
    {
        int option = sc.nextInt();

        switch (option) {
            case 1 -> Pin.changePin();
            case 2 -> SMS.connectSms();
            case 3 -> Withdraw.showBalance();
            case 4 -> Withdraw.withdrawCash();
            case 5 -> Handle.exit();
            default -> Handle.error();
        }
    }
}