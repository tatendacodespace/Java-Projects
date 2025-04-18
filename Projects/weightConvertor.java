package Projects;
import java.util.Scanner;

public class weightConvertor {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        //Declaare variables
        double weight;
        double newWeight;
        int choice;

        //welcome messege
        System.out.println("Weight Conversion Program");
        System.out.println("1: Convert lbs to kgs");
        System.out.println("2: Convert kgs to lbs");

        System.out.print("Choose an option; ");
        choice = scanner.nextInt();

        //option 1 convert lbs to kgs
        if( choice == 1 ){
            System.out.println("Enter the weight in lbs: ");
            weight = scanner.nextDouble();
            newWeight = weight * 0.453592;
            System.out.printf("The new weight in kgs is: %.2f", newWeight);
        }
        else if(choice == 2){
            System.out.println("Enter the weight in kgs: ");
            weight = scanner.nextDouble();
            newWeight = weight * 2.20462;
            System.out.printf("The new weight in lbs is: %.2f", newWeight);
        }
        else{
            System.out.println("You entered a invalid choice");
        }

        scanner.close();

        // else print not a valid choice
    }
    
}
