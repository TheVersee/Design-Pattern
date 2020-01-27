/*
 * Alt + Shift + F to indent lines.
 */
package Factory;
import Util.FactoryType;
/**
 *
 * @author Vinayak
 */
public class AbstractFactory{
    public Factory getFactory(FactoryType factoryType){
        Factory factory = null;
        switch(factoryType){
            case ACCOUNT:
                factory = new AccountFactory();
                break;
            case LOGGER:
                factory=new LoggerFactory();
                break;
            default:
                break;
        }
        return factory;
    }
}
