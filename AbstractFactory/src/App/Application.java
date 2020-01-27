/*
 * Alt + Shift + F to indent lines.
 */
package App;
import Factory.AccountFactory;
import Factory.LoggerFactory;
import Account.Account;
import Factory.AbstractFactory;
import Factory.Factory;
import Util.AccountType;
import Logger.Logger;
import Util.FactoryType;
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
        
        
        
        
        //Accessing Factory from an Abstract Factory
        AbstractFactory factory = new AbstractFactory();
        Factory accountFactory = factory.getFactory(FactoryType.ACCOUNT);
        Account currentFactory = accountFactory.getAccount(AccountType.CURRENT);
        currentFactory.accountType();
        
        //Doing same without Refrences(variables) also known as ON THE FLY object
        new AbstractFactory()
                .getFactory(FactoryType.ACCOUNT)
                .getAccount(AccountType.CURRENT)
                .accountType();
    }
}
