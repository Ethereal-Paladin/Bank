package vo;

/**
 * Created by 空灵骑圣 on 2017/4/17.
 */
public interface withdrawalNotice {

    public abstract void requestWithdrawal(int datecheck);
    public abstract void requestWithdrawal();
    public abstract boolean withdrawalCheck();
}
