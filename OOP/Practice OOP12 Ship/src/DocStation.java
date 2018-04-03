public class DocStation{

    private boolean isBusy;
    private String name;

    public DocStation(boolean isBusy, String name) {
        this.isBusy = isBusy;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DocStation() {
    }

    public boolean isBusy() {
        return isBusy;
    }

    public void setBusy(boolean busy) {
        isBusy = busy;
    }

    public static synchronized DocStation getFreePort(DocStation[] port){
        for(DocStation ports: port ){
            if(ports.isBusy()==false) {
                ports.setBusy(true);
                return ports;
            }
            } return null;
        }

    }

