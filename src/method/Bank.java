package method;
import vo.*;
import java.util.ArrayList;

/**
 * Created by 空灵骑圣 on 2017/4/17.
 */
public class Bank {


    public void opAccount(currentAccount acc, ArrayList<currentAccount> account){
        account.add(acc);
        System.out.println("Account number: "+acc.getAccNo());
        System.out.println("Account type: "+acc.getClass().getSimpleName());
        System.out.println("Account pin: "+acc.getPin());
    }

    public void clAccount(currentAccount acc, ArrayList<currentAccount> account){

        account.remove(acc);
        System.out.println("You have successfully close the account: "+acc.getAccNo());

    }

    public void update(ArrayList<currentAccount> account){
        for (currentAccount acc:account){
            if (acc.getBalance()<0){
                System.out.println(acc.getName()
                        + " is in overdraft, a letter is sent");
            }
        }


    }

    public int accountType(currentAccount acc){
        //return 1 for Saver account; return 2 for Junior account; return 3 for Current account

        if (acc.getClass().getName() == "vo.saverAccount"){
            return 1;
        }
        else if (acc.getClass().getName() == "vo.juniorAccount"){
            return 2;
        }
        else return 3;


    }










}
