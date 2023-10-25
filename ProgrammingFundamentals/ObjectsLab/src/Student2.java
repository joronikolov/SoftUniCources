public class Student2 {
    String firstName;
    String lastName;
    int age;
    String HomeTown;

    public Student2(String firstName, String lastName, int age, String homeTown) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        HomeTown = homeTown;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getHomeTown() {
        return HomeTown;
    }

    public String getInfo(){
        return String.format("%s %s is %d years old%n", firstName, lastName, age);
    }
}
