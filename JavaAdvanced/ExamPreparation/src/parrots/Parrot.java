package parrots;

public class Parrot {
    private String name;
    private String species;
    private boolean available;

    public Parrot(String name, String species) {
        this.name = name;
        this.species = species;
        this.available=true;
    }
    public boolean isAvailable(){
        return this.available;
    }
    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    @Override
    public String toString() {
        return String.format("Parrot (%s): %s", this.getSpecies(), this.getName());
    }
}
