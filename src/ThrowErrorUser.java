class UserDefindException extends Exception {
    public UserDefindException(String str) {
        super(str);
    }
}

public class ThrowErrorUser {
    public static void main(String[] args) {
        try {
            throw new UserDefindException("This is user defined exception");//throws the error
        } catch (UserDefindException u) {
            System.out.println("Caught the exception");//catches the error
        }
    }
}
