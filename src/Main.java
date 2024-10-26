import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("количество элементов массива:");
        int[] myArray = new int[scan.nextInt()];

        System.out.println("Введите элементы массива:");
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = scan.nextInt();
        }


        int sum = 0;

        for (int i = 0; i < myArray.length ; i++) {

            sum += myArray[i];

        }
        if (sum >=0){
        System.out.println("yes ");}
        else {
            System.out.println("not");
        }
    }
}