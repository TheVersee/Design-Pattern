/*
 * Alt + Shift + F to indent lines.
 */
package App;
import Factory.AccountFactory;
import Factory.LoggerFactory;
import Account.Account;
import Util.AccountType;
import Logger.Logger;
import Util.LoggerType;
/**
 *
 * @author Vinayak
 */
public class Application {
    public static void main(String[] args) {
        //Accessing Classes and Functions from a Factory
        AccountFactory acFactory=new AccountFactory();
        Account currentaccount=acFactory.getAccount(AccountType.CURRENT);
        currentaccount.accountType();
        
        LoggerFactory loFactory =new LoggerFactory();
        Logger dbLogger = loFactory.getLogger(LoggerType.DB);
        dbLogger.log();
    }
}
