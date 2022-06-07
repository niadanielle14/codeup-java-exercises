import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {

// 1.
        double pi = 3.14159;
        String piString = "The value of pi is approximately";
        System.out.format("%s  %.2f%n", piString,pi);
//OR
//        System.out.printf("The value of pi is approximately %.2f", pi);

// 2. Prompt a user to enter a integer and store that value in an int variable using the nextInt method.
        //        System.in = terminal inout

        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter an integer: ");
//        int nextInt = scanner.nextInt();
//        System.out.println(nextInt);

//What happens if you input something that is not an integer?
//        - when using nextInt, it will only accept an interger.

//3. Prompt a user to enter 3 words, and store each of them in a separate variable. Then, display them back in the console, each on a newline.

//        System.out.println("Enter three words:");
//        System.out.println("Enter the first word:");
//        String firstWord = scanner.next();
//        System.out.println("Enter the second word:");
//        String secondWord = scanner.next();
//        System.out.println("Enter the third word:");
//        String thirdWord = scanner.next();
//        System.out.printf("%s, %s, %s ", firstWord, secondWord, thirdWord);
//        System.out.println("");
//
//        .next() is only going to display one word of the sentence. .nextline() is going to display the whole sentence.
        System.out.println("Enter a sentence: ");
        String helloSentence = scanner.nextLine();
        System.out.printf(helloSentence);
//        System.out.printf("%s%n", helloSentence);


        System.out.println("Enter the length of your classroom:");
        String length = scanner.nextLine();
        System.out.println("Enter the width of your classroom:");
        String width = scanner.nextLine();
        int perimeter = (Integer.parseInt(width) + Integer.parseInt(length)) * 2;
        System.out.printf("The perimeter of your classroom is %d%n", perimeter);

//        USING FLOAT
//        System.out.println("Enter the length of the room: ");
//        float length = scanner.nextFloat();
//        System.out.println("Enter the width of the room: ");
//        float width = scanner.nextFloat();
//        System.out.println("Enter the height of the room: ");
//        float height = scanner.nextFloat();
//        System.out.println("The perimeter of the room is " + (length * 2 + width * 2));
//        System.out.println("The area of the room is " + (length * width));
//        System.out.println("The volume of the room is " + (length * width * height));


    }
}
