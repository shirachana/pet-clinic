import java.util.ArrayList;
import java.util.List;

public class PetClinic {
    //overloading example - it's my addition if its only pet - show the details of the pet
//    public static void displayPet(Pet pet) {
//        System.out.println(pet.describe(true));
//        System.out.println("Sound: " + pet.makeSound());
//        System.out.println("Eats: " + pet.eat());
//    }
    //display with Veterinarian
    public static void displayPet(Pet pet, Veterinarian vet) {
        System.out.println(vet.examinePet(pet));
    }

    //test case in the method of the class to demonstrate the functionality
    public static void main(String[] args) {
        //instances of pets and veterinarians, Use lists to manage the pets and display them.
        List<Pet> pets = new ArrayList<>();
        pets.add(new Dog("Rex", 4, "Poodle"));
        pets.add(new Cat("Misty", 2, "Black"));

        Veterinarian generalVet = new GeneralVeterinarian("Alice");
        Veterinarian specialistVet = new SpecialistVeterinarian("Bob", "Cardiology");
        //it's my addition
//        System.out.println("=== PETS ===");
//        for (Pet p : pets) {
//            displayPet(p);
//            System.out.println();
//        }

        System.out.println("=== EXAMINATIONS ===");
        for (Pet p : pets) {
            displayPet(p, generalVet);
            displayPet(p, specialistVet);
            System.out.println();
        }
    }
}