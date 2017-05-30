import io.*;
import method.*;
import ui.*;
import vo.*;

import java.util.*;



/**
 * Created by 空灵骑圣 on 2017/4/17.
 */
public class mainRun {




    public static void main(String[] args){
        ArrayList<currentAccount> account = new ArrayList<currentAccount>();

        fileio a = new fileio();

        try {

            account = a.readfile();



        }catch (Exception e){
            e.printStackTrace();
        }

        new home(account);


        try {

            a.writefile(account);

        }catch (Exception e){
            e.printStackTrace();
        }



    }



}