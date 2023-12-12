import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Throws {
    public static  void Validate(int age){
        if(age < 18) {
            throw new ArithmeticException("Person not eligible to vote");
        }else{
            System.out.println("Person eligible to vote");
        }
    }
    public static void method() throws FileNotFoundException {
        FileReader file = new FileReader("C:\\Users\\navin\\OneDrive\\Desktop\\questions.txt");
        BufferedReader fileInput = new BufferedReader(file);
        throw new FileNotFoundException();
    }
    public static void main(String args[]){
        //Validate function
        Validate(13);
        System.out.println("Rest of the code");
        //File not found
        try{
            method();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }System.out.println("rest of the code");
    }
}
