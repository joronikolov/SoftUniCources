package EqualityLogic;

public class Person implements Comparable<Person>{
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person o) {
       if(this.equals(o)){
           return 0;
       }
       if(this.getAge()==o.getAge()){
           return this.getName().compareTo(o.getName());
       }
       return Integer.compare(this.getAge(), o.getAge());
    }

    @Override
    public int hashCode() {
        return this.getName().hashCode()*31 + Integer.hashCode(this.getAge());
    }

    @Override
    public boolean equals(Object o){
        if(!o.getClass().equals(this.getClass())){
            return  false;
        }
        if(this==o){
            return true;
        }
        if(this.getAge()==((Person) o).getAge()){
            return this.getName().equals(((Person) o).getName());
        }
        return this.getAge()==((Person) o).getAge();
    }
}
