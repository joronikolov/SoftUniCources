package PetClinics;

public class Pet {
    private String name;
    private int age;
    private String kind;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getKind() {
        return kind;
    }

    public Pet(String name, int age, String kind) {
        this.name = name;
        this.age = age;
        this.kind = kind;
    }
}
