import java.util.Scanner;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        String name;
        int cYear;
        int byear, age;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter your name: ");
            name = sc.nextLine();
            System.out.print("Enter your birth year: ");
            byear = sc.nextInt();
        }

        Date dt = new Date();

        cYear = dt.getYear();
        
        age = (cYear - byear) + 1900;
        
        System.out.println("Hello " + name + ", You are " + age + " years old.");
    }
}
