public class Student extends Human {
    private int kursNumber;

    public Student(int age, String name, int kursNumber) {
        super(age, name);
        this.kursNumber = kursNumber;
    }

    public Student(int kursNumber) {
        this.kursNumber = kursNumber;
    }

    public Student() {

    }



    public int getKursNumber() {
        return kursNumber;
    }

    public void setKursNumber(int kursNumber) {
        this.kursNumber = kursNumber;
    }

    @Override
    public String toString() {
        return "Student{"+super.toString()+
                "kursNumber=" + kursNumber +
                '}';
    }
}
