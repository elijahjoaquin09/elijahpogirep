
/**
 * Write a description of class Calculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Calculator{
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;
        System.out.print("Enter first number: ");
        num1 = sc.nextInt();
        
        System.out.println("Enter second number: ");
        num2 = sc.nextInt();
        
        System.out.println("Enter which arithmetic operator you want to use(1. Add, 2. Sub, 3. Mul, 4.Div, 5. Mod): ");
        int choice = sc.nextInt();
        int result = 0;
        switch (choice) {
            case 1: 
                result = (num1+num2);
                break;
            case 2: 
                result = (num1-num2);
                break;
            case 3:
                result = (num1*num2);
                break;
            case 4:
                result = (num1/num2);
                break;
            case 5: 
                result = (num1%num2);
                break;
        }
        System.out.println("Answer: "+result);
    }
}