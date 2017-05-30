package ui;
import vo.*;
import java.util.*;
import method.*;
/**
 * Created by 空灵骑圣 on 2017/4/17.
 */
public class clearFunds {

    public clearFunds(ArrayList<currentAccount> account){

        int accNo;
        int i = 0;
        Scanner sc = new Scanner(System.in);

        while (i==0){

            System.out.println("Please input your account number: ");

            accNo = sc.nextInt();

            for (currentAccount acc:account){
                if (accNo == acc.getAccNo()){

                    i=1;

                    if (acc.isSp()){

                        System.out.println("Your account has been suspended");
                        break;

                    }
                    else {
                        clearFund cf = new clearFund();
                        account.remove(acc);
                        cf.clearFund(acc);
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
