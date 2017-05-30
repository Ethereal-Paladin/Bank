package method;
import vo.*;
/**
 * Created by michaeltang on 2017/5/6.
 */
public class withdrawAccountCheck implements withdrawCheck {


    @Override
    public boolean withdrawCheck(double amount, currentAccount acc) {
        return true;
    }
}
