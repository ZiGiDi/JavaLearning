/**
 * Created by ZiGiDi on 19.02.2018.
 */
public class Cat {

    private String name;
    private int age;
    private  String coor;

    public Cat(String name, int age, String coor) {
        this.name = name;
        this.age = age;
        this.coor = coor;
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

    public String getCoor() {
        return coor;
    }

    public void setCoor(String coor) {
        this.coor = coor;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", coor='" + coor + '\'' +
                '}';
    }


}
