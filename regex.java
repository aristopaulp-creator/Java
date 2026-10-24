import java.util.regex.*;
import java.util.Scanner;

public class regex{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Mobile number: ");
        String phnNum = scan.next();
        String numRegex = "\\d{10}";

        System.out.print("Enter E-mail: ");
        String eMail = scan.next();
        String eMailRegex = "^[a-z0-9+_.-]+@[a-z0-9.-]+$";

        if(phnNum.matches(numRegex))
            System.out.println("Valid Mobile Number");
        else
            System.out.println("Invalid Mobile Number");

        if(eMail.matches(eMailRegex))
            System.out.println("Valid E-Mail");
        else
            System.out.println("Invalid E-Mail");
    }
}