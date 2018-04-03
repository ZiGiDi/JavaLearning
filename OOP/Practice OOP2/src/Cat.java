/**
 * Created by ZiGiDi on 07.01.2018.
 */
public class Cat extends Animals{
    private String name;
    private String type;

    public Cat(int age, double weight, boolean sex, String ration, String name, String type) {
        super(age, weight, sex, ration);
        this.name = name;
        this.type = type;
        System.out.println("Cat create");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void getVoice() {
        System.out.println("Myau-myau");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +" " + super.toString() +
                '}';
    }
}
