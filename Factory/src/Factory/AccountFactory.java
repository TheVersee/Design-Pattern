/*
 * Alt + Shift + F to indent lines.
 */
package Factory;
import Util.AccountType;
import Account.*;
/**
 *
 * @author Vinayak
 */
public class AccountFactory implements Factory{
    
    public Account getAccount(AccountType type){
        Account account = null;
        switch(type){
            case CURRENT:
                account=new CurrentAccount();
                break;
            case SAVING:
                account=new SavingAccount();
                break;
            default:
                break;
        }
        return account;
    }
}
