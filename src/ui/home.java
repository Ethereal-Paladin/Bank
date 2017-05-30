package ui;
import vo.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by 空灵骑圣 on 2017/4/17.
 */
public class home {

    public home(ArrayList<currentAccount> account){

        int choose;

        System.out.println("\nWelcome to our bank");
        System.out.println("Please input the following number if you want to use the following services");
        System.out.println("1. Open Account");
        System.out.println("2. Deposit Funds");
        System.out.println("3. Clear Funds");
        System.out.println("4. Withdraw Funds");
        System.out.println("5. Suspend Funds");
        System.out.println("6. Close Account");
        System.out.println("7. Exit");


        Scanner sc = new Scanner(System.in);

        choose = sc.nextInt();

        switch (choose){

            case 1:
                new openAccount(account);
                break;

            case 2:
                new depositFunds(account);
                break;

            case 3:
                new clearFunds(account);
                break;

            case 4:
                new withdrawFunds(account);
                break;

            case 5:
                new suspendFunds(account);
                break;

            case 6:
                new closeAccount(account);
                break;

            case 7:
                System.out.println("The system has been closed. Bye");
                break;















        }






    }


}
