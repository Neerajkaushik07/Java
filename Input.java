import java.util.*;
public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input For Single word
        System.out.print("Enter your Name : ");
        String name = sc.next();
        System.out.println(name);
        sc.nextLine();// it is used here because the next case which is sc.nextline is not working properly

        //Input for Multiple World or we can use it as taking input for a line or sentence 
        System.out.print("Enter your Full Name : ");
        String fullname = sc.nextLine();
        System.out.println(fullname);

        //Input for Integer
        System.out.print("Enter your Integer : ");
        int number = sc.nextInt();
        System.out.println(number);

        //Input for Floating point number
        System.out.print("Enter your Floating point number : ");
        float pi = sc.nextFloat();
        System.out.println(pi);

        //Input for Characters
        System.out.print("Enter your Character : ");
        char ch = sc.next().charAt(0);
        System.out.println(ch);        
    }
}