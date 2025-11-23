//the cat is the subclass of pet
public class Cat extends Pet{
    private final String color;


    public Cat(String name, int age, String color) {
        super(name, age, "Cat");//sent to the constructor of the parent class
        if(color == null ||color.isBlank())throw new IllegalArgumentException("color is null or blank");
        this.color = color;
    }
    //getter func
    public String getColor() {return color;}
    //method overriding
    @Override
    public String makeSound() {return "Meow";}

    @Override
    public String eat() {return "Cat food";}

    @Override
    protected String reportDetails() { return "color=" + getColor(); }
}
