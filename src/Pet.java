public abstract class Pet {
    private final String name;//final - cant change
    private  int age;//what the pat eat
    protected final String species;//if its protected only the subclasses can access

    protected Pet(String name, int age, String species) {//It doesn't matter if it's protected or public because it's an abstract class, but it's cleaner
    if(name == null || name.isBlank())throw new IllegalArgumentException("name cannot be null or blank");//cant be null
    if(age < 0)throw new IllegalArgumentException("age must be mora than 0");//cant be less than 0
    if(species == null || species.isBlank())throw new IllegalArgumentException("species cannot be null or blank");//cant be null
    this.name = name;
    this.age = age;
    this.species = species;
  }
    //getter functions
    public String getName() {return name;}
    public int getAge() {return age;}
    public String getSpecies() {return species;}

    //abstract methods that will be implemented in subclasses
    public abstract String makeSound();
    public abstract String eat();

    // Hook: Each subtype may return unique details for the report
    // If none—can return an empty string ""
    //I did this because I saw that this could be an additional characteristic for a pet and that it would be desirable to add this to the vet's report.
    protected abstract String reportDetails();


//    //overloading example - it's my addition
//    public String describe() {
//        return String.format("%s (%s, %d)", name, species, age);//return short format
//    }
//    public String describe(boolean verbose) {
//        return verbose
//                ? String.format("Pet{name='%s', age=%d, species='%s'}", name, age, species)//if true return long format if false call the function of the short format
//                : describe();
//    }

}
