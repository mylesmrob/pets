package extra;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many pets do you have? ");
        int numPets = input.nextInt();
        ArrayList<String> petNames = new ArrayList<>();
        ArrayList<String> petTypes = new ArrayList<>();
        ArrayList<Pet> petObj = new ArrayList<>();
        for(int i = 1; i <= numPets; i++) {
            System.out.print("Enter type for pet " + i + ": ");
            String type = input.next();
            petTypes.add(type);
            System.out.print("Enter name for pet " + i + ": ");
            String name = input.next();
            petNames.add(name);
            switch (type){
                case "dog":
                    petObj.add(new Dog(name));
                    break;
                case "cat":
                    petObj.add(new Cat(name));
                    break;
                case "rabbit":
                    petObj.add(new Rabbit((name)));
                    break;
            }
            petObj.get(i-1).setName(name);
        }
        System.out.println(petTypes.toString());
        System.out.println(petNames.toString());
        for(int i = 0; i < petObj.size(); i++){
            System.out.print(petObj.get(i).getName()+" said ");
            petObj.get(i).speak();
        }
    }
}