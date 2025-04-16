package Projects;
import java.util.Scanner;

// Compound intterest calculator
public class compoundInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double amt;
        double rate;
        double cmp;
        int years;
        double total;

        System.out.print("Enter the principle amount: ");
        amt = scanner.nextDouble();

        System.out.println("Enter the interest rate (in %): ");
        rate = scanner.nextDouble();

        System.out.println("Enter the # of times compounded per year: ");
        cmp = scanner.nextDouble();

        System.out.println("Enter the # of years: ");
        years = scanner.nextInt();

        total = amt * (100 + rate) / 100;

        System.out.println(total);
        
        scanner.close();
    }
}
