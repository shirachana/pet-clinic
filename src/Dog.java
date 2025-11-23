//the dog is the subclass of pet
public class Dog extends Pet{
    private final String breed;


    public Dog(String name, int age, String breed) {
        super(name, age, "Dog");//sent to the constructor of the parent class
        if(breed == null ||breed.isBlank())throw new IllegalArgumentException("Breed is null or blank");//cant be null
        this.breed = breed;
    }
    //getter func
    public String getBreed() {return breed;}
    //method overriding
    @Override
    public String makeSound() {return "Bark";}

    @Override
    public String eat() {return "Dog food";}

    @Override
    protected String reportDetails() { return "breed=" + getBreed(); }
}
