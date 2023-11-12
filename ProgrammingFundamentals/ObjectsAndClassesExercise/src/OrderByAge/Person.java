package OrderByAge;

public class Person {
    private String name;
    private String id;
    private int age;
    public Person(String name, String id, int age) {
        this.name = name;
        this.id=id;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getInfo(){
        return String.format("%s with ID: %s is %d years old.", name, id, age);
    }

}
