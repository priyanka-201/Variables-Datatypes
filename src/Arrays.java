import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] numbers = new int[size];
        System.out.println("Enter the number at index");
        for (int i = 0; i < size; i++) {
            //System.out.println("Enter the number at index");
            numbers[i] = s.nextInt();
        }
        for (int i = 0; i < size; i++) {
            System.out.println("The element at index :" + i + "is" + numbers[i]);
        }
    }
}
