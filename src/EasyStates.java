import java.util.Scanner;

public class EasyStates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int posCount = 0;
        int negCount = 0;
        int total = 0;
        int num;

        System.out.print("Enter an integer (0 to end): ");
        num = scanner.nextInt();

        if (num == 0) {
            System.out.println("No numbers were entered except 0.");
            return;
        }

        while (num != 0) {
            if (num > 0) {
                posCount++;
            } else if (num < 0) {
                negCount++;
            }

            total += num;

            System.out.print("Enter an integer (0 to end): ");
            num = scanner.nextInt();
        }

        int count = posCount + negCount;
        double average = (double) total / count;

        System.out.println("\nThe number of positives is " + posCount);
        System.out.println("The number of negatives is " + negCount);
        System.out.println("The total is " + total);
        System.out.println("The average is " + average);
    }
}
