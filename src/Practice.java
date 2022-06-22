import java.util.ArrayList;

public class Practice {
    public static int subtractTen(int number){
        return number - 10;
    }

    public static double average(int[] numbersArray){
        double total = 0;
        for (int number : numbersArray){
            total += number;
        }
        return total / numbersArray.length;
    }
    public static ArrayList<Integer> multiplyAll(int num, ArrayList<Integer> arrList) {
        arrList.replaceAll(integer -> integer * num);
        return arrList;
    }

    public static void main(String[] args) {
        System.out.println(subtractTen(15));
        System.out.println(average(new int[]{1, 3, 5}));
        System.out.println(multiplyAll());
    }


}
