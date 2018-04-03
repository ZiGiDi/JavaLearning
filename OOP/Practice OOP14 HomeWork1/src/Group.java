import java.io.*;

public class Group implements Serializable {
    private String faculty;
    private Student[] studentArray;

    public Group(String faculty, Student[] studentArray) {
        this.faculty = faculty;
        this.studentArray = studentArray;
    }

    public Group() {
    }

    public Student[] getStudentArray() {
        return studentArray;
    }

    public void setStudentArray(Student[] studentArray) {
        this.studentArray = studentArray;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }


    public void printGroup() {

      System.out.println();
        System.out.println("Faculty "+ faculty + " consist of:");
        for(Student st:studentArray){
            System.out.println(st);
        }
        System.out.println();
    }

    public void saveData(String name, Group gr){
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(name))) {
            oos.writeObject(this);
            System.out.println("All Data saved");
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public  Group restoreData(String name){
         Group gr = null;
        try(ObjectInputStream ois = new ObjectInputStream((new FileInputStream(name)))){

            System.out.println("All Data restore");
            gr =  (Group) ois.readObject();

        }catch (IOException| ClassNotFoundException e){
            e.printStackTrace();
        }
        return gr;
    }

}
