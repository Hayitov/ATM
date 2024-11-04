package com.abdibrokhim;

import java.io.IOException;
import java.util.Objects;

public class Paper {
    public static void paper() throws IOException {
        System.out.println("\nAutomated teller machine");
        System.out.println("\nYour name : " + Account.client.get(0));
        System.out.println("Your Card Number: " + Account.client.get(1));
        System.out.println("Your Card Pin Code: " + Account.client.get(2));
        System.out.println("Your Balance: " + Account.client.get(3));
        System.out.println("Operation is done" + Account.client.get(4));
        System.out.println("\nWithdraw Cash: " + (Integer.parseInt(Account.client.get(3)) - Integer.parseInt(Account.client.get(5))));
        System.out.println("Reminder: " + Account.client.get(5));
        System.out.println("\n");

        for(int i=0; i<10; i++)
        {
            if(Objects.equals(Account.client.get(4), Integer.toString(i)))
            {
                GFG.clCash.set(i, Account.client.get(5));
            }
        }
        Account.client.remove(3);
        Account.client.remove(3);
        GFG.writeFileBalance(GFG.clCash);
    }
}
