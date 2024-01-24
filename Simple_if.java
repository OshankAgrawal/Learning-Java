import java.util.Scanner;

public class Simple_if {
    public static void main(String args[]){
        int age;
        System.out.print("Enter your age...");
        try (Scanner r = new Scanner(System.in)) {
            age=r.nextInt();
        }
        if(age>=18){
            System.out.println("You can vote.");
        }
        System.out.println("Thank you....");
    }
}
