/**
 * Created by ZiGiDi on 07.01.2018.
 */
public class Animals {
    private int age;
    private double weight;
    private boolean sex;
    private String ration;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getRation() {
        return ration;
    }

    public void setRation(String ration) {
        this.ration = ration;
    }

    public Animals(int age, double weight, boolean sex, String ration) {
        this.age = age;
        this.weight = weight;
        this.sex = sex;
        this.ration = ration;
        System.out.println("Animal create");
    }

    public Animals() {
    }

    public void getVoice(){

    }

    @Override
    public String toString() {
        return "Animals{" +
                "age=" + age +
                ", weight=" + weight +
                ", sex=" + sex +
                ", ration='" + ration + '\'' +
                '}';
    }
}
