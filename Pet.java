package extra;

public class Pet {
    public String name;

    public String getName(){
        return name;
    }

    public void setName(String newName){
        this.name = newName;
    }

    public void speak(){
        System.out.println("?"); //Prints for an unknown animal
    }
}

class Dog extends Pet{

    public Dog(String dogName){
    }

    @Override
    public void speak(){
        System.out.println("Bark");
    }
}

class Cat extends Pet{

    public Cat(String catName){
    }

    @Override
    public void speak(){
        System.out.println("Meow");
    }
}

class Rabbit extends Pet{

    public Rabbit(String rabbitName){
    }

    @Override
    public void speak(){
        System.out.println("Squeak");
    }
}