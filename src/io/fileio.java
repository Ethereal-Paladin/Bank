package io;
import vo.*;
import java.util.*;
import java.io.*;



/**
 * Created by 空灵骑圣 on 2017/4/18.
 */
public class fileio {




    public ArrayList<currentAccount> readfile() throws Exception{

        ArrayList<currentAccount> account = new ArrayList<currentAccount>();

        File file = new File("data.ser");

        if(file.exists()){

            FileInputStream fs = new FileInputStream("data.ser");
            ObjectInputStream os = new ObjectInputStream(fs);

            Object rc = os.readObject();
            os.close();

            return  (ArrayList<currentAccount>)rc;




        }
        else return account;

    }


    public void writefile(ArrayList<currentAccount> acc) throws Exception{

        FileOutputStream fs = new FileOutputStream("data.ser");
        ObjectOutputStream os = new ObjectOutputStream(fs);

        os.writeObject(acc);

        os.close();

        System.out.println("The data has been successfully saved");



    }










}
