import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("inpute list: ");
        int number = input.nextInt();

        int[] numbers = new int[number];

        for (int i = 0; i < number; i++) {
            do {
                System.out.print("Enter number " + (i + 1) + ": ");
                numbers[i] = input.nextInt();

                if (numbers[i] < 0) {
                    System.out.println("please input potertive number.");
                }
            } while (numbers[i] < 0);
        }

        System.out.println("Entered numbers: ");
        for (int i = 0; i < number; i++) {
            System.out.println(numbers[i]);
        }

        input.close();
    }
}
