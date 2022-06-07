import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {

// 1.
        double pi = 3.14159;
        String piString = "The value of pi is approximately";
        System.out.format("%s  %.2f%n", piString,pi);

// 2. Prompt a user to enter a integer and store that value in an int variable using the nextInt method.
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter an integer: ");
//        int nextInt = scanner.nextInt();
//        System.out.println(nextInt);

//What happens if you input something that is not an integer?
//        - when using nextInt, it will only accept an interger.

//3. Prompt a user to enter 3 words, and store each of them in a separate variable. Then, display them back in the console, each on a newline.

//        System.out.println("Enter the first word:");
//        String firstWord = scanner.next();
//        System.out.println("Enter the second word:");
//        String secondWord = scanner.next();
//        System.out.println("Enter the third word:");
//        String thirdWord = scanner.next();
//        System.out.printf("%s, %s, %s ", firstWord, secondWord, thirdWord);
//        System.out.println("");
//
//        System.out.println("Enter a sentence: ");
//        String helloSentence = scanner.nextLine();
//        System.out.println(helloSentence);


        System.out.println("Enter the length of the room: ");
        float length = scanner.nextFloat();
        System.out.println("Enter the width of the room: ");
        float width = scanner.nextFloat();
        System.out.println("Enter the height of the room: ");
        float height = scanner.nextFloat();
        System.out.println("The perimeter of the room is " + (length * 2 + width * 2));
        System.out.println("The area of the room is " + (length * width));
        System.out.println("The volume of the room is " + (length * width * height));



    }
}
