package Study1103;

public class Person {

    private String name;
    private int age;

    public void Person() {

    }

    public void Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("이름 : " + this.name + "\n나이 : " + this.age);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
