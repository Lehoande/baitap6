package lecture06;
import java.util.Scanner;

public class Weatheranswer {
    public static void main(String[] args) {
        Scanner Thoitiet = new Scanner(System.in); 
        System.out.print("How many days' temperatures? "); 
        int days = Thoitiet.nextInt(); 
        
        int[] temps = new int[days];
        int sum = 0;
        
        for (int i = 0; i < days; i++) {
            System.out.print("Day " + (i + 1) + "'s high temp: "); 
            temps[i] = Thoitiet.nextInt();
            sum += temps[i];
        }       
        double average = (double) sum / days;
        int count = 0;
        
        for (int i = 0; i < days; i++) {
            if (temps[i] > average) {
                count++;
            }
        }      
        System.out.printf("Average temp = %.1f", average); 
        System.out.println();
        System.out.println(count + " days above average"); 
    }
}
