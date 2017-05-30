package vo;

import java.io.*;
import method.*;

/**
 * Created by 空灵骑圣 on 2017/4/17.
 */
public class currentAccount implements withdrawalNotice,Serializable{

    private String name;
    private String address;
    private String birth;
    private int accNo;
    private int pin;
    private double balance;
    private boolean sp = false;


    public currentAccount(){

    }


    public currentAccount(String name, String address, String birth, int accNo, int pin){
        this.name = name;
        this.address = address;
        this.birth = birth;
        this.balance = 0.0;
        this.accNo = accNo;
        this.pin = pin;




    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getAccNo() {
        return accNo;
    }

    public boolean isSp() {
        return sp;
    }

    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposit " + amount + " successful");
    }

    public void withdraw(double amount) {
        withdrawAccountCheck wck = new withdrawAccountCheck();
        if (check(amount)||(this.getClass().getName() == "vo.currentAccount" && wck.withdrawCheck(amount,this))) {
            balance = balance - amount;
            System.out.println("Withdraw " + amount + " successfull.");
        }
    }

    public boolean check(double amount) {
        boolean allowed = false;
        if (balance - amount >= 0) {
            allowed = true;
        } else {
            System.out.println("Do not have enough available funds. You only have "+balance+" dollars in your account.");
        }
        return allowed;
    }


    public boolean checkClose(){

        if(balance == 0.0){
            return true;
        }
        else return false;

    }



    public void suspend(){sp = true;}
    public void resume(){sp = false;}



    @Override
    public void requestWithdrawal(int datecheck) {

    }

    @Override
    public void requestWithdrawal() {

    }

    @Override
    public boolean withdrawalCheck() {
        return true;
    }
}
