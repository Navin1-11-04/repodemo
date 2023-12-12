import java.util.*;

public class ExceptionHandling {
    //ARITMETIC EXCEPTION HANDELING
    public static void main(String[] args) {
        try {

            int data = 50 / 0;
            System.out.println("Try block after exception");
        } catch (ArithmeticException axe) {
            System.out.println(axe);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(("welcome to Exceptions"));


        /*finally {
            System.out.println(("welcome to Exceptions"));
        }*/
    }
}