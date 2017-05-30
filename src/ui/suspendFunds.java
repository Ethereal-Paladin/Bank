package ui;
import vo.*;
import java.util.*;
/**
 * Created by 空灵骑圣 on 2017/4/17.
 */
public class suspendFunds {

    public suspendFunds(ArrayList<currentAccount> account){

        int accNo;
        int i = 0;
        int pin;

        Scanner sc = new Scanner(System.in);

        while (i==0){

            System.out.println("Please input your account number: ");

            accNo = sc.nextInt();
            System.out.println("Please input the pin: ");
            pin = sc.nextInt();

            for (currentAccount acc:account){
                if (accNo == acc.getAccNo() && acc.getPin() == pin){

                    i=1;

                    if (acc.isSp()){

                        System.out.println("Your account has been suspended");
                        System.out.println("1. Resume");
                        System.out.println("2. Exit and back home");
                        if(sc.nextInt() == 1){
                            account.remove(acc);
                            acc.resume();

                            account.add(acc);
                        }



                        break;

                    }
                    else {
                        account.remove(acc);
                        acc.suspend();

                        account.add(acc);
                        System.out.println("Your account has been suspended");



                        break;
                    }

                }

            }

            if (i==0){
                System.out.println("You have enter the wrong account number or pin");
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
