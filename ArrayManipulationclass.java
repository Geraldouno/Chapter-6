import java.util.Scanner;
import java.util.Random;

public class ArrayManipulationClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
		
		for (int i = 0; i < 10; i++) {
           System.out.print("Enter a number" + (i + 1) + ": ");
           numbers[i] = scanner.nextInt();
        }
		Random random = new Random();
        int randomNumber = random.nextInt(100) + 1; 
        System.out.println("Random number generated: " + randomNumber);
        
        int sumFirstSix = 0;
        int sumLastFour = 0;
        
        for (int i = 0; i < 10; i++) {
            if (i < 6) {
                sumFirstSix += numbers[i]; 
            } 
			else {
                sumLastFour += numbers[i];
            }
        }
        int totalSum = sumFirstSix - sumLastFour;
        
        System.out.println("Total sum after Sum of 1st to 6th - Sum of 7th to 10th is: " + totalSum);
    }
}