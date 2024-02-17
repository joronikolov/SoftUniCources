package ComparingObjects;

public class Person implements Comparable{
    private String name;
    private int age;
    private String town;

    public Person(String name, int age, String town){
        this.name=name;
        this.age=age;
        this.town=town;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getTown() {
        return town;
    }

    @Override
    public int compareTo(Object o) {
        if(o.equals(this)){
            return 0;
        } else {
            Person compObject = (Person) o;
            if(this.getName().equals(compObject.getName())){
                if(this.getAge()==compObject.getAge()){
                    return this.getTown().compareTo(compObject.getTown());
                }
                return Integer.compare(this.getAge(), compObject.getAge());
            }
            return this.getName().compareTo(compObject.getName());
        }
    }
}
