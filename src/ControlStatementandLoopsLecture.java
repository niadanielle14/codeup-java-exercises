import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;


public class ControlStatementandLoopsLecture {
    public static void main(String[] args) {
//        Print Line Method - I want you to output the following to the terminal
//        System.out.println("Out put this to the terminal"); - this is a Statement.
//                The funadmental programming components:
//        1. Statements or "Do Something"
//        2. Decisions or Conditionals - or do something under a certain condition
//        3. Loops - or "do something again and again"

//        System.out.println("Output this");

//        int x = 4;
//
//        if (x == 5){
//            System.out.println("If you are seeing this, x must be 5");
//        } else {
//            System.out.println("If you are seeing this, x is not 5");
//        }
//        System.out.println("This will run regardless of the value x");

        short x = 30001;
//        int y = 12;
//        int z = 3000;

        if (x < 0) {
            System.out.println("If you are seeing this, the var x is neg");
        } else if (x >= 0 && x < 30000) {
            System.out.println("If you are seeing this, he var x is pos");
        } else {
            System.out.println("The var x is approaching " + Short.MAX_VALUE);
        }


//        SWITCH STATEMENTS - no boolean testing (or || operator)
        String customerChoice;
        Scanner scanner = new Scanner(System.in);
//        System.out.println("What flavor ice cream do you want?");
//        customerChoice = scanner.nextLine();

//        ADD OLD SCHOOL SWITCH STATEMENT HERE

//        ENHANCED SWITCH STATEMENT
//        switch (customerChoice) {
//            case "vanilla" -> System.out.println("One Vanilla coming right up");
//            case "Chocolate" -> System.out.println("One Chocolate coming right up");
//            case "Strawberry" -> System.out.println("One Strawberry coming right up");
//            default -> System.out.println("Sorry, we dont have that flavor.");
//        }


        int c = 0, d = 100, e = 50;
        if (c == 0 && e++ < 100){
            d = 150;
        }
        System.out.println("d = " + d);
        System.out.println("e = " + e);
    }
}
