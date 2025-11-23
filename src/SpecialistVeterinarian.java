//I was debating whether to make the special vet extends
// from the regular vet so that it would be more correct in terms of design,
// but I implemented it according to the diagram we provided.
public class SpecialistVeterinarian implements Veterinarian {
    private final String name;
    private final String specialty;//another feature

    public SpecialistVeterinarian(String name, String specialty)
    {
        if(name == null || name.isBlank()) throw new IllegalArgumentException("name is required");
        if(specialty == null || specialty.isBlank())throw new IllegalArgumentException("specialty cannot be null or blank");
        this.name = name;
        this.specialty = specialty;
    }
    //getter func
    public String getSpecialty() {return specialty;}
    //method overriding
    @Override
    public String getName() { return name; }
    @Override
    public String examinePet(Pet pet)//runtime polymorphism
    {
        String details = pet.reportDetails();//checks if a pet has an additional characteristic and adds it to the report, and if not, indicates it
        String extra = (details == null || details.isBlank()) ? "no extra info" : details;
        return String.format(
                "Dr. %s (Specialist in %s) conducts a specialized exam for %s (%s, age %d; %s): advanced diagnostics. Sound: %s. Diet: %s.",
                getName(), getSpecialty(), pet.getName(), pet.getSpecies(), pet.getAge(), extra, pet.makeSound(), pet.eat()
        );
    }
}
