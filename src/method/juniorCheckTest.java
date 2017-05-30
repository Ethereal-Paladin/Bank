package method;

import vo.currentAccount;

/**
 * Created by 空灵骑圣 on 2017/4/17.
 */
public class juniorCheckTest implements juniorCheck{


    @Override
    public boolean juniorAccountCheck() {
        return true;
    }

    @Override
    public boolean juniorAccountCheck(currentAccount ca) {
        return true;
    }
}
