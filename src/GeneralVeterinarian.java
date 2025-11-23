public class GeneralVeterinarian implements Veterinarian {
    private final String name;//the name of the general veterinarian

    public GeneralVeterinarian(String name)
    {
        if(name==null || name.isBlank())throw new IllegalArgumentException("Name cannot be null or blank");//name cant be null
        this.name=name;
    }
    //method overriding
    @Override
    public String getName() {return name;}

    @Override
    public String examinePet(Pet pet)
    {
        String details = pet.reportDetails();//checks if a pet has an additional characteristic and adds it to the report, and if not, indicates it
        String extra = (details == null || details.isBlank()) ? "no extra info" : details;
        return String.format(
                "Dr. %s performs a general check on %s (%s, age %d; %s): listens to heart, checks teeth. Sound: %s. Eats: %s.",
                name, pet.getName(), pet.getSpecies(), pet.getAge(), extra, pet.makeSound(), pet.eat()
        );
    }
}
