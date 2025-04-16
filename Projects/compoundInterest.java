package Projects;
import java.util.Scanner;

// Compound intterest calculator
public class compoundInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double amt;
        double rate;
        int cmp;
        int years;
        double total;

        System.out.print("Enter the principal amount: ");
        amt = scanner.nextDouble();

        System.out.print("Enter the interest rate (in %): ");
        rate = scanner.nextDouble() / 100;

        System.out.print("Enter the # of times compounded per year: ");
        cmp = scanner.nextInt();

        System.out.println("Enter the # of years: ");
        years = scanner.nextInt();

        total = amt * Math.pow(1 + rate / cmp, cmp * years);

        System.out.println("The amount after " + years + " is: R" +total);
        
        scanner.close();
    }
}
