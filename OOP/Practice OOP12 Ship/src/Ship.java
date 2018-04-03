public class Ship {

    private String name;
    private int boxCapacity;

    public Ship(String name, int boxCapacity) {
        this.name = name;
        this.boxCapacity = boxCapacity;
    }

    public Ship() {
    }

    public String getName() {
        return name;
    }



    public void setName(String name) {
        this.name = name;
    }

    public int getBoxCapacity() {
        return boxCapacity;
    }

    public void setBoxCapacity(int boxCapacity) {
        this.boxCapacity = boxCapacity;
    }
}
