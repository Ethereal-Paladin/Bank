package ui;

import vo.*;
import java.util.*;
import method.*;

/**
 * Created by 空灵骑圣 on 2017/4/17.
 */
public class openAccount {


    String name;
    String address;
    String birth;
    int accNo;
    int pin;

    public openAccount(ArrayList<currentAccount> account){
        Scanner sc = new Scanner(System.in);
        int i = 0;

        while (i==0){
            System.out.println("Please fill in your name: ");
            name = sc.nextLine();
            System.out.println("Please fill in your address: ");
            address = sc.nextLine();
            System.out.println("Please fill in your date of birth: ");
            birth = sc.nextLine();

            currentAccount acc = new currentAccount(name, address, birth, accNo, pin);

            duplicationCheck dc = new duplicationCheck();
            accNo = dc.accnocheck(account);
            pin = dc.pinCheck(account);


            accountCk acck = new accountCk();

            if (acck.accCheck()){
                juniorCheckTest check = new juniorCheckTest();

                System.out.println("Please choose the type of account you want to create: ");
                System.out.println("1. Saver account");




                if (check.juniorAccountCheck(acc)){
                    System.out.println("2. Junior account");
                    System.out.println("3. Current account");
                }
                else System.out.println("2. Current account");

                System.out.println("0. Exit and back home");
                int choose;

                choose = sc.nextInt();
                Bank bk = new Bank();

                switch (choose){
                    case 1:
                        acc = new saverAccount(name, address,birth, accNo, pin);
                        bk.opAccount(acc, account);
                        break;
                    case 2:
                        acc = new juniorAccount(name, address,birth, accNo, pin);
                        bk.opAccount(acc, account);
                        break;
                    case 3:
                        acc = new currentAccount(name, address,birth, accNo, pin);
                        bk.opAccount(acc, account);
                        break;
                    case 0:
                        break;


                }







                i = 1;
            }


            if (i==0){
                System.out.println("Your information is uncredited");
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
