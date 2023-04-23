import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String name;
        int byear, age;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter your name: ");
            name = sc.nextLine();
            System.out.print("Enter your birth year: ");
            byear = sc.nextInt();
        }
        
        age = 2023 - byear;
        
        System.out.println("Hello " + name + ", You are " + age + " years old.");
    }
}
