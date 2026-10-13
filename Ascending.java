
/**
 * pinaka mabangis na ascending order pang bisa yah <3
 *
 * @elijah 
 * @1/13/2026
 */
import java.util.Scanner;

public class Ascending{
    public static void main(String[] args_) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] numbers = new int [n];
        //taking array elemtns from user 
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        //sorting the array in ascending order
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers [j]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        //printing the sorted array
        System.out.println("Array in ascending order: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        sc.close();
    }
}