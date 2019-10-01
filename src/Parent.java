import java.io.Console;

/**
 * Description  TODO
 *
 * @Author Xiaoxing
 * @Date Created in 2019-09-28 13:27
 * @Version 1.0
 */
public abstract class Parent {
    public static void main(String[] args) {
       Console console=System.console();
       if (console!=null){
           char[] password=console.readPassword();

       }



    }
}
