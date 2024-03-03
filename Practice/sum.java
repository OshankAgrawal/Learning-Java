import java.util.*;

public class sum {
    public static void main (String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the first number: ");
            int num1 = sc.nextInt();
            System.out.println("Enter the second number: ");
            int num2 = sc.nextInt();
            int sum = num1 + num2;
            System.out.print("Sum is "+sum);
        }
    }
}
