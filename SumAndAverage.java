import java.util.Scanner;

public class SumAndAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so phan tu trong mang: ");
        int size = scanner.nextInt();
        
        int[] numbers = new int[size];
        
        System.out.println("Nhap cac phan tu cua mang:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }
        
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        
        double average = (double) sum / size;

        System.out.println("Tong cac phan tu trong mang: " + sum);
        System.out.println("Trung binh cac phan tu trong mang: " + average);

       
    }
}
