package vo;
import java.util.*;

/**
 * Created by 空灵骑圣 on 2017/4/17.
 */
public class test {

    public static void main(String[] args){

        ArrayList<currentAccount>  c = new ArrayList<currentAccount>();

        saverAccount a = new saverAccount("aa","ss","1996",111,111);

        c.add(a);
        for (currentAccount d:c){

            System.out.println(d.getClass().getName());

        }


        System.out.println(a.getName());
        System.out.println(a.getAccNo());
        System.out.println(a.getAddress());
        System.out.println(a.getBirth());
        System.out.println(a.getBalance());
        System.out.println(a.getPin());

        System.out.println(a.getClass().getSimpleName());
        if (a.getClass().getSimpleName().equals("saverAccount")){

            System.out.println("Ok...........");
        }








        a.requestWithdrawal(0);
        if(!a.withdrawalCheck()){

            System.out.println("Not Allowed");

        }
        else System.out.println("Allowed");






    }
}
