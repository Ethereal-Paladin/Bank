package ui;
import vo.*;
import java.util.*;
import method.*;

/**
 * Created by 空灵骑圣 on 2017/4/17.
 */
public class withdrawFunds {

    public withdrawFunds(ArrayList<currentAccount> account){


        int accNo;
        int pin;
        double amount = 0.0;
        int i = 0;
        int flag = 1;
        int date = 0;
        Scanner sc = new Scanner(System.in);

        while (i==0){

            System.out.println("Please input the account number: ");
            accNo = sc.nextInt();
            System.out.println("Please input the pin: ");
            pin = sc.nextInt();

            for (currentAccount acc: account){
                if (acc.getAccNo() == accNo && acc.getPin() == pin){
                    i = 1;

                    if (acc.isSp()){

                        System.out.println("Your account has been suspended");
                        break;

                    }
                    else {

                        
                        if (acc.getClass().getName() == "vo.saverAccount"){
                            System.out.println("0. Notice to withdraw");
                            if (acc.withdrawalCheck()){
                                System.out.println("1. Withdraw");
                            }



                        }
                        else System.out.println("1. Withdraw");

                        flag = sc.nextInt();
                        if (flag == 1){
                            account.remove(acc);
                            System.out.println("Please input how much you want to withdraw: ");
                            amount = sc.nextInt();
                            if (acc.getClass().getName() == "vo.currentAccount"){
                                withdrawAccountCheck wck = new withdrawAccountCheck();
                                if (wck.withdrawCheck(amount,acc)){
                                    acc.withdraw(amount);
                                    account.add(acc);
                                    System.out.println("You have enough quota, so you can still withdraw "+amount+" dollars");

                                }
                                else System.out.println("Out of quota");


                            }else {
                                acc.withdraw(amount);
                                account.add(acc);

                            }



                            break;




                        } else if (flag==0){
                            account.remove(acc);
                            System.out.println("Please enter the days before you want to withdraw: ");
                            date = sc.nextInt();
                            acc.requestWithdrawal(date);
                            account.add(acc);
                            break;





                        }

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
