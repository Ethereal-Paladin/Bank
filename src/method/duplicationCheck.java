package method;
import vo.*;


import java.util.ArrayList;

/**
 * Created by michaeltang on 2017/5/7.
 */
public class duplicationCheck {

    public int accnocheck(ArrayList<currentAccount> accounts){
        int k;
        int accNo;

        do {

            accNo = (int)(Math.random()*1000000);
            k = 0;

            for (currentAccount acc: accounts){

                if (acc.getAccNo() == accNo){

                    k = 1;

                }
            }


        }while (k == 1);

        return accNo;




    }


    public int pinCheck(ArrayList<currentAccount> accounts){


        int k;
        int pin;

        do {

            pin = (int)(Math.random()*1000000);
            k = 0;

            for (currentAccount acc: accounts){

                if (acc.getPin() == pin){

                    k = 1;

                }
            }


        }while (k == 1);

        return pin;



    }



}
