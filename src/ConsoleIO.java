import java.util.Scanner;
public class ConsoleIO {

    public static void main (String[] args) {
//        String cohort = "Go";
//        String timeOfDay = "afternoon";
//        byte week = 11;
//        float someNumber = 123.456F;
//        System.out.printf("Good %s, %s!%n",timeOfDay, cohort);
//        System.out.printf("This is the %dth week of %s cohort.%n", week, cohort);
////        System.out.printf("Hello, %s! ", cohort);
////        System.out.println("This is not actually going to appear");
//        System.out.printf("The chosen number is %.2f%n", someNumber);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String userInput = scanner.nextLine();
        System.out.printf("Your input was %s", userInput);

//       1. Write a Java program that asks the user for their name, then outputs "Hello, name", using .println, then using .printf



    }
}
