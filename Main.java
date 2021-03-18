package extra;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many pets do you have? ");
        int numPets = input.nextInt();
        ArrayList<String> petNames = new ArrayList<>();
        ArrayList<String> petType = new ArrayList<>();
        for(int i = 1; i <= numPets; i++) {
            System.out.print("Enter type for pet " + i + ": ");
            String type = input.next();
            petNames.add(type);
            System.out.print("Enter name for pet " + i + ": ");
            String name = input.next();
            petNames.add(name);
        }
        petNames.toString();
    }
}
