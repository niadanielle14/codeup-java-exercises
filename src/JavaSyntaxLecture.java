public class JavaSyntaxLecture {
    public static void main(String[] args) {

    //        int is like var, let, const
        int weight = 10;
        String breed = "Cavalier King Charles Spaniel";

//        Different way to write the function
//        int weight;
//        String breed;
//
//        weight = 10;
//        breed = "Cavalier King Charles Spaniel"
//
        String name = "Grinch";

        int cutenessFactor;
        cutenessFactor = 10;

        //Sout is like console.log
//        System.out.println(weight);
//        System.out.println(breed);
//
//        System.out.println("Grinch is a " + weight + " pound " + breed);
//
//        if (cutenessFactor > 8){
//            System.out.println(name + " is cute.");
//        } else {
//            System.out.println(name + " is one ugly dog, but I still love it");
//        }

//    Different Data Types
//        Byte/Long
//        byte smol = 12;
//        System.out.println(smol);
//
//        long big = 9000000000L;
//        System.out.println(big);
//
////        big = smol;
////        System.out.println(big);
//
//        smol = (byte) big;
//        System.out.println(smol);
//
////    Float/Double - you only get 7 outputs in a float.
//        float imafloat;
//        double imadouble = 9.01234567890;
//        System.out.println(imadouble);
//        imafloat = (float) imadouble;
//        System.out.println(imafloat);

//        Exercise Time
//        1. Create an int variable named myFavoriteNumber and assign your favorite number to it, then print it out to the console.
//        int myFavoriteNumber = 27;
//        System.out.println(myFavoriteNumber);

//        2. Create a String variable named myString and assign a string value to it, then print the variable out to the console.
//--- nothing will display when ran.

//        String myString = "";
//        System.out.println(myString);

//3. Change your code to assign a character value to myString. What do you notice? Hello World from Nia will display when ran.

//        String myString = "Hello World from Nia";
//        System.out.println(myString);

// 4. Change your code to assign the value 3.14159 to myString. What happens? String is only for strings, numbers can not be displayed.

//        String myString = 3.14159;
//        System.out.println(myString);

//5. Declare an long variable named myNumber, but do not assign anything to it. Next try to print out myNumber to the console. What happens? - you must assign the variable in order to have something displayed.
//
//        long myNumber;
//        System.out.println(myNumber);

//6. Change your code to assign the value 3.14 to myNumber. What do you notice? - it did not display the number
//        long myNumber = 3.14;
//        System.out.println(myNumber);

//7. Change your code to assign the value 123L (Note the 'L' at the end) to myNumber. -- the numbers did display.
//        long myNumber = 123L;
//        System.out.println(myNumber);

//8. Change your code to assign the value 123 to myNumber.

// Why does assigning the value 3.14 to a variable declared as a long not compile, but assigning an integer value does?
//        long myNumber = 123;
//        System.out.println(myNumber);

//9. Change your code to declare myNumber as a float. Assign the value 3.14 to it. What happens? What are two ways we could fix this? - float can not display
//        float myNumber = 3.14;
//        System.out.println(myNumber);
//
//10. What's the difference?
//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);

//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);

//11. cant load the variable with the name class.

//12. Object is the most generic type in Java. You can assign any value to a variable of type Object. What do you think will happen when the following code is run?

//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;
//
//        int three = (int) "three";

//13. Short Hand
        int x = 4;
//        x = x + 5;
//        Short Hand
                x += 5;
        System.out.println(x);

//        int x = 10;
//        int y = 2;
//        x = x / y;
//        y = y - x;

//        Short Hand
//        x /= y;l
//        System.out.println(x);



    }
}
