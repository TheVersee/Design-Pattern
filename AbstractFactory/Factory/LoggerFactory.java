/*
 * Alt + Shift + F to indent lines.
 */
package Factory;
import Util.LoggerType;
import Logger.*;

/**
 *
 * @author Vinayak
 */
public class LoggerFactory implements Factory{
    public Logger getLogger(LoggerType type){
        Logger logger=null;
        switch(type){
            case FILE:
                logger=new FileLogger();
                break;
            case DB:
                logger=new DBLogger();
                break;
            default:
                break;
        }
        return logger;
    } 
}
