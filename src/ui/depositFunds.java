package ui;
import vo.*;
import java.util.*;
import method.*;
/**
 * Created by 空灵骑圣 on 2017/4/17.
 */
public class depositFunds {

    public depositFunds(ArrayList<currentAccount> account){


        int accNo;
        double amount = 0.0;
        double amount1 = 0.0;
        int i = 0;


        Scanner sc = new Scanner(System.in);



        while (i==0){

            System.out.println("Please input the account number: ");
            accNo = sc.nextInt();
            for (currentAccount acc: account){

                if (acc.getAccNo() == accNo){
                    i = 1;
                    if (acc.isSp()){

                        System.out.println("Your account has been suspended");
                        break;

                    }
                    else {

                        account.remove(acc);

                        System.out.println("Please enter the money you want to deposit: ");
                        amount = sc.nextInt();
                        depositAmountCheck dc = new depositAmountCheck();
                        amount1 = dc.depositAmountCheck1(amount);
                        acc.deposit(amount1);
                        System.out.println("You have successfully deposit: "+amount1+" ,others are to be cleared");
                        account.add(acc);
                        break;

                    }





                }

            }

            if (i==0){
                System.out.println("You have enter the wrong account number");
                System.out.println("1. Try again");
                System.out.println("2. Exit and back home");
                if (sc.nextInt() == 2){

                    break;
                }

            }



        }

        new home(account);















    }



}
