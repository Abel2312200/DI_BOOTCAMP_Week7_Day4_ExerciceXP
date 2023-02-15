public class Person {
    private String lastName;
    private String firstName;
    private String age;

    public Person() {
        super();
    }

    public Person(String lastName, String firstName, String age) {
        super();
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void introduce(){
        System.out.println(String.format("Hello, my name is %s %s and I am %d years old.",lastName,firstName,age));
    }
}
