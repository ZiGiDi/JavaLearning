/**
 * Created by ZiGiDi on 13.01.2018.
 */
public class Cat {
    private String name;
    private  int age;
    private  int mass;

    public Cat(String name, int age, int mass) {
        this.name = name;
        this.age = age;
        this.mass = mass;
    }

    public Cat() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMass() {
        return mass;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", mass=" + mass +
                '}';
    }
}
