/*
 * Alt + Shift + F to indent lines.
 */
package Logger;

/**
 *
 * @author Vinayak
 */
public class FileLogger implements Logger{
    @Override
    public void log(){
        System.out.println("File Logger");
    }
}
