import java.util.Arrays;
import java.util.Scanner;

public class SortArrayAscending {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so phan tu trong mang: ");
        int size = scanner.nextInt();
        
        int[] numbers = new int[size];
        
        System.out.println("Nhap cac phan tu cua mang:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        Arrays.sort(numbers);

        System.out.println("Mang sau khi sap xep tang dan:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }     
    }
}
