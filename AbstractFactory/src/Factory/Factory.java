/*
 * Alt + Shift + F to indent lines.
 */
package Factory;
import Account.Account;
import Logger.Logger;
import Util.AccountType;
import Util.LoggerType;

/**
 *
 * @author Vinayak
 */
public interface Factory {
    default Account getAccount(AccountType type){
        return null;
    }
    default Logger getLogger(LoggerType type){
        return null;
    }
}
