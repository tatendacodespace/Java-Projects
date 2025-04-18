package Projects;
import java.util.Scanner;

public class temperatureConvertor {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        double temp;
        double newTemp;
        String unit;

        System.out.println("Enter the temperature: ");
        temp = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Convert to Celsius or Fahrenheit? (C or F)");
        unit = scanner.nextLine();

        if(unit.equalsIgnoreCase("C")){
            
            newTemp = (temp - 32) * 5 / 9;
            System.out.println(newTemp + unit);
        } 
        else if(unit.equalsIgnoreCase("F")){

            newTemp = (temp * 5 / 9) + 32;
            System.out.println(newTemp + unit);
        }
        else {
            System.out.println("Invalid unit Entered");
        }
        scanner.close();
    }
}
