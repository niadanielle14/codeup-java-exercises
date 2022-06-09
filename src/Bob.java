import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Say something");
    String userInput = sc.nextLine();

    // if it wnds with ?
    if (userInput.endsWith("?")) {
        System.out.println("sure");
        // ends with !
    } else if (userInput.endsWith("!")) {
        System.out.println("Calm down");
        // empty string
    } else if (userInput.trim().equals("")) {
        System.out.println("That's fine. ");
        //
    } else {
        System.out.println("Whatever.");
    }

    // end s
    }
}
