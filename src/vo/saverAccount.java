package vo;

import java.util.*;

/**
 * Created by 空灵骑圣 on 2017/4/17.
 */
public class saverAccount extends currentAccount implements withdrawalNotice {

    long datetime = 0L;
    int date = 3;


    public saverAccount(){
        super();

    }

    public saverAccount(String name, String address, String birth, int accNo, int pin){

        super(name, address, birth, accNo, pin);


    }



    public void withdraw(double amount) {
        if (check(amount)&&withdrawalCheck()) {
            setBalance(getBalance() - amount);
            System.out.println("Withdraw " + amount + " successfull.");
        }
    }








    @Override
    public void requestWithdrawal() {
        Calendar calendar = Calendar.getInstance();
        datetime = calendar.getTime().getTime();


    }

    @Override
    public void requestWithdrawal(int datecheck) {
        Calendar calendar = Calendar.getInstance();
        datetime = calendar.getTime().getTime();
        date = datecheck;


    }

    @Override
    public boolean withdrawalCheck() {

        if(datetime != 0L){
            Calendar calendar = Calendar.getInstance();
            long nowDate = calendar.getTime().getTime();
            long betweenDate = (nowDate - datetime) / (1000 * 60 * 60 * 24);

            if ((int)betweenDate >=date){
                return true;

            }
            else return false;

        }

        else return false;




    }
}
