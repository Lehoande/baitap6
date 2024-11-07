import java.util.Scanner;

public class CountOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so phan tu trong mang: ");
        int size = scanner.nextInt();
        
        int[] numbers = new int[size];
        
        System.out.println("Nhap cac phan tu cua mang:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.print("Nhap phan tu can dem: ");
        int target = scanner.nextInt();

        int count = 0;
        for (int number : numbers) {
            if (number == target) {
                count++;
            }
        }

        System.out.println("So lan xuat hien cua " + target + " trong mang: " + count);
    }
}
