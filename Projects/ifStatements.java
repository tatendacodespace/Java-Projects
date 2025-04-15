package Projects;

import java.util.Scanner;

public class ifStatements {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int age;
        String name;
        boolean isStudent;

        System.out.println("Enter youe name: ");
        name = scanner.nextLine();

        System.out.println("Enter your age: ");
        age = scanner.nextInt();

        System.out.println("Are you a student (true/false)?: ");
        isStudent = scanner.nextBoolean(); 

        if(name.isEmpty()){
            System.out.println("You did not enter your name: ");
        } else{
            System.out.println("Hello " + name);
        }
        if(age >= 18){
            System.out.println("You are an adult");
        }
        
        else if (age < 0) {
            System.out.println("You have not been born yet");
        }
        else if(age == 0){
            System.out.println("You are a baby!");
        }
        else{
            System.out.println("You are a child");
        }

        if(isStudent){
            System.out.println("You are a student");
        } 
        else{
            System.out.println("You are not a student");
        }

        scanner.close();
    }
}
