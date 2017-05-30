package ui;
import vo.*;
import java.util.*;
/**
 * Created by 空灵骑圣 on 2017/4/17.
 */
public class closeAccount {

    public closeAccount(ArrayList<currentAccount> account){

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
                        break;

                    }
                    else {
                        account.remove(acc);
                        if (!acc.checkClose()){
                            account.add(acc);
                            System.out.println("You can't close your account because there're funds in your account");

                        }
                        else System.out.println("Your account has been successfully closed");




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
